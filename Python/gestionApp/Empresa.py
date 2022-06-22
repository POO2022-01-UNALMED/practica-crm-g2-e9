
class Empresa:
    allEmpresas = []
    clientes = []
    negociosAbiertos = []
    ventas = []
    serviciosInteres = []
    def __init__(self, id, nombre, nit, description):
        self.id = id 
        self.nombre = nombre
        self.nit = nit
        self.description = description
        
    def getId(self): return self.id
    
    def getNombre(self): return self.nombre
    def setNombre(self,nombre): self.nombre = nombre
    
    def getNit(self): return self.nombre
    def setNit(self,nit): self.nit = nit
    
    def getDescripcion(self): return self.description
    def setDescripcion(self,description): self.description = description
        
    @classmethod    
    def getAllEmpresas(cls): return cls.allEmpresas
    def setAllEmpresas(cls,allEmpresas): cls.allEmpresas = allEmpresas
    
    def getClientes(cls): return cls.clientes
    def setClientes(cls,clientes): cls.clientes = clientes
    
    def getNegociosAbiertos(cls): return cls.negociosAbiertos
    def setNegociosAbiertos(cls,negociosAbiertos): cls.negociosAbiertos = negociosAbiertos
    
    def getVentas(cls): return cls.ventas
    def setVentas(cls,ventas): cls.ventas = ventas 
    
    def getServiciosInteres(cls): return cls.serviciosInteres
    def setServiciosInteres(cls,serviciosInteres): cls.serviciosInteres = serviciosInteres
    