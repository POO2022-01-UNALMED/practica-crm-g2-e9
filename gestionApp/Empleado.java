package gestionApp;

import java.util.ArrayList;

public class Empleado  extends Persona{
    private int cedula;
    private int edad;
    private final String fechaInicioContrato;
    private ArrayList<Servicios> Servicios = new ArrayList<Servicios>();
    private ArrayList<Negocio> negociosAbiertos = new ArrayList<Negocio>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public Empleado(String nombre, String apellido, int telefono, String correo, int cedula, int edad, String fechaInicioContrato){
        super(nombre, apellido, telefono, correo);
        this.cedula = cedula;
        this.edad = edad;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    //---------------Metodos Heredados---------------
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}

    public int getTelefono(){return this.telefono;}
    public void setTelefono(int telefono){this.telefono = telefono;}

    public String getCorreo(){return correo;}
    public void setCorreo(String correo){this.correo = correo;}


    //---------------Metodos Propios---------------
    public int getCedula(){return cedula;}
    public void setCedula(int cedula){this.cedula = cedula;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public String getFechaInicioContrato (){return this.fechaInicioContrato;}

    public ArrayList<Servicios> getServicios(){return Servicios;}
    public void setServicios(Servicios nuevoServicio){this.Servicios.add(nuevoServicio);}

    public ArrayList<Negocio> getNegociosAbiertos(){return negociosAbiertos;}
    public void setNegociosAbiertos(Negocio nuevoNegocio){this.negociosAbiertos.add(nuevoNegocio);}

    public ArrayList<Venta> getVentas(){return ventas;}
    public void setVentas(Venta nuevaVenta){this.ventas.add(nuevaVenta);}
    
}
