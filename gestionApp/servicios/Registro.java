package gestionApp.servicios;

import gestionApp.Empresa;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Registro {
	private static ArrayList<Empleado> empleados= new ArrayList<Empleado>();
	private static ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	private static ArrayList<Empresa> empresas= new ArrayList<>();
	private static ArrayList<Servicio> servicios= new ArrayList<Servicio>();
	
	
	//registros 
   
    public static Empleado registrarEmpleado(String nombre, int cedula, String cel, String correo, int edad, String cargo, String fechaInicioContrato) {
     	Empleado empleado= new Empleado(nombre,cedula,cel ,correo,edad,cargo,fechaInicioContrato);
    	empleados.add(empleado);
     	return empleado;
    }
    
    
    public static Cliente registrarCliente(int nit,String nombre, int cedula, String cel, String correo, int id, String cargo, Boolean activo) {

    	Empresa emp =buscarEmpresas(nit);
    	if (emp != null) {
    		Cliente cliente = new Cliente(nombre, cedula, cel, correo, id, cargo, activo);
    		cliente.setEmpresa(emp);
    		clientes.add(cliente);
    		//emp.setContactos(cliente);
    		return  cliente;
    	}
    	return  null;
    }
    public static Empresa registrarEmpresa(String nombre, int nit, String descripcion){
        Empresa empresa= new Empresa (nombre, nit, descripcion);
        empresas.add(empresa);
        return empresa;
    }

    public static Empresa buscarEmpresas(int nit){
    	  
    	for(int i = 0; i < empresas.size(); i++){
    		if(empresas.get(i).getNit() == nit)
    	        //System.out.println(empresas.get(i).getNombre());
    			return empresas.get(i);
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    
    public static Cliente buscarCliente(int id){
  	  
    	for(int i = 0; i < clientes.size(); i++){
    		if(clientes.get(i).getID() == id)
    			System.out.println(clientes.get(i).getEmpresa().getNombre());
    			return clientes.get(i);
    		//-------
    		
    }
    	return null;
    	
    	    }
    
    public static void listacEmpresa(int nit){
    	Empresa empresa = buscarEmpresas(nit);
    	if(empresa != null) {
    		for(int i = 0; i < empresa.getContactos().size(); i++){
    		
    			System.out.println(empresa.getContactos().get(i).getNombre());
    			
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
        return clientes;
    }

    
}
