
from datetime import datetime
from Python.gestionApp.personas.Cliente import Cliente

from Python.gestionApp.personas.Empleado import Empleado


class Negocio:

    _allNegocios = []
    _eventos = []
    etapa = ""
    
    
    def __init__ (self, empleadoEncargado, valorVenta):
        self.id = id
        self.empleadoEncargado = empleadoEncargado
        self.cliente = Cliente(self)
        self.valorVenta = valorVenta
        self.fechaCreacion = datetime.now()
        Negocio._allNegocios.append(self)
        Empleado.setNegociosEmpleado(self.empleadoEncargado)
        self.definirEtapa()

    def getId(self): return self.id
    
    def getEtapa(self): return self.etapa
    
    def getCliente(self): return self.cliente
    
    def getEmpleadoEncargado(self): return self.empleadoEncargado
    def setEmpleadoEncargado(self,empleadoEncargado): self.empleadoEncargado = empleadoEncargado
    
    def getValorVenta(self): return self.valorVenta
    def setValorVenta(self,valorVenta): self.valorVenta = valorVenta
    
    def getFechaCreacion(self): return self.fechaCreacion
    def setFechaCreacion(self,fechaCreacion): self.fechaCreacion = fechaCreacion
    

    def definirEtapa(self):
        numLlamadas = 0
        tiempoLlamada = 0.0
        numCorreos = 0
        tamanoCorreos = 0
        numReuniones = 0
        timepoReuniones = 0.0
        calculoMetrica = 0.0
        
        if (len(self._eventos)== 0):
            self.etapa = "Prospeccion"
        else: 
            if (self._eventos.__contains__("No interesado")):
                self.etapa = "Finalizado"
                self.fechaFinalizacion = datetime.now()
            else:
                for i in range(len(self._eventos)):
                    if (self._eventos.get(i)):
                        pass
                    #Aqui va lo que falta de la funcion definir Etapa
                
        
    @classmethod     
    def getAllNegocios(cls): return cls.allNegocios
    @classmethod
    def setAllNegocios(cls,allNegocios): cls.allNegocios = allNegocios
    
    @classmethod
    def getEventos(cls): return cls._eventos
    @classmethod
    def setEventos(cls,_eventos): cls._eventos = _eventos

<<<<<<< Updated upstream
    def infoNegocio(self):
        return f'\t---Informacion Negocio---  \n Empleado Encargado del Negocio: {self.empleadoEncargado} \n Cliente: {self.getCliente} \n Valor de Venta: {self.valorVenta}'

               
=======

>>>>>>> Stashed changes
