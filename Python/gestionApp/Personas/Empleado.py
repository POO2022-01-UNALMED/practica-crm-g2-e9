import math
from tkinter import messagebox

from Python.gestionApp.Personas import Persona





class Empleado(Persona):
    
    _allEmpleados = []
    _servicios = []
    _negociosEmpleado = []
    _ventas = []
    _idCounter = 0
    
    def __init__(self, nombre, cedula, cel, correo, cargo, fechaContrato):
        super().__init__(nombre, cedula, cel, correo)

        self.cargo = cargo
        self.fechaContrato = fechaContrato
        self.habilidadVenta = math.random()

        Empleado._allEmpleados.append(self)
        messagebox.showinfo(message ='EMPLEADO creada correctamente', title = 'Creacion Empleado')
        
    
    @classmethod    
    def getId(self): return self.id

    @classmethod
    def getCargo(self): return self.cargo
    @classmethod
    def setCargo(self,cargo):self.cargo = cargo
    
    @classmethod
    def getFechaContrato(self): return self.fechaContrato
    @classmethod
    def setFechaContrato(self,fechaContrato):self.fechaContrato = fechaContrato
    
    @classmethod
    def getHabilidadVenta (self): return self.habilidadVenta
        
    @classmethod
    def getAllEmpleados(cls) :return cls._allEmpleados
    @classmethod
    def setAllEmpleados(cls,allEmpleados): cls._allEmpleados = allEmpleados

    @classmethod
    def getServicios(cls): return cls._servicios
    @classmethod
    def setServicios(cls,servicios): cls._servicios = servicios
    
    @classmethod
    def getNegociosEmpleado(cls): return cls._negociosEmpleado
    @classmethod
    def setNegociosEmpleado(cls,negociosEmpleado): cls._negociosEmpleado = negociosEmpleado
    
    