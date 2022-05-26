package gestionApp;

import java.util.ArrayList;

public class Contacto extends Persona{

	private int Empresa;
	private int Cargo;
	private
	private final String fechaInicioContrato;
	private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();
	private ArrayList<Negocio> negociosAbiertos = new ArrayList<Negocio>();
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public Empleado(String nombre, String apellido, int telefono, String correo, int cedula, int edad, String fechaInicioContrato){
		super(nombre, apellido, telefono, correo);
		this.cedula = cedula;
		this.edad = edad;
		this.fechaInicioContrato = fechaInicioContrato;
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

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getCel_num() {
		return cel_num;
	}


	public void setCel_num(String cel_num) {
		this.cel_num = cel_num;
	}
	
	
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



	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		
	}

	public int getDNI() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDNI(int DNI) {
		// TODO Auto-generated method stub
		
	}


	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setEdad(int Edad) {
		// TODO Auto-generated method stub
		
	}

	
	



	
	
}
