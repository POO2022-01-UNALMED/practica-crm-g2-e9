from Python.gestionApp.Personas.Cliente import Cliente
from Python.gestionApp.Personas.Empleado import Empleado
from Python.gestionApp.Personas.Persona import Persona

if __name__ == "__main__":
    persona1 = Persona("Carlos",100,310,"carlos@unal.edu.co")
    print(persona1.nombre)

    #empleado1 = Empleado("Carlos", 100, 310, "carlos@unal.edu.co", "recogeCucarachas", "10/10/2010")
    cliente1 = Cliente("Adres", 101, 311, "andres@unal.edu.co", 1001, "Cajero", True)