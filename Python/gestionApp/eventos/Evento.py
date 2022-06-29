from distutils.dep_util import newer_group
from random import randrange


class Evento:
    allEventos = []
    allEventosPendientes = []
    def __init__(self, negocio, descripcion, fecha):
        self.id = Evento.crear_id()
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

    @classmethod
    def busquedaEvento(cls, id):
        for i in range(len(Evento.getAllEventos())):
            if Evento.getAllEventos()[i].id == id:
                return Evento.getAllEventos()[i]

    @classmethod
    def eliminarServicio(cls, id):
        for i in range(len(Evento.getAllEventos())):
            if Evento.getAllEventos()[i].id == id:
                Evento.getAllEventos().pop(i)

    @classmethod
    def crear_id(cls):
        idGenerado = randrange(0, 1000, 1)
        if len(Evento.getAllEventos()) == 0:
            return idGenerado
        else:
            for i in range(len(Evento.getAllEventos())):
                if idGenerado == Evento.getAllEventos()[i].id:
                    i = 0
                    idGenerado = randrange(0, 1000, 1)
                elif i == len(Evento.getAllEventos()) - 1:
                    return idGenerado