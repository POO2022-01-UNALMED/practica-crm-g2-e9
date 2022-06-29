from tkinter import messagebox
from datetime import datetime
from random import randrange
from excepciones import *

from gestionApp.eventos.Reunion import Reunion
from gestionApp.eventos.Correo import Correo
from gestionApp.personas.Empleado import Empleado


class Negocio:
    _allNegocios = []
    _eventos = []
    etapa = ""

    def __init__(self, empleadoEncargado, cliente, valorVenta):
        self.id = Negocio.crear_id()
        self.empleadoEncargado = empleadoEncargado
        self.cliente = cliente
        self.valorVenta = valorVenta
        self.fechaCreacion = datetime.now()
        Negocio._allNegocios.append(self)
        Empleado.setNegociosEmpleado(self.empleadoEncargado)
        self.definirEtapa()
        messagebox.showinfo(message='NEGOCIO creada correctamente', title='Creacion Negocio')

    def getId(self):
        return self.id

    def getEtapa(self):
        return self.etapa

    def getEmpleadoEncargado(self):
        return self.empleadoEncargado

    def setEmpleadoEncargado(self, empleadoEncargado):
        self.empleadoEncargado = empleadoEncargado

    def getValorVenta(self):
        return self.valorVenta

    def setValorVenta(self, valorVenta):
        self.valorVenta = valorVenta

    def getFechaCreacion(self):
        return self.fechaCreacion

    def setFechaCreacion(self, fechaCreacion):
        self.fechaCreacion = fechaCreacion

    def definirEtapa(self):
        numLlamadas = 0
        tiempoLlamada = 0.0
        numCorreos = 0
        tamanoCorreos = 0
        numReuniones = 0
        timepoReuniones = 0.0
        calculoMetrica = 0.0

        if (len(self._eventos) == 0):
            self.etapa = "Prospeccion"
        else:
            if (self._eventos.__contains__("No interesado")):
                self.etapa = "Finalizado"
                self.fechaFinalizacion = datetime.now()
            else:
                for i in range(len(self._eventos)):
                    if (self._eventos[i] in Reunion):
                        timepoReuniones += (Reunion.getDuracionReunion(self._eventos[i]))
                        numReuniones += 1
                    elif (self._eventos[i] in Correo):
                        tiempoLlamada += (Correo.getDuracionLlamada(self._eventos[i]))
                    # Aqui va lo que falta de la funcion definir Etapa

    @classmethod
    def getAllNegocios(cls):
        return cls._allNegocios

    @classmethod
    def setAllNegocios(cls, allNegocios):
        cls.allNegocios = allNegocios

    @classmethod
    def getEventos(cls):
        return cls._eventos

    @classmethod
    def setEventos(cls, _eventos):
        cls._eventos = _eventos

    def infoNegocio(self):
        return f'\t---Informacion Negocio---  \n Empleado Encargado del Negocio: {self.empleadoEncargado} \n Cliente: {self.getCliente} \n Valor de Venta: {self.valorVenta}'

    @classmethod
    def busquedaNegocio(cls, id):
        for i in range(len(Negocio.getAllNegocios())):
            if id == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return
            if Negocio.getAllNegocios()[i].id == id:
                return Negocio.getAllNegocios()[i]

    @classmethod
    def eliminarNegocio(cls, id):
        for i in range(len(Negocio.getAllNegocios())):
            if id == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return
            if Negocio.getAllNegocios()[i].id == id:
                Negocio.getAllNegocios().pop(i)

    @classmethod
    def crear_id(cls):
        idGenerado = randrange(0, 1000, 1)
        if len(Negocio.getAllNegocios()) == 0:
            return idGenerado
        else:
            for i in range(len(Negocio.getAllNegocios())):
                if idGenerado == Negocio.getAllNegocios()[i].id:
                    i = 0
                    idGenerado = randrange(0, 1000, 1)
                elif i == len(Negocio.getAllNegocios()) - 1:
                    return idGenerado
