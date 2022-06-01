package gestionApp.Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;

public class Llamada extends Evento{

    private double duracionLlamada;

    public Llamada(Negocio negocio, String descripcion){
        super(negocio, descripcion, LocalDateTime.now());
        this.duracionLlamada = Math.random();
        this.darRespuesta();
        negocio.definirEtapa();
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
