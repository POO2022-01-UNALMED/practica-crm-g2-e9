package gestionApp.Evento;
import gestionApp.Negocio;
import java.time.LocalDateTime;



public class Evento implements Tiempo{

    protected String id;
    protected Negocio negocio;
    protected String descripcion;
    protected LocalDateTime fecha;
    protected String respuesta;
    private static int idCounter = 0;

      
    public Evento(Negocio negocio, String descripcion, LocalDateTime fecha){       
        this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
        this.negocio = negocio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        if (this.negocio.getEtapa().equals("Finalizado")){
            System.out.println("No se permiten crear mas Eventos para este negocio, ya que fue cerrado anteriormente");
        }
        else{
            this.negocio.agregarEvento(this);
        }
        idCounter += 1;
        
    }


    //---------------Metodos Setter y Getter---------------

    protected String getId() {return id;}

    public Negocio getNegocio() {return negocio;}
    public void setNegocio(Negocio negocio) {this.negocio = negocio;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public LocalDateTime getFecha() {return fecha;}
    public void setFecha(LocalDateTime fecha) {this.fecha = fecha;}

    public String getRespuesta() {return respuesta;}

    //Metodo para elegir si una respuesta cambia la etapa del negocio




    public static void anadirEvento(){
        
    }
    public static void cursoEvento(){
        
    }
    public static void modificarEvento(){
        
    }

}
