package gestionApp.servicios;

import gestionApp.Empresa;

import java.io.Serializable;
import java.util.ArrayList;

public class Promocion implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private double descuento;
	private ArrayList<Servicio> Servicios = new ArrayList<Servicio>();
	private static ArrayList<Promocion> allPromocion = new ArrayList<>();

	private static int idCounter = 0;

	public Promocion(double descuento, Servicio servicio) {
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.descuento = descuento;
		idCounter += 1;
		allPromocion.add(this);
		servicio.addPromocion(this);
	}
	
	public Promocion(double descuento) {
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.descuento = descuento;
		idCounter += 1;
		
	}
	
	
	
	
	
//gettters y setters 
	public String getId() {
		return id;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public static ArrayList<Promocion> getAllPromocion(){return allPromocion;}
	
	
	
	
}
