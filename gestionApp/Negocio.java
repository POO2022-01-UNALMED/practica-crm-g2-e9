package gestionApp;

import java.util.ArrayList;

public class Negocio {
	
	private int id;
	private String etapa;
	private int valorVenta;
	private String fechaCreacion;
	private String fechaCerrada;
	public Empleado empleadoEncargado;
	public Empresa empresaVinculada;
    private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();
	
    
    public Negocio(int id, String etapa, int valorVenta, String fechaCreacion, String fechaCerrada,
			Empleado empleadoEncargado, Empresa empresaVinculada, ArrayList<gestionApp.Servicios> servicios) {
		
		this.id = id;
		this.etapa = etapa;
		this.valorVenta = valorVenta;
		this.fechaCreacion = fechaCreacion;
		this.fechaCerrada = fechaCerrada;
		this.empleadoEncargado = empleadoEncargado;
		this.empresaVinculada = empresaVinculada;
		Servicios = servicios;
	}


    
    // setters y getters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
