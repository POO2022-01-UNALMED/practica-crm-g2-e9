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
