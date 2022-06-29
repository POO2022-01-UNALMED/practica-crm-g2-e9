from requests import get


class Servicio:
    _allServicios = []
    _servicios = []
    _promociones = []
    def __init__(self, nombreServicios, valorProducto, tipo, descripcion):
        self.nombreServicios = nombreServicios
        self.valorProducto = valorProducto
        self.tipo = tipo
        self.description = descripcion
        self._allServicios.append(self)
    
    def getNombreServicio(self): return self.nombreServicios
    def setNombreServicio(self,nombreServicio): self.nombreServicios = nombreServicio
    
    def getValorProducto(self): return self.valorProducto
    def setValorProducto(self,valorProducto): self.valorProducto = valorProducto
    
    def getTipo(self): return self.tipo
    def setTipo(self,tipo): self.tipo = tipo
    
    def getDescripcion(self): return self.description
    def setDescripcion(self,descripcion): self.description = descripcion
    

    
    @classmethod
    def getAllServicios(cls): return cls._allServicios

    


    @classmethod
    def getServicios(cls): return  cls._servicios
    @classmethod
    def addServicios(cls,servicio): cls._allServicios.append(servicio)
    
    @classmethod
    def getPromociones(cls): return cls._promociones
    @classmethod
    def addPromocion(cls,promocion): cls._promociones.append(promocion)
    
    def buscarServicio(nombre):
        for i in range(len(Servicio.getAllServicios())):
            if (Servicio.getAllServicios(Servicio.getNombreServicio(i))):
                return Servicio.getAllServicios(get(i))            