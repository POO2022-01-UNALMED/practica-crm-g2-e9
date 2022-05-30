package gestionApp;

import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class Negocio {
	
	private int ID;
	public Empleado empleadoEncargado;
	public Cliente cliente;
	private String etapa;
	private int valorVenta;
	private String fechaCreacion;
	private String fechaFinalizacion;

	private ArrayList<Servicio> servicios;
	private ArrayList<Evento> eventos;
	private static ArrayList<Negocio> negociosActivos = new ArrayList<>();

    
    public Negocio(int ID, Empleado empleadoEncargado, Cliente cliente, String etapa, int valorVenta, String fechaCreacion, String fechaCerrada) {
		this.ID = ID;
		this.empleadoEncargado = empleadoEncargado;
		this.cliente = cliente;
		this.etapa = etapa;
		this.valorVenta = valorVenta;
		this.fechaCreacion = fechaCreacion;
		this.fechaFinalizacion = fechaCerrada;
		this.servicios = new ArrayList<>();
		this.eventos = new ArrayList<>();
		Negocio.negociosActivos.add(this);
	}

    
    // setters y getters


	public int getID() {return ID;}
	public void setID(int ID) {this.ID = ID;}

	public Empleado getEmpleadoEncargado() {return empleadoEncargado;}
	public void setEmpleadoEncargado(Empleado empleadoEncargado) {this.empleadoEncargado = empleadoEncargado;}

	public Cliente getCliente() {return cliente;}
	public void setCliente(Cliente cliente) {this.cliente = cliente;}

	public String getEtapa() {return etapa;}
	public void setEtapa(String etapa) {this.etapa = etapa;}

	public int getValorVenta() {return valorVenta;}
	public void setValorVenta(int valorVenta) {this.valorVenta = valorVenta;}

	public String getFechaCreacion() {return fechaCreacion;}
	public void setFechaCreacion(String fechaCreacion) {this.fechaCreacion = fechaCreacion;}

	public String getFechaFinalizacion() {return fechaFinalizacion;}
	public void setFechaFinalizacion(String fechaFinalizacion) {this.fechaFinalizacion = fechaFinalizacion;}

	public ArrayList<Servicio> getServicios() {return servicios;}
	public void setServicios(ArrayList<Servicio> servicios) {this.servicios = servicios;}
	void agregarServicio (Servicio nuevoServicio){this.servicios.add(nuevoServicio);}
	void eliminarServicio(int indice){this.servicios.remove(indice);}

	public ArrayList<Evento> getEventos() {return eventos;}
	public void setEventos(ArrayList<Evento> eventos) {this.eventos = eventos;}
	void agregarEvento (Evento nuevoEvento){this.eventos.add(nuevoEvento);}
	void eliminarEvento(int indice){this.eventos.remove(indice);}

	public static ArrayList<Negocio> getNegociosActivos() {return Negocio.negociosActivos;}
	public static void setNegociosActivos(ArrayList<Negocio> negociosActivos) {Negocio.negociosActivos = negociosActivos;}
	public static void agregarNegocio(Negocio nuevoNegocio){Negocio.negociosActivos.add(nuevoNegocio);}
	public static void eliminarNegocio(int indice){Negocio.negociosActivos.remove(indice);}


	//METODOS FUNCIONALES


}
