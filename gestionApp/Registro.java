package gestionApp;

import java.util.ArrayList;

public class Registro {
	private static ArrayList<Empleado> empleados= new ArrayList<Empleado>();
	private static ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	private static ArrayList<Empresa> empresas= new ArrayList<Empresa>();
	private static ArrayList<Servicio> servicios= new ArrayList<Servicio>();
	
	/*
	//registros 
   
    public static Empleado registrarEmpleado(String nombre, String apellido, int cedula, int edad, String correo, int celular, String fechaInicioContrato) {
    	Empleado empleado= new Empleado (nombre,apellido,cedula, edad,correo,celular,fechaInicioContrato);
    	empleados.add(empleado);
    	return empleado;
    }
    
    
    public static Cliente registrarCliente(int id, String nombre, int cedula, String cel_num) {
    	Cliente cliente = new Cliente (id, nombre,cedula,cel_num);
    	clientes.add(cliente);
    	return  cliente;
    }
    public static Empresa registrarEmpresa(String cargo, String negociosAbiertos, String negociosCerrados, String etapaVenta, String valor){
        Empresa empresa= new Empresa ( cargo, negociosAbiertos,negociosCerrados, etapaVenta, valor);
        empresas.add(empresa);
        return empresa;
    }
    
    public static void registrarPromocion(){

    }
    public static Servicio registrarServicios(String nombreServicios, int valorProducto, String tipo, String descripcion){
        Servicio servicio = new Servicio(nombreServicios,valorProducto, tipo, descripcion);
        servicios.add(servicio);
        return servicio;
    }


    */
}
