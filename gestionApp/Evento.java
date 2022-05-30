package gestionApp;

import java.util.ArrayList;

public class Evento {

    int ID;
    Negocio negocio;
    String tipoInteraccion;
    String descripcion;
    String fecha;
    String respuesta;

    public Evento(int ID, Negocio negocio, String tipoInteraccion, String descripcion){
        this.ID = ID;
        this.negocio = negocio;
        this.tipoInteraccion = tipoInteraccion;
        this.descripcion = descripcion;
        this.fecha = "00/00/0000";
        this.respuesta = this.darRespuesta();

        //ejecucion de metodo para dar respuesta;
    }

    private String darRespuesta(){
        return "ziks";
    }


    //---------------Metodos Setter y Getter---------------

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public String getTipoInteraccion() {return tipoInteraccion;}
    public void setTipoInteraccion(String tipoInteraccion) {this.tipoInteraccion = tipoInteraccion;}

    public Negocio getNegocio() {return negocio;}
    public void setNegocio(Negocio negocio) {this.negocio = negocio;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getRespuesta() {return respuesta;}
    public void setRespuesta(String respuesta) {this.respuesta = respuesta;}


    //Metodo para elegir si una respuesta cambia la etapa del negocio




    public static void anadirEvento(){
        
    }
    public static void cursoEvento(){
        
    }
    public static void modificarEvento(){
        
    }

    public static void main(String[] args) {
        System.out.println("Hola!");
        int numero = (int)(Math.random()*10+1);
        System.out.println(numero);
    }
    
}
