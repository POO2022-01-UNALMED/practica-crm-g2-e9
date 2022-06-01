package gestionApp;

import gestionApp.personas.Cliente;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Empresa {

	private String id;
	private String nombre;
	private int nit;
	private String descripcion;

	private ArrayList<Cliente> clientes;
	private  ArrayList<Negocio> negociosAbiertos;
	private  ArrayList<Venta> ventas;
	private  ArrayList<Servicio> serviciosDeInteres;

	private static ArrayList<Empresa> allEmpresas = new ArrayList<>();

	private static int idCounter = 0;
    
	public Empresa(String nombre,int nit, String descripcion) {
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.nombre = nombre;
		this.nit = nit;
		this.descripcion = descripcion;
		this.clientes = new ArrayList<>();
		this.negociosAbiertos = new ArrayList<>();
		this.ventas = new ArrayList<>();
		this.serviciosDeInteres = new ArrayList<>();
		allEmpresas.add(this);
		idCounter += 1;
	}

	// getters y setters 
	public String getId(){return this.id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public int getNit() {return nit;}
	public void setNit(int nit) {this.nit = nit;}

	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

	public ArrayList<Cliente> getClientes() {return clientes;}
	public void addCliente(Cliente cliente){this.clientes.add(cliente);}

	public ArrayList<Negocio> getNegociosAbiertos() {return negociosAbiertos;}
	public void setNegociosAbiertos(Negocio nuevoCliente) {this.negociosAbiertos.add(nuevoCliente);}

	public ArrayList<Venta> getVentas() {return ventas;}
	public void setVenta(Venta nuevaVenta) {this.ventas.add(nuevaVenta);}

	public static ArrayList<Empresa> getAllEmpresas(){return allEmpresas;}

	@Override
	public  String toString(){
		return "\tDatos del Empresa \nEmpresa: "+ nombre +
		 "\nNit de la empresa: " + nit + 
		 "\nID: " + id +
		 "\nDescripcion de la empresa: " + descripcion +
		 "\nNegocios Abiertos: " + negociosAbiertos +
		 "\nVentas: " + ventas +
		 "\nServicios de Interes: " + serviciosDeInteres;
		

		
	}

	public static  Object mostrarEmpresas() {
		return null;
	}

	

	//FUNCIONALIDADES

}
