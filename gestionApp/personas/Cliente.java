package gestionApp.personas;

import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;

import java.util.ArrayList;

public class Cliente extends Persona{

	private int id;
	private Empresa empresa;
	private String cargo;
	private Boolean activo;
	private float probCompra;

	private ArrayList<Negocio> negociosActivos;
	private ArrayList<Evento> listaEventos;

	public Cliente(String nombre, int cedula, String cel, String correo, int id, Empresa empresa, String cargo, Boolean activo){
		super(nombre, cedula, cel, correo);
		this.id = id;
		this.empresa = empresa;
		this.cargo = cargo;
		this.activo = activo;
		this.listaEventos = new ArrayList<>();
		this.probCompra = (float) (Math.random()*0.4);

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

	public int getID(){return this.id;}
	public void setID(int id){this.id = id;}

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

	public float getProbCompra() {return probCompra;}
	public void setProbCompra(float probCompra) {this.probCompra = probCompra;}

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
