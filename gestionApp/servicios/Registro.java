package gestionApp.servicios;

import gestionApp.Empresa;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Registro {
	
	
	//registros 
   
    public static Empleado registrarEmpleado(String nombre, int cedula, String cel, String correo, int edad, String cargo, String fechaInicioContrato) {
     	Empleado empleado = new Empleado(nombre,cedula,cel ,correo,edad,cargo,fechaInicioContrato);
     	return empleado;
    }
    
    
    public static void registrarCliente(String nombre, int cedula, String cel, String correo , String cargo, Boolean activo,int nit) {

    	Empresa emp = buscarEmpresas(nit);
    	if (emp != null) {
    		new Cliente(nombre, emp, cedula, cel, correo, cargo, activo);
    	}
		else{
			new Cliente(nombre, cedula, cel, correo, cargo, activo);
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


    
    

    
    
    //busquedas
    public static Empresa buscarEmpresas(int nit){
    	  
    	for(int i = 0; i < Empresa.getAllEmpresas().size(); i++){
    		if(Empresa.getAllEmpresas().get(i).getNit() == nit)
    	        //System.out.println(empresas.get(i).getNombre());
    			return Empresa.getAllEmpresas().get(i);
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    
    public static Cliente buscarCliente(String id){
  	  
    	for(int i = 0; i < Cliente.getAllClientes().size(); i++){
    		if(Cliente.getAllClientes().get(i).getId() == id)
    			System.out.println(Cliente.getAllClientes().get(i).getEmpresa().getNombre());
    			return Cliente.getAllClientes().get(i);
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    public static void listaEmpresa(int nit){
    	Empresa empresa = buscarEmpresas(nit);
    	if(empresa != null) {
    		for(int i = 0; i < empresa.getClientes().size(); i++){
    		
    			System.out.println(empresa.getClientes().get(i).getNombre());
    			
    		}
    	}
    	
	    	
    	
    		
    }
    

    public static Servicio buscarServicios(String nombre){
  	  
    	for(int i = 0; i < Servicio.getAllServicios().size(); i++){
    		if(Servicio.getAllServicios().get(i).getNombre() == nombre)
    	        
    			return Servicio.getAllServicios().get(i);
    		
    }
    	return null;
    	
    	    }
    
    	
   
  
    		



    public static ArrayList<Cliente> getClientes() {
        return getClientes();
    }


    public static void eliminarEmpresa() { /////////////////////////////////////// Eliminar Empresa
    }


    public static void buscarClientesEmpresa() {////////////////////////////////////////////////Buscar Clientes por empresa (se ingres NIT) y devulve Clientes asociados a esta empresa
    }


	public static char[] mostrarClientes() {//////////////////////////////////////////////////////Mostrar todos los Clientes solo por ID y Nombre correspondientemente que devuelva Strings para mostrar en el menu
		return null;
	}


	public static void eliminarCliente(String id) {///////////////////////////Eliminar Cliente por ID
	}


    public static void infoCliente() {
    }

    
}
