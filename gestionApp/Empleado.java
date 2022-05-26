package gestionApp;

import java.util.ArrayList;

public class Empleado  extends Persona{
    private int cedula;
    private int edad;
    private String cargo;
    private final String fechaInicioContrato;
    private final ArrayList<Servicios> servicios;
    private final ArrayList<Negocio> negociosAbiertos;
    private final ArrayList<Venta> ventas;

    public Empleado(String nombre, String apellido, int telefono, String correo, int cedula, int edad, String cargo, String fechaInicioContrato){
        super(nombre, apellido, telefono, correo);
        this.cedula = cedula;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.servicios = new ArrayList<>();
        this.negociosAbiertos = new ArrayList<>();
        this.ventas = new ArrayList<>();
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

    public String getCargo(){return cargo;}
    public void setCargo(String cargo){this.cargo = cargo;}

    public String getFechaInicioContrato (){return this.fechaInicioContrato;}

    public ArrayList<Servicios> getServicios(){return servicios;}
    public void setServicios(Servicios nuevoServicio){this.servicios.add(nuevoServicio);}

    public ArrayList<Negocio> getNegociosAbiertos(){return negociosAbiertos;}
    public void setNegociosAbiertos(Negocio nuevoNegocio){this.negociosAbiertos.add(nuevoNegocio);}

    public ArrayList<Venta> getVentas(){return ventas;}
    public void setVentas(Venta nuevaVenta){this.ventas.add(nuevaVenta);}
    
}
