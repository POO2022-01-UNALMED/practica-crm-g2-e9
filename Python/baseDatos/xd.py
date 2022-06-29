from Python.baseDatos.serializador import Serializador
from Python.gestionApp.personas.Empleado import Empleado

empleado = Empleado("Car", 123, 1231, "correo", "cargo", "fechaContrato")

Serializador.serializar()