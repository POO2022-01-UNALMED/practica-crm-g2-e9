package gestionApp.personas;

import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;

import java.util.ArrayList;

public class Cliente extends Persona{
	

	private String id;
	private String cargo;
	private Boolean activo;
	private double probCompra;
	public Empresa empresa;
	private ArrayList<Negocio> negociosActivos;
	private ArrayList<Evento> listaEventos;

	public static ArrayList<Cliente> allClientes = new ArrayList<>();

	private static int idCounter = 0;
	
	public Cliente(String nombre, Empresa emp, int cedula, String cel, String correo, String cargo, Boolean activo){
		super(nombre, cedula, cel, correo);
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.cargo = cargo;
		this.activo = activo;
		this.empresa = emp;
		this.listaEventos = new ArrayList<>();
		this.probCompra = Math.random();
		idCounter += 1;
		allClientes.add(this);
		empresa.addCliente(this);
	}

	public Cliente(String nombre, int cedula, String cel, String correo, Boolean activo, String cargo){
		super(nombre, cedula, cel, correo);
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.cargo = cargo;
		this.activo = activo;
		this.listaEventos = new ArrayList<>();
		this.probCompra = Math.random();
		//empresa.addCliente(this);
		allClientes.add(this);
		idCounter += 1;

	
	}


	




	//---------------Metodos Heredados---------------
	public String getNombre(){return nombre;}
	public void setNombre(String nombre){this.nombre = nombre;}

	public int getCedula(){return cedula;}
	public void setCedula(int cedula){this.cedula = cedula;}

	public String getCel(){return this.cel;}
	public void setCel(String cel){this.cel = cel;}

	public String getCorreo(){return correo;}
	public void setCorreo(String correo){this.correo = correo;}


	//---------------Metodos Propios---------------

	public String getId(){return this.id;}

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

	public double getProbCompra() {return probCompra;}
	public void setProbCompra(double probCompra) {this.probCompra = probCompra;}

	public static ArrayList<Cliente> getAllClientes(){return allClientes;}
	public static void setAllClientes(ArrayList<Cliente> allClientes) {Cliente.allClientes = allClientes;}

	public static void clientesPotenciales() {

	}
	public static void mostrarCliente( ) {


	}

	public static void consultarClientes() {

	}
	
	public static void consultarOportunidades() {

	}
	
	public static void consultarVentas() {

	}
	
	public static void serviciosClientes() {

	}
	public String toStringEmpresa(){
		return "\n////////////////////////////\n" +
		"Empresa: " + getEmpresa().getNombre() +
		"\nNit Empresa: " + getEmpresa().getNit() +
		"\nDescripcion de la empresa a la que pertenece: \n" +
		"\n////////////////////////////\n";  
	}
	@Override
	
	public  String toString(){
		return "\tDatos del Cliente \nCliente: "+ nombre +
		 "\nIdentificado con el CC." + cedula + 
		 "\nCelular: " + cel +
		 "\nCorreo: " + correo +
		 "\nID: " + id +
		 "\nCargo: " + cargo +
		 "\nActivo en la app: " + activo +
		 "\n/////////////////////////////////////////////\n";
		 
		
	}

	



	
	
}
