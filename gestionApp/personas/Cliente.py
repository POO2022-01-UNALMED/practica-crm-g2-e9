from random import uniform
from tkinter import messagebox

from gestionApp.Empresa import Empresa
from gestionApp.personas.Persona import Persona
from gestionApp.excepciones import *


class Cliente(Persona):
    allClientes = []
    negociosActivos = []
    listaEventos = []
    idCounter = 0

    def __init__(self, nombre, cedula, cel, correo, cargo, activo):
        super().__init__(nombre, cedula, cel, correo)
        self.id = id
        self.cargo = cargo
        self.activo = activo
        self.probCompra = uniform(0, 0.4)
        Cliente.allClientes.append(self)
        messagebox.showinfo(message='CLIENTE creada correctamente', title='Creacion Cliente')

    def getCargo(self):
        return self.cargo

    def setCargo(self, cargo):
        self.cargo = cargo

    def getActivo(self):
        return self.activo

    def setActivo(self, activo):
        self.activo = activo

    def getProbCompra(self):
        return self.probCompra

    def setProbCompra(self, probCompra):
        self.probCompra = probCompra

    @classmethod
    def getAllClientes(cls):
        return cls.allClientes

    @classmethod
    def setAllClientes(cls, allClientes):
        cls.allClientes = allClientes

    def getProbCompra(self): return self.probCompra
    def setProbCompra(self,probCompra): self.probCompra = probCompra
    
    def getEmpresa(self): return Empresa.getNombre()
    
    
    @classmethod
    def getNegociosActivos(cls):
        return cls.negociosActivos

    @classmethod
    def setNegociosActivos(cls, negociosActivos):
        cls.negociosActivos = negociosActivos

    @classmethod
    def getListaEventos(cls):
        return cls.listaEventos

    @classmethod
    def setListaEventos(cls, listaEventos):
        cls.listaEventos = listaEventos

    @classmethod
    
    def busquedaCliente(cls, cedula):

        for i in range(len(Cliente.getAllClientes())):
            if cedula == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return
            if Cliente.allClientes[i].cedula == cedula:
                return Cliente.getAllClientes()[i]

    @classmethod
    def eliminarCliente(cls, cedula):
       
        for i in range(len(Cliente.getAllClientes())):
            if cedula == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return
            if (Cliente.getAllClientes(Cliente.getCedula(i))):
                return Cliente.getAllClientes(i)   
            if Cliente.allClientes[i].cedula == cedula:
                Cliente.getAllClientes().pop(i)
                      
            if Cliente.allClientes[i].cedula == cedula:
                Cliente.getAllClientes().pop(i)

        messagebox.showinfo(message='CLIENTE eliminado correctamente', title='Eliminacion Cliente')
    
    def infoCliente(self):
        return f'\t---Informacion Cliente---  \n Nombre: {self.nombre} \n Cedula: {self.cedula} \n Celular: {self.celular} \n Cargo: {self.cargo} \n Empresa: {self.getEmpresa}'

