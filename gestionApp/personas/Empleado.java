package gestionApp.personas;

import gestionApp.Negocio;
import gestionApp.servicios.Servicio;
import gestionApp.Venta;

import java.util.ArrayList;

public class Empleado  extends Persona{
    private int cedula;
    private int edad;
    private String cargo;
    private  String fechaInicioContrato;
    private  double habilidadVenta;

    private  ArrayList<Servicio> servicios;
    private  ArrayList<Negocio> negociosAbiertos;
    private  ArrayList<Venta> ventas;

    private static ArrayList<Empleado> allEmpleados = new ArrayList<>();

    public Empleado(String nombre, int cedula, String cel, String correo, int edad, String cargo, String fechaInicioContrato){
        super(nombre, cedula, cel, correo);
        this.edad = edad;
        this.cargo = cargo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.servicios = new ArrayList<>();
        this.negociosAbiertos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.habilidadVenta = Math.random(); //numero random entre 0 y 0.4
        allEmpleados.add(this);
    }

    //---------------Metodos Heredados---------------

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getCedula(){return cedula;}
    public void setCedula(int cedula){this.cedula = cedula;}

    public String getCel(){return this.cel;}
    public void setCel(String cel){this.cel = cel;}

    public String getCorreo(){return correo;}
    public void setCorreo(String correo){this.correo = correo;}

    public double getHabilidadVenta() {
        return habilidadVenta;
    }

    //---------------Metodos Propios---------------

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public String getCargo(){return cargo;}
    public void setCargo(String cargo){this.cargo = cargo;}

    public String getFechaInicioContrato (){return this.fechaInicioContrato;}

    public ArrayList<Servicio> getServicios(){return servicios;}
    public void setServicios(Servicio nuevoServicio){this.servicios.add(nuevoServicio);}

    public ArrayList<Negocio> getNegociosAbiertos(){return negociosAbiertos;}
    public void setNegociosAbiertos(Negocio nuevoNegocio){this.negociosAbiertos.add(nuevoNegocio);}

    public ArrayList<Venta> getVentas(){return ventas;}
    public void setVentas(Venta nuevaVenta){this.ventas.add(nuevaVenta);}
    
}
