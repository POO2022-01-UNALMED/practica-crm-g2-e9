package gestionApp;

import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Promocion;
import gestionApp.servicios.Servicio;

public class Venta {
    private String id;
    private Negocio negocio;
    private Servicio servicios;
    private int valorVenta;
    private Empleado empleado;
    private Cliente cliente;
    private Promocion promocion;
    final private int IVA = 19; 

    private static int idCounter = 0;

    Venta(Negocio negocio, Servicio servicio, int valorVenta, Empleado empleado, Cliente cliente, Promocion promocion,int IVA ){
        this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
        this.negocio = negocio;
        this.servicios = servicio;
        this.valorVenta = valorVenta;
        this.empleado = empleado;
        this.cliente = cliente;
        this.promocion = promocion;
        idCounter += 1;
    }

    public String getId() {return id;}

    public Negocio getNegocio() {return negocio;}
    public void setNegocio(Negocio negocio) {this.negocio = negocio;}

    public Servicio getServicios() {return servicios;}
    public void setServicios(Servicio servicios) {this.servicios = servicios;}

    public int getValorVenta() {return valorVenta;}
    public void setValorVenta(int valorVenta) {this.valorVenta = valorVenta;}

    public Empleado getEmpleado() {return empleado;}
    public void setEmpleado(Empleado empleado) {this.empleado = empleado;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Promocion getPromocion() {return promocion;}
    public void setPromocion(Promocion promocion) {this.promocion = promocion;}

    public int getIVA() {return IVA;}


    


}
