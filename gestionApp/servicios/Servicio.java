package gestionApp.servicios;

import java.util.ArrayList;

import gestionApp.personas.Cliente;

public class Servicio {
    private String nombre;
    private int precio;
    private String tipo;
    private String descripcion;
    private boolean promocion;

    
    private static ArrayList<Servicio> allServicios= new ArrayList<Servicio>();
    private ArrayList<Servicio> Servicios = new ArrayList<Servicio>();
    private ArrayList<Promocion> Promociones = new ArrayList<Promocion>();
    

    public Servicio(String nombreServicios, int valorProducto, String tipo, String descripcion) {
		this.nombre = nombreServicios;
        this.precio = valorProducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        allServicios.add(this);
	}
    
    

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getPrecio(){return precio;}
    public void setPrecio(int precio){this.precio = precio;}

    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}

    public String getDescripcion (){return descripcion;}
    public void setDescripcion (String descripcion){this.descripcion = descripcion;}

    public static ArrayList<Servicio> getAllServicios(){return allServicios;}
    public void addPromocion(Promocion promocion){this.Promociones.add(promocion);}
    
}
