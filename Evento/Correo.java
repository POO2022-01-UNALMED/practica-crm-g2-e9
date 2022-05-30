package Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;


public class Correo extends Evento{
    
    double cantidadPalabras;

    public Correo(int ID, Negocio negocio, String descripcion){
        super(ID, negocio, descripcion, LocalDateTime.now());
        this.cantidadPalabras = Math.random();

        this.darRespuesta();
    }

    private void darRespuesta(){
        
        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.cantidadPalabras)/3> 0.7){
            super.respuesta = "Interesado";
        }
        else{
            super.respuesta = "No interesado";
        }

    }

}
