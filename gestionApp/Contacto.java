package gestionApp;

import java.util.ArrayList;

public class Contacto extends Persona{

	private int ID;
	private Empresa empresa;
	private String cargo;
	private Boolean negociosActivos;

	private ArrayList<Negocio> listaNegociosActivos;
	private ArrayList<Evento> listaEventos;

	public Contacto(String nombre, String apellido, int telefono, String correo, int ID, Empresa empresa, String cargo, Boolean negociosActivos){
		super(nombre, apellido, telefono, correo);
		this.ID = ID;
		this.empresa = empresa;
		this.cargo = cargo;
		this.negociosActivos = negociosActivos;
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

	public Boolean isNegociosActivos(){return  this.negociosActivos;}
	public void setNegociosActivos(Boolean estado){this.negociosActivos = estado;}

	public ArrayList<Negocio> getListaNegociosActivos(){return this.listaNegociosActivos;}
	public void setAgregarNegocio(Negocio nuevoNegocio){this.listaNegociosActivos.add(nuevoNegocio);}

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
