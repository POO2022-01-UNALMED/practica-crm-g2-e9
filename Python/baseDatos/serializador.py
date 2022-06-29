import pickle
import pathlib
import os

from Python.gestionApp.personas.Empleado import Empleado
from Python.gestionApp.personas.Cliente import Cliente


class Serializador:

    @classmethod
    def serializar(cls):
        datos = {
            "empleado": Empleado.getAllEmpleados(),
            "cliente": Cliente.getAllClientes()
        }

        for archivo, dato in datos.items():
            picklefile = open(os.path.join(pathlib.Path(__file__).parent.absolute(), f"temp\\{archivo}"), "wb")
            pickle.dump(dato, picklefile)
            picklefile.close()
