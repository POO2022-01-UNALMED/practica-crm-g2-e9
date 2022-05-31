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
    
    
    public static Cliente registrarCliente(String nombre, int cedula, String cel, String correo, int id, Empresa empresa, String cargo, Boolean activo) {
    	Cliente cliente = new Cliente (nombre, cedula, cel, correo, id, empresa, cargo, activo);
    	clientes.add(cliente);
    	return  cliente;
    }
    public  Empresa registrarEmpresa(String nombre, int nit, String descripcion){
        Empresa empresa= new Empresa (nombre, nit, descripcion);
        empresas.add(empresa);
        return empresa;
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

    public static void setClientes(ArrayList<Cliente> clientes) {
        Registro.clientes = clientes;
    }
}
