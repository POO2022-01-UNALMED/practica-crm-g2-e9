from pydoc import describe


class Promocion:
    servicios = []
    allPromociones = [] 
    def __init__(self, descuento, servicio):
        self.id = id 
        self.descuento = descuento
        self.servicios = servicio
    
    def getId(self): return self.id
    
    def getDescuento(self): return self.descuento
    def setDescuento(self,descuento): self.descuento = descuento
    
    def getServicios(self): return self.servicios
    def setServicios(self,servicios): self.servicios = servicios

        
    @classmethod
    def getServicios(cls): return cls.servicios
    @classmethod
    def setServicios(cls): cls.servicios
    
    @classmethod
    def getAllPromociones(cls): return cls.allPromociones
    @classmethod
    def setAllPromociones(cls,allPromociones): cls.allPromociones = allPromociones
    
    def eliminarServicio(self):
        Promocion.getAllPromociones().remove(self)
        