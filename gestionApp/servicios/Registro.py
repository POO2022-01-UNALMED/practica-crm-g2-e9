from requests import get
from gestionApp import Negocio
from gestionApp.Empresa import Empresa
from gestionApp.personas.Cliente import Cliente
from gestionApp.personas.Empleado import Empleado
from gestionApp.servicios import Promocion
from gestionApp.servicios.Servicio import Servicio


class Registro:
        

    #REGISTRO        
        
    def registrarEmpleado(nombre, cedula, cel, correo, cargo, fechaInicioContrato): 
        empleado = Empleado(nombre, cedula, cel, correo, cargo, fechaInicioContrato)
        return empleado
    
    def registrarCliento(nombre, cedula, cel, correo, cargo, activo, nit):
        emp = Empresa.buscarEmpresa(nit)
        if (emp != None):
            cliente = Cliente(nombre, emp ,cedula, cel, correo, cargo, activo)
            return cliente
        else: 
            cliente = Cliente(nombre, cedula, cel, correo, cargo, activo)
            return cliente
    def registrarEmpresa(nombre, nit, descripcion):
        empresa = Empresa(nombre, nit, descripcion)
    
    def registroPromocion(descuento, nombre):
        ser = Servicio.buscarServicio(nombre)
        if (ser != None):
            Promocion(descuento,ser)
        else:
            Promocion(descuento)
            
    def registroServicio(nombreServicio, valorProducto, tipo, descripcion):
        servicio = Servicio(nombreServicio, valorProducto, tipo, descripcion)
        return servicio
    
    def registrarNegocio(empleadoEncargado, cliente, valorVenta):
        negocio = Negocio(empleadoEncargado,cliente, valorVenta)
        return negocio
