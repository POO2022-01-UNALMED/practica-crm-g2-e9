from pydoc import describe
from random import randrange


class Promocion:
    servicios = []
    allPromociones = []

    def __init__(self, descuento, servicio):
        self.id = Promocion.crear_id()
        self.descuento = descuento
        self.servicios = servicio

    def getId(self):
        return self.id

    def getDescuento(self):
        return self.descuento

    def setDescuento(self, descuento):
        self.descuento = descuento

    def getServicios(self):
        return self.servicios

    def setServicios(self, servicios):
        self.servicios = servicios

    @classmethod
    def getServicios(cls):
        return cls.servicios

    @classmethod
    def setServicios(cls):
        cls.servicios

    @classmethod
    def getAllPromociones(cls):
        return cls.allPromociones

    @classmethod
    def setAllPromociones(cls, allPromociones):
        cls.allPromociones = allPromociones

    @classmethod
    def busquedaPromocion(cls, id):
        for i in range(len(Promocion.getAllPromociones())):
            if Promocion.getAllPromociones()[i].id == id:
                return Promocion.getAllPromociones()[i]

    @classmethod
    def eliminarPromocion(cls, id):
        for i in range(len(Promocion.getAllPromociones())):
            if Promocion.getAllPromociones()[i].id == id:
                Promocion.getAllPromociones().pop(i)

    @classmethod
    def crear_id(cls):
        idGenerado = randrange(0, 1000, 1)
        if len(Promocion.getAllPromociones()) == 0:
            return idGenerado
        else:
            for i in range(len(Promocion.getAllPromociones())):
                if idGenerado == Promocion.getAllPromociones()[i].id:
                    i = 0
                    idGenerado = randrange(0, 1000, 1)
                elif i == len(Promocion.getAllPromociones()) - 1:
                    return idGenerado
