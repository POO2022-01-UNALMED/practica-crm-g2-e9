package gestionApp;

import java.util.ArrayList;

public class Contacto extends Persona{

	private int ID;
	private Empresa empresa;
	private String cargo;
	private Boolean negociosActivos;

	private ArrayList<Negocio> listaNegociosActivos = new ArrayList<Negocio>();
	private ArrayList<Evento> listaEventos = new ArrayList<Evento>();

	public Contacto(String nombre, String apellido, int telefono, String correo, int ID, Empresa empresa, String cargo, Boolean negociosActivos){
		super(nombre, apellido, telefono, correo);
		this.ID = ID;
		this.empresa = empresa;
		this.cargo = cargo;
		this.negociosActivos = negociosActivos;
	}


	//---------------Metodos Heredados---------------
	public String getNombre(){return nombre;}
	public void setNombre(String nombre){this.nombre = nombre;}

	public String getApellido(){return apellido;}
	public void setApellido(String apellido){this.apellido = apellido;}

	public int getTelefono(){return this.telefono;}
	public void setTelefono(int telefono){this.telefono = telefono;}

	public String getCorreo(){return correo;}
	public void setCorreo(String correo){this.correo = correo;}


	//---------------Metodos Propios---------------

	public int getID(){return this.ID;}
	public void setID(int ID){this.ID = ID;}

	public Empresa getEmpresa(){return empresa;}
	public void setEmpresa(Empresa empresa){this.empresa = empresa;}

	public String getCargo(){return cargo;}
	public void setCargo(String cargo){this.cargo = cargo;}

	public Boolean isNegociosActivos(){return  this.negociosActivos;}
	public void setNegociosActivos(Boolean estado){this.negociosActivos = estado;}



	// las que eliminamos que pueden ir en toStrings
	
	public static void clientesPotenciales() {

	}

	public static void consultarClientes() {

	}
	
	public static void consultarOportunidades() {

	}
	
	public static void consultarVentas() {

	}
	
	public static void serviciosClientes() {

	}



	



	
	
}
