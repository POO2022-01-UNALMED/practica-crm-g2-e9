package gestionApp.Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;

public class Llamada extends Evento{

    double duracionLlamada;

    public Llamada(int ID, Negocio negocio, String descripcion){
        super(ID, negocio, descripcion, LocalDateTime.now());
        this.duracionLlamada = Math.random();

        this.darRespuesta();
    }

    private void darRespuesta(){
        
        if ((negocio.getEmpleadoEncargado().getHabilidadVenta() + negocio.cliente.getProbCompra() + this.duracionLlamada)/3> 0.7){
            this.respuesta = "Interesado";
        }
        else{
            this.respuesta = "No interesado";
        }

    }
 



}
