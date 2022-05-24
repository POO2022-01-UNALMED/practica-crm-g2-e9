package gestionApp;

import java.util.ArrayList;

public class Promociones {
	private int id;
	private double descuento;
	private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();
	public Promociones(int id, double descuento, ArrayList<gestionApp.Servicios> servicios) {
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
