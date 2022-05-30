package gestionApp;

import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Promocion;
import gestionApp.servicios.Servicio;

public class Venta {
    int ID;
    Negocio negocio;
    Servicio servicios;
    int valorVenta;
    Empleado empleado;
    Cliente cliente;
    Promocion promocion;

    Venta(int ID, Negocio negocio, Servicio servicio, int valorVenta, Empleado empleado, Cliente cliente, Promocion promocion){
        this.ID = ID;
        this.negocio = negocio;
        this.servicios = servicio;
        this.valorVenta = valorVenta;
        this.empleado = empleado;
        this.cliente = cliente;
        this.promocion = promocion;
    }

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

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


}
