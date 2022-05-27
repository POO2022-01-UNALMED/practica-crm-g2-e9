package gestionApp;

import java.util.ArrayList;

public class Promocion {
	private int id;
	private double descuento;
	private ArrayList<Servicio> Servicios = new ArrayList<Servicio>();
	public Promocion(int id, double descuento, ArrayList<Servicio> servicios) {
		super();
		this.id = id;
		this.descuento = descuento;
		Servicios = servicios;
	}
	
	
	
//gettters y setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
	
}
