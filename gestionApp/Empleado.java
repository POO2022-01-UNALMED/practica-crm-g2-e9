package gestionApp;

import java.util.ArrayList;

public class Empleado<Productos> extends Persona {
    private String nombre;
    private String cedula;
    private int cel;
    private ArrayList <Productos> Productos = new ArrayList <>();

    public Empleado(String nombre, String cedula, int cel){
        this.nombre = nombre;
        this.cedula = cedula;
        this.cel = cel;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public int getCel(){
        return cel;
    }

    public  void setCel(int cel){
        this.cel = cel;
    }

    @Override
    public String getApellido() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setApellido(String apellido) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getDNI() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setDNI(int DNI) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getEdad() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setEdad(int Edad) {
        // TODO Auto-generated method stub
        
    }

    
}
