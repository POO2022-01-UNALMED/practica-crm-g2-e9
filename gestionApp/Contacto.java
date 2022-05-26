package gestionApp;

import java.util.ArrayList;

public class Contacto extends Persona{

	private int Empresa;
	private int Cargo;
	private int id;
	private final String fechaInicioContrato;
	private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();
	private ArrayList<Negocio> negociosAbiertos = new ArrayList<Negocio>();
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	private int cedula;
	private int edad;


	public Contacto(String nombre, String apellido, int telefono, String correo, int cedula, int edad, String fechaInicioContrato,int id ){
		super(nombre, apellido, telefono, correo);
		this.cedula = cedula;
		this.edad = edad;
		this.fechaInicioContrato = fechaInicioContrato;
		this.id = id;
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
	public int getCedula(){return cedula;}
	public void setCedula(int cedula){this.cedula = cedula;}

	public int getEdad(){return edad;}
	public void setEdad(int edad){this.edad = edad;}

	
	//Setters y Getters 

	public int getId() {return id;}


	public void setId(int id) {this.id = id;}

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
