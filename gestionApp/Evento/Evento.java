package gestionApp.Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Evento {

    protected int ID;
    protected Negocio negocio;
    protected String descripcion;
    protected LocalDateTime fecha;
    protected String respuesta;

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      
    public Evento(int ID, Negocio negocio, String descripcion, LocalDateTime fecha){
        this.ID = ID;
        this.negocio = negocio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        negocio.agregarEvento(this);
    }


    //---------------Metodos Setter y Getter---------------

    protected int getID() {return ID;}
    protected void setID(int ID) {this.ID = ID;}

    protected Negocio getNegocio() {return negocio;}
    protected void setNegocio(Negocio negocio) {this.negocio = negocio;}

    protected String getDescripcion() {return descripcion;}
    protected void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    protected LocalDateTime getFecha() {return fecha;}
    protected void setFecha(LocalDateTime fecha) {this.fecha = fecha;}

    public String getRespuesta() {return respuesta;}
    protected void setRespuesta(String respuesta) {this.respuesta = respuesta;}

    //Metodo para elegir si una respuesta cambia la etapa del negocio




    public static void anadirEvento(){
        
    }
    public static void cursoEvento(){
        
    }
    public static void modificarEvento(){
        
    }

}
