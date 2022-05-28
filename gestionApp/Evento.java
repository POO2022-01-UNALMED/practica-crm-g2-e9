package gestionApp;

import java.util.ArrayList;

public class Evento {

    int ID;
    Empleado empleadoEncargado;
    Empresa empresaVinculada;
    Contacto contacto;
    ArrayList<Servicio> listaServicios;
    String tipoInteraccion;
    String descripcion;
    String fecha;
    String respuesta;

    public Evento(int ID, Empleado empleadoEncargado, Empresa empresaVinculada, Contacto contacto, String tipoInteraccion, String descripcion, String fecha){
        this.ID = ID;
        this.empleadoEncargado = empleadoEncargado;
        this.empresaVinculada = empresaVinculada;
        this.contacto = contacto;
        this.tipoInteraccion = tipoInteraccion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }


    //---------------Metodos Setter y Getter---------------

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public Empleado getEmpleadoEncargado() {return empleadoEncargado;}
    public void setEmpleadoEncargado(Empleado empleadoEncargado) {this.empleadoEncargado = empleadoEncargado;}

    public Empresa getEmpresaVinculada() {return empresaVinculada;}
    public void setEmpresaVinculada(Empresa empresaVinculada) {this.empresaVinculada = empresaVinculada;}

    public Contacto getContacto() {return contacto;}
    public void setContacto(Contacto contacto) {this.contacto = contacto;}

    public ArrayList<Servicio> getListaServicios() {return listaServicios;}
    public void setListServicios(ArrayList<Servicio> listaServicios) {this.listaServicios = listaServicios;}

    public String getTipoInteraccion() {return tipoInteraccion;}
    public void setTipoInteraccion(String tipoInteraccion) {this.tipoInteraccion = tipoInteraccion;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getRespuesta() {return respuesta;}
    public void setRespuesta(String respuesta) {this.respuesta = respuesta;}





    public static void anadirEvento(){
        
    }
    public static void cursoEvento(){
        
    }
    public static void modificarEvento(){
        
    }
    
}
