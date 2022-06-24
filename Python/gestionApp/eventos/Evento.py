from distutils.dep_util import newer_group


class Evento:
    allEventos = []
    allEventosPendientes = []
    def __init__(self, negocio, descripcion, fecha):
        self.negocio = negocio
        self.descripcion = descripcion
        self.fecha = fecha
        if (negocio.getEtapa().equals("Finalizado")):
            print("No se permiten crear mas Eventos para este negocio, ya que fue cerrado anteriormente")
        else:
            self.negocio.agregarEvento(self)
            Evento.allEventos.append(self)
            
    def getNegocio(self): return self.negocio
    def setNegocio(self,negocio): self.negocio = negocio
    
    def getDescripcion(self): return self.descripcion
    def setDescripcion(self,description): self.descripcion = description
    
    def getFecha(self): return self.fecha
    def setFecha(self,fecha): self.fecha = fecha
    
    @classmethod
    def getAllEventos(cls): return cls.allEventos
    def setAllEventos(cls): cls.allEventos
    
    def getAllEventosPendientes(cls): return cls.allEventosPendientes
    def setAllEventosPendientes(cls,allEventosPendientes): cls.allEventosPendientes
    
