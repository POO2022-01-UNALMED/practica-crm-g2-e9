from http import client
import re


class Venta:

    allVentas = []
    
    def __init__(self,negocio, servicio, valorVenta, empleado, cliente, promocion, IVA):
        
        self.negocio = negocio
        self.servicios = servicio
        self.valorVenta = valorVenta
        self.empleado = empleado
        self.cliente = cliente
        self.promocion = promocion
    
    def getId(self): return self.id
    
    def getNegocio(self): return self.negocio
    def setNegocio(self,negocio): self.negocio = negocio
    
    def getServicios(self): return self.servicios
    def setServicios(self,servicios): self.servicios = servicios
    
    def getValorVenta(self): return self.valorVenta
    def setValorVenta(self,valorVenta): self.valorVenta = valorVenta
    
    def getEmpleado(self): return self.empleado
    def setEmpleado(self,empleado): self.empleado = empleado
    
    def getCliente(self): return self.cliente
    def setCliente(self,cliente): self.cliente = cliente
    
    def getPromocion(self): return self.promocion
    def setPromocion(self,promocion): self.promocion = promocion
    
    @classmethod
    def getServicios(cls): return cls.servicios
    @classmethod
    def setServicios(cls): cls.servicios
    
    @classmethod
    def getAllVentas(cls): return cls.allVentas
    @classmethod
    def setAllVentas(cls,allVentas): cls.allVentas = allVentas