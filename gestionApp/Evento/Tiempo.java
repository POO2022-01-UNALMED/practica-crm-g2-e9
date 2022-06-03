package gestionApp.Evento;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import gestionApp.Negocio;

public interface Tiempo {
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    

    public Negocio getNegocio();
    public void setNegocio(Negocio negocio); 

    public String getDescripcion();
    public void setDescripcion(String descripcion);

    public LocalDateTime getFecha();
    public void setFecha(LocalDateTime fecha);

    public String getRespuesta();



}
