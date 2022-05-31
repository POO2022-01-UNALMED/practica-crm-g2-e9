package gestionApp.Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;


public class Reunion extends Evento{
    
    double duracionReunion;

    public Reunion(int ID, Negocio negocio, String descripcion){
        super(ID, negocio, descripcion, LocalDateTime.now());
        this.duracionReunion = Math.random();
        this.darRespuesta();
    }

    private void darRespuesta(){
        
        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.duracionReunion)/3> 0.7){
            super.respuesta = "Interesado";
        }
        else{
            super.respuesta = "No interesado";
        }
    }
}