package gestionApp;

import java.util.ArrayList;

public class Negocio {
	
	private int ID;
	public Empleado empleadoEncargado;
	public Empresa empresaVinculada;
	private String etapa;
	private int valorVenta;
	private String fechaCreacion;
	private String fechaCerrada;

	private ArrayList<Servicio> servicios;
	private ArrayList<Evento> eventos;
	private static final ArrayList<Negocio> negociosActivos = new ArrayList<>();

    
    public Negocio(int ID, Empleado empleadoEncargado, Empresa empresaVinculada, String etapa, int valorVenta, String fechaCreacion, String fechaCerrada) {
		this.ID = ID;
		this.empleadoEncargado = empleadoEncargado;
		this.empresaVinculada = empresaVinculada;
		this.etapa = etapa;
		this.valorVenta = valorVenta;
		this.fechaCreacion = fechaCreacion;
		this.fechaCerrada = fechaCerrada;
		this.servicios = new ArrayList<>();
		this.eventos = new ArrayList<>();

		Negocio.negociosActivos.add(this);
	}

    
    // setters y getters
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


	public String getFechaCerrada() {
		return fechaCerrada;
	}


	public void setFechaCerrada(String fechaCerrada) {
		this.fechaCerrada = fechaCerrada;
	}
    
    
    
    
    
    
}
