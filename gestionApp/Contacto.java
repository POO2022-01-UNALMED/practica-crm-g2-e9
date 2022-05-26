package gestionApp;

import java.util.ArrayList;

public class Contacto extends Persona{

	private int ID;
	private Empresa empresa;
	private String cargo;
	private Boolean activo;

	private ArrayList<Negocio> negociosActivos;
	private ArrayList<Evento> listaEventos;

	public Contacto(String nombre, String apellido, int telefono, String correo, int ID, Empresa empresa, String cargo, Boolean activo){
		super(nombre, apellido, telefono, correo);
		this.ID = ID;
		this.empresa = empresa;
		this.cargo = cargo;
		this.activo = activo;
		this.listaEventos = new ArrayList<>();
		this.listaEventos = new ArrayList<>();
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

	public Boolean isActivo(){return  this.activo;}
	public void setActivo(Boolean estado){this.activo = estado;}

	public ArrayList<Negocio> getNegociosActivos(){return this.negociosActivos;}
	public void setNegociosActivos(Negocio nuevoNegocio){this.negociosActivos.add(nuevoNegocio);}

	public ArrayList<Evento> getListaEventos(){return this.listaEventos;}
	public void setAgregarEvento(Evento nuevoEvento){this.listaEventos.add(nuevoEvento);}


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
