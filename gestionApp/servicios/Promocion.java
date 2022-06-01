package gestionApp.servicios;

import java.util.ArrayList;

public class Promocion {
	private String id;
	private double descuento;
	private ArrayList<Servicio> Servicios = new ArrayList<Servicio>();

	private static int idCounter = 0;

	public Promocion(int id, double descuento, ArrayList<Servicio> servicios) {
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.descuento = descuento;
		Servicios = servicios;
		idCounter += 1;
	}
	
	
	
//gettters y setters 
	public int getId() {
		return id;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
	
}
