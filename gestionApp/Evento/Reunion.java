package gestionApp.Evento;
import gestionApp.Negocio;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Reunion extends Evento implements Serializable {
    
    private double duracionReunion;

    public Reunion(Negocio negocio, String descripcion){
        super(negocio, descripcion, LocalDateTime.now());
        this.duracionReunion = Math.random();
        this.darRespuesta();
        negocio.definirEtapa();
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

}