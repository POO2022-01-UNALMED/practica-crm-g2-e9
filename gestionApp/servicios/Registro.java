package gestionApp.servicios;

import gestionApp.Empresa;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Registro {
	
	
	//registros 
   
    public static Empleado registrarEmpleado(String nombre, int cedula, String cel, String correo, int edad, String cargo, String fechaInicioContrato) {
<<<<<<< Updated upstream
     	Empleado empleado = new Empleado(nombre,cedula,cel ,correo,edad,cargo,fechaInicioContrato);
=======
     	Empleado empleado= new Empleado(nombre,cedula,cel ,correo,edad,cargo,fechaInicioContrato);
>>>>>>> Stashed changes
     	return empleado;
    }
    
    
<<<<<<< Updated upstream
    public static void registrarCliente(int nit,String nombre, int cedula, String cel, String correo, int id, String cargo, Boolean activo) {

    	Empresa emp = buscarEmpresas(nit);
    	if (emp != null) {
    		new Cliente(nombre, emp, cedula, cel, correo, cargo, cargo, activo);
=======
    public static Cliente registrarCliente(int nit, String nombre, int cedula, String cel, String correo, int id, String cargo, Boolean activo) {

    	Empresa emp = buscarEmpresas(nit);
    	if (emp != null) {
    		new Cliente(nombre, emp, cedula, cel, correo, id, cargo, activo).toString();
>>>>>>> Stashed changes
    	}
		else{
			new Cliente(nombre, cedula, cel, correo, cargo, activo);
		}
    }
    public static Empresa registrarEmpresa(String nombre, int nit, String descripcion){
        Empresa empresa= new Empresa (nombre, nit, descripcion);
        return empresa;
    }

    public static Empresa buscarEmpresas(int nit){
    	  
<<<<<<< Updated upstream
    	for(int i = 0; i < Empresa.getEmpresas().size(); i++){
    		if(Empresa.getEmpresas().get(i).getNit() == nit)
    	        //System.out.println(empresas.get(i).getNombre());
    			return Empresa.getEmpresas().get(i);
=======
    	for(int i = 0; i < Empresa.getAllEmpresas().size(); i++){
    		if(Empresa.getAllEmpresas().get(i).getNit() == nit)
    	        //System.out.println(empresas.get(i).getNombre());
    			return Empresa.getAllEmpresas().get(i);
>>>>>>> Stashed changes
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    
    public static Cliente buscarCliente(String id){
  	  
<<<<<<< Updated upstream
    	for(int i = 0; i < Cliente.allClientes.size(); i++){
    		if(Cliente.allClientes.get(i).getId() == id)
    			System.out.println(Cliente.allClientes.get(i).getEmpresa().getNombre());
    			return Cliente.allClientes.get(i);
=======
    	for(int i = 0; i < Cliente.getAllClientes().size(); i++){
    		if(Cliente.getAllClientes().get(i).getID() == id)
    			System.out.println(clientes.get(i).getEmpresa().getNombre());
    			return Cliente.getAllClientes().get(i);
>>>>>>> Stashed changes
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    public static void listaEmpresa(int nit){
    	Empresa empresa = buscarEmpresas(nit);
    	if(empresa != null) {
<<<<<<< Updated upstream
    		for(int i = 0; i < empresa.getEmpresas().size(); i++){
=======
    		for(int i = 0; i < empresa.getClientes().size(); i++){
>>>>>>> Stashed changes
    		
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
