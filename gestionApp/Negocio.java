package gestionApp;

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
	private static final ArrayList<Negocio> negociosActivos = new ArrayList<>();

    
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


	public Empleado getEmpleadoEncargado() {return empleadoEncargado;}
	public void setEmpleadoEncargado(Empleado empleadoEncargado) {this.empleadoEncargado = empleadoEncargado;}

	public Cliente getCliente() {return cliente;}
	public void setCliente(Cliente cliente) {this.cliente = cliente;}

	public int getId() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}


	public String getEtapa() {
		return etapa;
	}


	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}


	public int getValorVenta() {
		return valorVenta;
	}


	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}


	public String getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getFechaFinalizacion() {
		return fechaFinalizacion;
	}


	public void setFechaFinalizacion(String fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
    
    
    
    
    
    
}
