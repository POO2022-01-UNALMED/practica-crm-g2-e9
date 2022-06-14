import math

from Python.gestionApp.personas.Persona import Persona



class Empleado(Persona):
    
    allEmpleados = []
    servicios = []
    negociosEmpleado = []
    ventas = []
    idCounter = 0
    
    def __init__(self, nombre, cedula, cel, correo, cargo, fechaContrato):
        super().__init__(nombre, cedula, cel, correo, id)
        self.id = 0+idCounter
        self.cargo = cargo
        self.fechaContrato = fechaContrato
        self.habilidadVenta = math.random()
        idCounter += 1
        Empleado.setAllEmpleados.append(self)
        
    def getId(self): return self.id

    def getCargo(self): return self.cargo
    def setCargo(self,cargo):self.cargo = cargo
    
    def getFechaContrato(self): return self.fechaContrato
    def setFechaContrato(self,fechaContrato):self.fechaContrato = fechaContrato
    
    def getHabilidadVenta (self): return self.habilidadVenta
        
    @classmethod
    def getAllEmpleados(cls) :return cls.allEmpleados
    @classmethod
    def setAllEmpleados(cls,allEmpleados): cls.allEmpleados = allEmpleados
    
    @classmethod
    def getServicios(cls): return cls.servicios
    @classmethod
    def setServicios(cls,servicios): cls.servicios = servicios
    
    @classmethod
    def getNegociosEmpleado(cls): return cls.negociosEmpleado
    @classmethod
    def setNegociosEmpleado(cls,negociosEmpleado): cls.negociosEmpleado = negociosEmpleado
    
    