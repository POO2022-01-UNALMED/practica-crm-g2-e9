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
    
    def getId(self): return self.id
    
    def getCargo(self): return self.cargo
    def setCargo(self,cargo): self.cargo = cargo
    
    def getActivo(self): return self.activo
    def setActivo(self,activo): self.activo = activo
    
    def getProbCompra(self): return self.probCompra
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
