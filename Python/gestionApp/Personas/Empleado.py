import math

from Python.gestionApp.personas.Persona import Persona



class Empleado(Persona):
    
    _allEmpleados = []
    _servicios = []
    _negociosEmpleado = []
    _ventas = []
    _idCounter = 0
    
    def __init__(self, nombre, cedula, cel, correo, cargo, fechaContrato):
        super().__init__(nombre, cedula, cel, correo, id)
        self.id = 0 + idCounter
        self.cargo = cargo
        self.fechaContrato = fechaContrato
        self.habilidadVenta = math.random()
        idCounter += 1
        Empleado._allEmpleados.append(self)
        
        
    def getId(self): return self.id

    def getCargo(self): return self.cargo
    def setCargo(self,cargo):self.cargo = cargo
    
    def getFechaContrato(self): return self.fechaContrato
    def setFechaContrato(self,fechaContrato):self.fechaContrato = fechaContrato
    
    def getHabilidadVenta (self): return self.habilidadVenta
        
    @classmethod
    def getAllEmpleados(cls) :return cls._allEmpleados
    def setAllEmpleados(cls,allEmpleados): cls._allEmpleados = allEmpleados

    def getServicios(cls): return cls._servicios
    def setServicios(cls,servicios): cls._servicios = servicios
    
    def getNegociosEmpleado(cls): return cls._negociosEmpleado
    def setNegociosEmpleado(cls,negociosEmpleado): cls._negociosEmpleado = negociosEmpleado
    
    