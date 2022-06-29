import pickle
import pathlib
import os

from Python.gestionApp.Empresa import Empresa
from Python.gestionApp.Negocio import Negocio
from Python.gestionApp.Venta import Venta
from Python.gestionApp.eventos.Evento import Evento
from Python.gestionApp.personas.Empleado import Empleado
from Python.gestionApp.personas.Cliente import Cliente
from Python.gestionApp.servicios.Promocion import Promocion
from Python.gestionApp.servicios.Servicio import Servicio


class Serializador:

    @classmethod
    def serializar(cls):
        datos = {
            "empleado": Empleado.getAllEmpleados(),
            "cliente": Cliente.getAllClientes(),
            "empresa": Empresa.getAllEmpresas(),
            "negocio": Negocio.getAllNegocios(),
            "venta": Venta.getAllVentas(),
            "servicio": Servicio.getAllServicios(),
            "promocion": Promocion.getAllPromociones(),
            "evento": Evento.getAllEventos()
        }

        for archivo, dato in datos.items():
            picklefile = open(os.path.join(pathlib.Path(__file__).parent.absolute(), f"temp\\{archivo}"), "wb")
            pickle.dump(dato, picklefile)
            picklefile.close()
