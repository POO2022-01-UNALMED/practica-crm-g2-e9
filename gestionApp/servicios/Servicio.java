package gestionApp.servicios;

import java.io.Serializable;
import java.util.ArrayList;



public class Servicio implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nombre;
    private int precio;
    private String tipo;
    private String descripcion;
    private boolean promocion;

    
    private static ArrayList<Servicio> allServicios= new ArrayList<Servicio>();
    private ArrayList<Servicio> Servicios = new ArrayList<Servicio>();
    private ArrayList<Promocion> Promociones = new ArrayList<Promocion>();
    
	private static int idCounter = 0;
    public Servicio(String nombreServicios, int valorProducto, String tipo, String descripcion) {
        this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.nombre = nombreServicios;
        this.precio = valorProducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        allServicios.add(this);
        idCounter += 1;
	}
    
    
	public String getId(){return this.id;}

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
    
    public void addServicio(Servicio servicio){this.Servicios.add(servicio);}
    
    public  String toStringListasServicios(){
        return "\tDatos del Servicio \tID del Servicio: "+ id +
        "\nNombre del Servicio: "+ nombre +
            "\nTipo de Servicio: " + tipo;
    }
    
	@Override
    public  String toString(){
        return "\tDatos del Servicio \tID del Servicio: "+ id +
        "\nNombre del Servicio: "+ nombre +
            "\nDescripcion del Servicio" + descripcion + 
            "\nTipo de Servicio: " + tipo;
    }
 
    

    

    
}
