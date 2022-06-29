from tkinter import messagebox
from gestionApp.excepciones import *

class Empresa:
    
    allEmpresas = []
    clientes = []
    negociosAbiertos = []
    ventas = []
    serviciosInteres = []
    def __init__(self, nombre, nit, description):
        self.nombre = nombre
        self.nit = nit
        self.description = description
        self.allEmpresas.append(self)
        messagebox.showinfo(message ='EMPRESA creada correctamente', title = 'Creacion Empresa')

    def getNombre(self): return self.nombre
    def setNombre(self,nombre): self.nombre = nombre
    
    def getNit(self): return self.nombre
    def setNit(self,nit): self.nit = nit
    
    def getDescripcion(self): return self.description
    def setDescripcion(self,description): self.description = description
        
    @classmethod    
    def getAllEmpresas(cls): return cls.allEmpresas
    @classmethod
    def setAllEmpresas(cls,allEmpresas): cls.allEmpresas = allEmpresas
    
    @classmethod
    def getClientes(cls): return cls.clientes
    @classmethod
    def setClientes(cls,clientes): cls.clientes = clientes
    
    @classmethod
    def getNegociosAbiertos(cls): return cls.negociosAbiertos
    @classmethod
    def setNegociosAbiertos(cls,negociosAbiertos): cls.negociosAbiertos = negociosAbiertos
    
    @classmethod
    def getVentas(cls): return cls.ventas
    @classmethod
    def setVentas(cls,ventas): cls.ventas = ventas 
    
    @classmethod
    def getServiciosInteres(cls): return cls.serviciosInteres
    @classmethod
    def setServiciosInteres(cls,serviciosInteres): cls.serviciosInteres = serviciosInteres

    @classmethod
    def busquedaEmpresa(cls, nit):
        for i in range(len(Empresa.getAllEmpresas())):
            if nit == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return
            if Empresa.getAllEmpresas()[i].nit == nit:
                return Empresa.getAllEmpresas()[i]

    @classmethod
    def eliminarEmpresa(cls, nit):
        for i in range(len(Empresa.getAllEmpresas())):
            if nit == str:
                try:
                    raise ExcepcionCamposNulos()
                except ExcepcionCamposNulos as f:
                    f.showMessage()
                return           
            if Empresa.allEmpresas[i].nit == nit:
                Empresa.getAllEmpresas().pop(i)
        messagebox.showinfo(message='EMPRESA eliminada correctamente', title='Eliminacion Empresa')

    def infoEmpresa(self):
        return f'\t---Informacion Empresa---  \n Nombre: {self.nombre} \n Nit: {self.nit} \n Descripcion: {self.descripcion}'

                   






