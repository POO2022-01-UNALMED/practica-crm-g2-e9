import pickle
import pathlib
import os

from gestionApp.Empresa import Empresa
from gestionApp.Negocio import Negocio
from gestionApp.Venta import Venta
from gestionApp.eventos.Evento import Evento
from gestionApp.personas.Empleado import Empleado
from gestionApp.personas.Cliente import Cliente
from gestionApp.servicios.Promocion import Promocion
from gestionApp.servicios.Servicio import Servicio


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
