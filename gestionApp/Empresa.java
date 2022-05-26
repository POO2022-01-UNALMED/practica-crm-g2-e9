package gestionApp;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private int NIT;
	private String descripcion;

	private ArrayList<Contacto> contactos;
	private final ArrayList<Negocio> negociosAbiertos;
	private final ArrayList<Venta> ventas;
	private static ArrayList<Empresa> empresas;

    
	public Empresa(String nombre,int NIT, String descripcion) {
		this.nombre = nombre;
		this.NIT = NIT;
		this.descripcion = descripcion;
		this.negociosAbiertos = new ArrayList<>();
		this.ventas = new ArrayList<>();
	}

	// getters y setters 
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public int getNIT() {return NIT;}
	public void setNIT(int NIT) {this.NIT = NIT;}

	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

	public ArrayList<Contacto> getContactos() {return contactos;}
	public void setContacto(Contacto nuevoContacto) {this.contactos.add(nuevoContacto);}

	public ArrayList<Negocio> getNegociosAbiertos() {return negociosAbiertos;}
	public void setNegociosAbiertos(Negocio nuevoContacto) {this.negociosAbiertos.add(nuevoContacto);}

	public ArrayList<Venta> getVentas() {return ventas;}
	public void setVenta(Venta nuevaVenta) {this.ventas.add(nuevaVenta);}

	public static ArrayList<Empresa> getEmpresas() {return empresas;}
	public static void setEmpresas(Empresa nuevaEmpresa) {Empresa.empresas.add(nuevaEmpresa);}


	//FUNCIONALIDADES
}
