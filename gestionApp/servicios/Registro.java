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
    
    
    public static void registrarCliente(int nit,String nombre, int cedula, String cel, String correo, int id, String cargo, Boolean activo) {

    	Empresa emp = buscarEmpresas(nit);
    	if (emp != null) {
    		new Cliente(nombre, emp, cedula, cel, correo, cargo, cargo, activo);
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
    	
	    	
    	
    		//-------
    		
    }
    	
   
  
    		
    
    // public static void registrarPromocion(){

    // }
    // public static Servicio registrarServicios(String nombreServicios, int valorProducto, String tipo, String descripcion){
    //     Servicio servicio = new Servicio(nombreServicios,valorProducto, tipo, descripcion);
    //     servicios.add(servicio);
    //     return servicio;
    // }


    public static ArrayList<Cliente> getClientes() {
        return getClientes();
    }

    
}
