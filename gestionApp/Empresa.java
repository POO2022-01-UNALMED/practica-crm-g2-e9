package gestionApp;

import gestionApp.personas.Cliente;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private int nit;
	private String descripcion;

	private ArrayList<Cliente> contactos;
	private final ArrayList<Negocio> negociosAbiertos;
	private final ArrayList<Venta> ventas;
	private static ArrayList<Empresa> empresas;
	private final ArrayList<Servicio> serviciosDeInteres;

    
	public Empresa(String nombre,int nit, String descripcion) {
		this.nombre = nombre;
		this.nit = nit;
		this.descripcion = descripcion;
		this.negociosAbiertos = new ArrayList<>();
		this.ventas = new ArrayList<>();
		this.serviciosDeInteres = new ArrayList<>();
	}

	// getters y setters 
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public int getNit() {return nit;}
	public void setNit(int nit) {this.nit = nit;}

	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

	public ArrayList<Cliente> getContactos() {return contactos;}
	public void setContacto(Cliente nuevoContacto) {this.contactos.add(nuevoContacto);}

	public ArrayList<Negocio> getNegociosAbiertos() {return negociosAbiertos;}
	public void setNegociosAbiertos(Negocio nuevoContacto) {this.negociosAbiertos.add(nuevoContacto);}

	public ArrayList<Venta> getVentas() {return ventas;}
	public void setVenta(Venta nuevaVenta) {this.ventas.add(nuevaVenta);}

	public static ArrayList<Empresa> getEmpresas() {return empresas;}
	public static void setEmpresas(Empresa nuevaEmpresa) {Empresa.empresas.add(nuevaEmpresa);}


	//FUNCIONALIDADES

}
