package gestionApp.Evento;
import gestionApp.Negocio;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Correo extends Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double cantidadPalabras;

    public Correo(Negocio negocio, String descripcion){
        super(negocio, descripcion, LocalDateTime.now());
        this.cantidadPalabras = Math.random();
        this.darRespuesta();
        negocio.definirEtapa();
    }

    private void darRespuesta(){
        
        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.cantidadPalabras)> 1.4){
            super.respuesta = "Interesado";
        }
        else{
            super.respuesta = "No interesado";
        }

    }
    public double getCantidadPalabras(){return cantidadPalabras;}
}
