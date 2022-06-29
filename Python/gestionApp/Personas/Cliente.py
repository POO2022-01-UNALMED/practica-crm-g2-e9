from Python.gestionApp.personas.Persona import Persona


class Cliente(Persona):
    
    allClientes = []
    negociosActivos = []
    listaEventos = []
    idCounter = 0
    
    def __init__(self, nombre, cedula, cel, correo, id, cargo, activo, probCompra ):
        super().__init__(nombre, cedula, cel, correo, )
        self.id = id
        self.cargo = cargo
        self.activo = activo
        self.probCompra = probCompra
    
    @classmethod
    def getId(self): return self.id
    
    @classmethod
    def getCargo(self): return self.cargo
    @classmethod
    def setCargo(self,cargo): self.cargo = cargo
    
    @classmethod
    def getActivo(self): return self.activo
    @classmethod
    def setActivo(self,activo): self.activo = activo
    
    @classmethod
    def getProbCompra(self): return self.probCompra
    @classmethod
    def setProbCompra(self,probCompra): self.probCompra = probCompra
    
    
    @classmethod
    def getAllClientes(cls): return cls.allClientes
    @classmethod
    def setAllClientes(cls, allClientes): cls.allClientes = allClientes
    
    @classmethod
    def getNegociosActivos(cls): return cls.negociosActivos
    @classmethod
    def setNegociosActivos(cls, negociosActivos): cls.negociosActivos = negociosActivos   

    @classmethod
    def getListaEventos(cls): return cls.listaEventos
    @classmethod
    def setListaEventos(cls, listaEventos): cls.listaEventos = listaEventos  
    
   


