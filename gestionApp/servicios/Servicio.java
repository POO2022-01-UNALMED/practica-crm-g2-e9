package gestionApp.servicios;

import java.util.ArrayList;

public class Servicio {
    private String nombre;
    private int precio;
    private String tipo;
    private String descripcion;
    private boolean promocion;
    private String asdfa;

    
    private static ArrayList<Servicio> allServicios= new ArrayList<Servicio>();

    private static ArrayList<Servicio> listaServicios;
    public Servicio(String nombreServicios, int valorProducto, String tipo, String descripcion) {
		this.nombre = nombreServicios;
        this.precio = valorProducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        //Servicio.listaServicios.add(this);
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

    public ArrayList<Servicio> getListaServicios(){return Servicio.listaServicios;}
    public void setServicio(Servicio nuevoServicio){Servicio.listaServicios.add(nuevoServicio);}

}
