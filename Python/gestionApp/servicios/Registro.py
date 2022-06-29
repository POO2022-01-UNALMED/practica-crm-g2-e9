from requests import get
from Python.gestionApp import Negocio
from Python.gestionApp.Empresa import Empresa
from Python.gestionApp.personas.Cliente import Cliente
from Python.gestionApp.personas.Empleado import Empleado
from Python.gestionApp.servicios import Promocion
from Python.gestionApp.servicios.Servicio import Servicio


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
