package gestionApp.Evento;
import gestionApp.Negocio;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Reunion extends Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double duracionReunion;

    public Reunion(Negocio negocio, String descripcion){
        super(negocio, descripcion, LocalDateTime.now());
        this.duracionReunion = Math.random();
        this.darRespuesta();
        negocio.definirEtapa();
    }
    public Reunion(Negocio negocio){
    	super(negocio,null,LocalDateTime.now());
    	
    	
       
    }


    private void darRespuesta(){

        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.duracionReunion) > 1.4){
            super.respuesta = "Interesado";
        }
        else{
            super.respuesta = "No interesado";
        }
    }

    public double getDuracionReunion(){return duracionReunion;}

	@Override
	public String toString() {
		return "Reunion [duracionReunion=" + duracionReunion + ", id=" + id + ", negocio=" + negocio + ", descripcion="
				+ descripcion + ", fecha=" + fecha + ", respuesta=" + respuesta + ", getDuracionReunion()="
				+ getDuracionReunion() + ", getId()=" + getId() + ", getNegocio()=" + getNegocio()
				+ ", getDescripcion()=" + getDescripcion() + ", getFecha()=" + getFecha() + ", getRespuesta()="
				+ getRespuesta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
