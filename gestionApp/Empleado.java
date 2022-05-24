package gestionApp;

import javax.swing.*;
import java.util.ArrayList;

public class Empleado  extends Persona{
    private String correo;
    private int celular;
    private String fechaInicioContrato;
    private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();

    public Empleado(String nombre, String apellido, int cedula, int edad, String correo, int celular, String fechaInicioContrato){
        super(nombre, apellido, cedula, edad);
        this.nombre = correo;
        this.celular = celular;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public int getCedula(){return cedula;}
    public void setCedula(int cedula){this.cedula = cedula;}

    public int getCelular(){return this.celular;}
    public void setCelular(int celular){this.celular = celular;}

    public String getFechaInicioContrato(){return fechaInicioContrato;}
    public void setFechaInicioContrato(String fechaInicioContrato){this.fechaInicioContrato = fechaInicioContrato;}

    public ArrayList<Servicios> getServicios(){return Servicios;}
    public void setServicios(ArrayList<Servicios> Servicios){this.Servicios = Servicios;}
    
}
