package gestionApp.servicios;

import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;


import java.util.ArrayList;

public class Registro {
	
	

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


		////////////////////////////////////////////////////////////////BUSQUEDAS///////////////////////////////////////////////
		public static Empleado buscarEmpleado(String id) {
			for(int i = 0; i < Empleado.getAllEmpleados().size(); i++){
				if(Empleado.getAllEmpleados().get(i).getId() == id)
					System.out.println(Empleado.getAllEmpleados().get(i).getEmpresa().getNombre());
					return Empleado.getAllEmpleados().get(i);
		}
			return null;
	}
		
		public static Cliente buscarCliente(String id){
			for(int i = 0; i < Cliente.getAllClientes().size(); i++){
				if(Cliente.getAllClientes().get(i).getId() == id)
					System.out.println(Cliente.getAllClientes().get(i).getEmpresa().getNombre());
					return Cliente.getAllClientes().get(i);
		}
			return null;
				}
	
		public static Empresa buscarEmpresas(int nit){
			for(int i = 0; i < Empresa.getAllEmpresas().size(); i++){
				if(Empresa.getAllEmpresas().get(i).getNit() == nit)
					System.out.println(Empresa.getAllEmpresas().get(i).getNombre());
					return Empresa.getAllEmpresas().get(i);
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
    	
		public static Servicio buscarServicios(String nombre){
			for(int i = 0; i < Servicio.getAllServicios().size(); i++){
				if(Servicio.getAllServicios().get(i).getNombre() == nombre)
					return Servicio.getAllServicios().get(i);
		}
			return null;
				}

    	////////////////////////////////////////////////////////////////BUSQUEDAS///////////////////////////////////////////////
    
		////////////////////////////////////////////////////////////////LISTAS/////////////////////////////////////////////////
    

    


    public static void listaEmpresas( ){
    	ArrayList<Empresa> empresas = Empresa.getAllEmpresas();

		for(int i = 0; i < empresas.size(); i++){
		
			System.out.println("\nNombre Empresa: "+empresas.get(i).getNombre()+
			"\nDescripcion Empresa" + empresas.get(i).getDescripcion() +
			"\nNit Empresa: " + empresas.get(i).getNit());
			
			
    		}
    	}
		public static void listaClientes() {
			ArrayList<Cliente> clientes = Cliente.getAllClientes();
			for(int i = 0; i < clientes.size(); i++){
		
				System.out.println("\nNombre Cliente: "+clientes.get(i).getNombre()+
				"\nID del Cliente: " + clientes.get(i).getId()+
				"\nActividad del Cliente: " + clientes.get(i).isActivo()+
				"\n Empresa a la que pertenece: " + clientes.get(i).toStringEmpresa());
			}
				
		}
		public static void listaEmpleados() {
			ArrayList<Empleado> empleados = Empleado.getAllEmpleados();
			for(int i = 0; i < empleados.size(); i++){
		
				System.out.println("\nNombre Empleados: "+empleados.get(i).getNombre()+
				"\nID del Empleados: " + empleados.get(i).getId()+
				"\nNegocios del Empleado: " + empleados.get(i).getNegociosEmpleado()+
				"\n Empresa a la que pertenece: " + empleados.get(i).getNegociosEmpleado());
			}
				
		}
		////////////////////////////////////////////////////////////////LISTAS/////////////////////////////////////////////////


    public static ArrayList<Cliente> getClientes() {
        return getClientes();
    }

    public static void eliminarEmpresa(int nit) { 
    	Empresa empleado = buscarEmpresas(nit);
    	int posicion = Empresa.getAllEmpresas().indexOf(empleado);
    	if (!Empresa.getAllEmpresas().isEmpty())
        	Empresa.getAllEmpresas().remove(posicion);
    	else
    		System.out.println("No existe esa empresa");

    	
    }



	public static void eliminarCliente(String id) {
		


			for(int i = 0; i < Cliente.getAllClientes().size(); i++) {
				if(Cliente.getAllClientes().get(i).getId()== id) {
					
					Cliente.getAllClientes().remove(Cliente.getAllClientes().get(i));
					Empresa empresaAso=Cliente.getAllClientes().get(i).getEmpresa();
					for(int j = 0; j < empresaAso.getClientes().size(); j++) {
						if(empresaAso.getClientes().get(j).getId()== id) {
							empresaAso.getClientes().remove(empresaAso.getClientes().get(j));
						}
						
					}
					
				}
			}
					
					
	}


    public static void infoCliente(String id) {
		Cliente cliente = buscarCliente(id);
		System.out.println(cliente.toString());}
	


	public static void infoEmpleado(String id) {
		Empleado empleado = buscarEmpleado(id);
		System.out.println(empleado.toString());
	}


	public static void eliminarEmpleado(String id) {
	}






    
}
