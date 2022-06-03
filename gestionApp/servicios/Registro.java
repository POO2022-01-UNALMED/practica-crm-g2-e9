package gestionApp.servicios;

import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;


import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
	private static final long serialVersionUID = 1L;
	
		////////////////////////////////////////////////////////////////REGISTRO///////////////////////////////////////////////
   
    public static Empleado registrarEmpleado(String nombre, int cedula, String cel, String correo, String cargo, String fechaInicioContrato) {
		Empleado empleado = new Empleado(nombre,cedula,cel ,correo,cargo,fechaInicioContrato);
     	return empleado;
    }
    
    
    public static void registrarCliente(String nombre, int cedula, String cel, String correo , String cargo, Boolean activo,int nit) {

    	Empresa emp = buscarEmpresas(nit);
    	if (emp != null) {
    		new Cliente(nombre, emp, cedula, cel, correo, cargo, activo);
    	}
		else{
			new Cliente(nombre, cedula, cel, correo, activo,cargo);
			//Acepta los cambios
		}
    }
    public static Empresa registrarEmpresa(String nombre, int nit, String descripcion){
        Empresa empresa= new Empresa (nombre, nit, descripcion);
        return empresa;
    }

    
    public static void registrarPromocion(double descuento , String nombre){
    	Servicio ser = buscarServicios(nombre);
    	if (ser != null) {
    		new Promocion(descuento,ser);
    	}
		else{
			new Promocion(descuento);
		
		}

    }
	
    public static Servicio registrarServicios(String nombreServicios, int valorProducto, String tipo, String descripcion){
    	Servicio servicio = new Servicio(nombreServicios,valorProducto, tipo, descripcion);   	
    	return servicio;
 }	
	public static Negocio registrarNegocio(Empleado empleadoEncargado, Cliente cliente, int valorVenta){
		Negocio negocio = new Negocio(empleadoEncargado, cliente, valorVenta);   	
		return negocio;
	}
 		////////////////////////////////////////////////////////////////REGISTRO///////////////////////////////////////////////

		public static Empleado buscarEmpleado(String id) {
			listaEmpleados();
			for(int i = 0; i < Empleado.getAllEmpleados().size(); i++){
				if(Empleado.getAllEmpleados().get(i).getId() == id)
					return Empleado.getAllEmpleados().get(i);
		}
			return null;
	}
		
		public static Cliente buscarCliente(int cedula){
			for(int i = 0; i < Cliente.getAllClientes().size(); i++){
				if(Cliente.getAllClientes().get(i).getCedula() == cedula)
					return Cliente.getAllClientes().get(i);
		}
			return null;
				}
	
		public static Empresa buscarEmpresas(int nit){
			for(int i = 0; i < Empresa.getAllEmpresas().size(); i++){
				if(Empresa.getAllEmpresas().get(i).getNit() == nit)
					return Empresa.getAllEmpresas().get(i);
		}
			return null;
				}
		public static Negocio buscarNegocios(String id)  {
			for(int i = 0; i < Negocio.getNegocios().size(); i++){
				if(Negocio.getNegocios().get(i).getId() == id)
					return Negocio.getNegocios().get(i);
					}
			return null;
				}
		public static void buscarClientesEmpresa(int nit) {
			Empresa empre =buscarEmpresas(nit);
			if (empre != null) {
				for(int i = 0; i < empre.getClientes().size(); i++) {
					System.out.println(empre.getClientes().get(i).getNombre());
				}
			}else{
				System.out.println("No existe la empresa");
			}
		}
    	
		public static Servicio buscarServicios(String id){
			for(int i = 0; i < Servicio.getAllServicios().size(); i++){
				if(Servicio.getAllServicios().get(i).getNombre() == id)
					return Servicio.getAllServicios().get(i);
		}
			return null;
				}			


    	////////////////////////////////////////////////////////////////BUSQUEDAS///////////////////////////////////////////////

    public static void listaEmpresas(){
    	ArrayList<Empresa> empresas = Empresa.getAllEmpresas();

		for(int i = 0; i < empresas.size(); i++){
			System.out.println(empresas.get(i).toStringEmpresas());
			
    		}
    	}
		public static void listaClientes() {
			ArrayList<Cliente> clientes = Cliente.getAllClientes();
			for(int i = 0; i < clientes.size(); i++){
		
				System.out.println(clientes.get(i).toStringClientes());
			}
				
		}
		public static void listaEmpleados() {
			ArrayList<Empleado> empleados = Empleado.getAllEmpleados();
			for(int i = 0; i < empleados.size(); i++){
		
				System.out.println(empleados.get(i).toStringEmpleado());
			}
				
		}
		public static void listaServicios() {
			ArrayList<Servicio> servicios = Servicio.getAllServicios();
			for(int i = 0; i < servicios.size(); i++){
				System.out.println(servicios.get(i).toStringListasServicios());
			}
				
		}
		

	    public static void negociosEmpresa(int nit) {
	    	Empresa emp = buscarEmpresas(nit);
	    	
	    	for(int i = 0; i < emp.getNegociosAbiertos().size(); i++) {
	    		System.out.println(emp.getNegociosAbiertos().get(i).toString());
	    		}
	    }
		
	  
	
    ///////////////////////////////////////////////////////////////ELIMINAR//////////////////////////////////////////////////
    public static void eliminarEmpresa(int nit) { 
    	Empresa empresa = buscarEmpresas(nit);
    	int posicion = Empresa.getAllEmpresas().indexOf(empresa);
		String empresaEliminada = empresa.toString();
    	if (!Empresa.getAllEmpresas().isEmpty()){
        	Empresa.getAllEmpresas().remove(posicion);
			System.out.println("La siguente Empresa se ha eliminado" + empresaEliminada);
			}

    	else
    		System.out.println("No existe esa Empresa");

    }

	public static void eliminarCliente(int cedula) {
			Cliente cliente = buscarCliente(cedula);
			String clienteEliminado  = cliente.toString();
			for(int i = 0; i < Cliente.getAllClientes().size(); i++) {
				if(Cliente.getAllClientes().get(i).getCedula()== cedula) {
					Cliente.getAllClientes().remove(Cliente.getAllClientes().get(i));
					Empresa empresaAso=Cliente.getAllClientes().get(i).getEmpresa();
					System.out.println("El siguente Cliente se ha eliminado" + clienteEliminado);
					String clienteAsoEliminado = empresaAso.toString();
					for(int j = 0; j < empresaAso.getClientes().size(); j++) {
						if(empresaAso.getClientes().get(j).getCedula()== cedula) {
							empresaAso.getClientes().remove(empresaAso.getClientes().get(j));
							System.out.println("\nEl se ha Eliminado de la siguiente empresa " + clienteAsoEliminado);
						}else
							System.out.println("No existe este Cliente");

					}	
					
				}else
					System.out.println("No existe este Cliente");	
			}			
	}
	public static void eliminarEmpleado(String id) {
		Empleado empleado = buscarEmpleado(id);
		String empleadoEliminado = empleado.toString();
		
		for(int i = 0; i < Empleado.getAllEmpleados().size(); i++) {
			if(Empleado.getAllEmpleados().get(i).getId()== id) {
				Empleado.getAllEmpleados().remove(Empleado.getAllEmpleados().get(i));
				System.out.println("La siguente Empleado se ha eliminado" + empleadoEliminado);

			}else
				System.out.println("No existe este Empleado");
			}	
	}
	
	//////////////////////////////////////////////////////// INFO///////////////////////////////////////////////////////
	public static void infoEmpresa(int nit) {
		Empresa empresa = buscarEmpresas(nit);
		System.out.println(empresa.toString());
	}
    public static void infoCliente(int cedula) {
		Cliente cliente = buscarCliente(cedula);
		System.out.println(cliente.toString());
    }
	
	public static void infoEmpleado(String id) {
		Empleado empleado = buscarEmpleado(id);
		System.out.println(empleado.toString());
	}
	
	public static void infoServicio(String id) {
		Servicio servicio = buscarServicios(id);
		System.out.println(servicio.toStringServicio());
	}



}
