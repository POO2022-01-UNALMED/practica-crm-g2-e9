package gestionApp.Evento;
import gestionApp.Negocio;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Llamada extends Evento implements Serializable {
    private static final long serialVersionUID = 1L;

    private double duracionLlamada;

    public Llamada(Negocio negocio, String descripcion){
        super(negocio, descripcion, LocalDateTime.now());
        this.duracionLlamada = Math.random();
        this.darRespuesta();
        negocio.definirEtapa();
    }
    
    public Llamada(Negocio negocio){
    	super(negocio,null,LocalDateTime.now());
    	
    	
       
    }

    private void darRespuesta(){
        
        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.duracionLlamada)> 1.4){
            this.respuesta = "Interesado";
        }
        else{
            this.respuesta = "No interesado";
        }

    }

    public double getDuracionLlamada(){return duracionLlamada;}


}
