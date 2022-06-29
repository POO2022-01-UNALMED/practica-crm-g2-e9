from tkinter import messagebox

from requests import get


class Empresa:
    allEmpresas = []
    clientes = []
    negociosAbiertos = []
    ventas = []
    serviciosInteres = []
    def __init__(self, nombre, nit, description):
        self.id = 0 
        self.nombre = nombre
        self.nit = nit
        self.description = description
        self.allEmpresas(self)
        
        
    def getId(self): return self.id
    
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
    
    def buscarEmpresa(nit):
        for i in range(len(Empresa.getAllEmpresas())):
            if (Empresa.getAllEmpresas(Empresa.getNit(i))):
                return Empresa.getAllEmpresas(get(i))     
