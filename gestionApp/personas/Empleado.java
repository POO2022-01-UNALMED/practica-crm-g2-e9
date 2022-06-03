package gestionApp.personas;

import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.servicios.Servicio;
import gestionApp.Venta;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado  extends Persona implements Serializable {
    private int cedula;
    private String id;
    private String cargo;
    private  String fechaInicioContrato;
    private  double habilidadVenta;
    public Empresa empresa;
    private  ArrayList<Servicio> servicios;
    private  ArrayList<Negocio> negociosEmpleado;
    private  ArrayList<Venta> ventas;
	private static int idCounter = 0;
    private static ArrayList<Empleado> allEmpleados = new ArrayList<>();

    public Empleado(String nombre, int cedula, String cel, String correo , String cargo, String fechaInicioContrato){
        super(nombre, cedula, cel, correo);
        this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
        this.cargo = cargo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.servicios = new ArrayList<>();
        this.negociosEmpleado = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.habilidadVenta = Math.random(); //numero random entre 0 y 0.4
        idCounter += 1;
        allEmpleados.add(this);
        idCounter += 1;
    }

    //---------------Metodos Heredados---------------

	public String getId(){return this.id;}

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


    public String getCargo(){return cargo;}
    public void setCargo(String cargo){this.cargo = cargo;}

    public String getFechaInicioContrato (){return this.fechaInicioContrato;}

    public ArrayList<Servicio> getServicios(){return servicios;}
    public void setServicios(Servicio nuevoServicio){this.servicios.add(nuevoServicio);}

    public ArrayList<Negocio> getNegociosEmpleado(){return negociosEmpleado;}
    public void setNegociosEmpleado(Negocio nuevoNegocio){this.negociosEmpleado.add(nuevoNegocio);}

    public ArrayList<Venta> getVentas(){return ventas;}
    public void setVentas(Venta nuevaVenta){this.ventas.add(nuevaVenta);}
    
    public static ArrayList<Empleado> getAllEmpleados(){return allEmpleados;}

    public Empresa getEmpresa(){return empresa;}
	public void setEmpresa(Empresa empresa){this.empresa = empresa;}

    public String toStringEmpresa(){
		return "\n////////////////////////////\n" +
		"Empresa: " + getEmpresa().getNombre() +
		"\nNit Empresa: " + getEmpresa().getNit() +
		"\nDescripcion de la empresa a la que pertenece el Empleado: \n" + 
		getEmpresa().getDescripcion() +
		"\n////////////////////////////\n";  
	}
	@Override
	
	public  String toString(){
		return "\tDatos del Empleado \nCliente: "+ nombre +
		 "\nIdentificado con el CC." + cedula + 
		 "\nCelular: " + cel +
		 "\nCorreo: " + correo +
		 "\nID: " + id +
		 "\nCargo: " + cargo +
		 "\nNegocios del Empleado" +negociosEmpleado +
		 "\n/////////////////////////////////////////////\n";
		 
		
	}
}