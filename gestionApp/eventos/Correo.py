from gestionApp.eventos.Evento import Evento


class Correo(Evento):
    def __init__(self, negocio, descripcion, fecha, cantidadPalabras):
        super().__init__(negocio, descripcion, fecha)
        self.cantidadPalabras = cantidadPalabras
