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


class Deserializador():

    def deserializar():
        datos = {
            "empleado": lambda x: Empleado.setAllEmpleados(x),
            "cliente": lambda x: Cliente.setAllClientes(x),
            "empresa": lambda x: Empresa.setAllEmpresas(x),
            "negocio": lambda x: Negocio.setAllNegocios(x),
            "venta": lambda x: Venta.setAllVentas(x),
            "servicio": lambda x: Servicio.setAllServicios(x),
            "promocion": lambda x: Promocion.setAllPromociones(x),
            "evento": lambda x: Evento.setAllEventos(x)
        }

        for archivo, set in datos.items():
            picklefile = open(os.path.join(pathlib.Path(__file__).parent.absolute(), f"temp\\{archivo}"), "rb")
            dato = pickle.load(picklefile)
            set(dato)
            picklefile.close()
