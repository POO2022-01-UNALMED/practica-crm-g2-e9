
from datetime import datetime
from Python.gestionApp import eventos
from Python.gestionApp.eventos.Evento import Evento

from Python.gestionApp.personas.Empleado import Empleado



class Negocio:

    _allNegocios = []
    _eventos = []
    
    
    def __init__ (self, empleadoEncargado, cliente, valorVenta):
        self.id = id
        self.empleadoEncargado = Empleado(self)
        self.cliente = cliente
        self.valorVenta = valorVenta
        self.fechaCreacion = datetime.now()
        Negocio.allNegocios.append(self)
        self.empleado = Empleado(self)
        empleadoEncargado(Empleado.setNegociosEmpleado(self))
        self.definirEtapa()

    def getId(self): return self.id
    
    def getEmpleadoEncargado(self): return self.empleadoEncargado
    def setEmpleadoEncargado(self,empleadoEncargado): self.empleadoEncargado = empleadoEncargado
    
    def getValorVenta(self): return self.valorVenta
    def setValorVenta(self,valorVenta): self.valorVenta = valorVenta
    
    def getFechaCreacion(self): return self.fechaCreacion
    def setFechaCreacion(self,fechaCreacion): self.fechaCreacion = fechaCreacion
    
    
    
        
    
    def definirEtapa():
        numLlamadas = 0
        tiempoLlamada = 0.0
        numCorreos = 0
        tamanoCorreos = 0
        numReuniones = 0
        timepoReuniones = 0.0
        calculoMetrica = 0.0
        
        if ():
            self.etapa = "Prospeccion"
        
        
    @classmethod     
    def getAllNegocios(cls): return cls.allNegocios
    @classmethod
    def setAllNegocios(cls,allNegocios): cls.allNegocios = allNegocios
    
    @classmethod
    def getEventos(cls): return cls._eventos
    def setEventos(cls,_eventos): cls._eventos = _eventos
