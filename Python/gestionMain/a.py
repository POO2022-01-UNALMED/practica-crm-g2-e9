from Python.gestionApp.Negocio import Negocio
from Python.gestionApp.personas.Cliente import Cliente
from Python.gestionApp.personas.Empleado import Empleado
from Python.gestionApp.personas.Persona import Persona
from Python.gestionApp.servicios.Servicio import Servicio

if __name__ == "__main__":
    # persona1 = Persona("Carlos",100,310,"carlos@unal.edu.co")
    # print(persona1.nombre)

    #empleado1 = Empleado("Carlos", 100, 310, "carlos@unal.edu.co", "recogeCucarachas", "10/10/2010")
    # cliente1 = Cliente("Adres", 101, 311, "andres@unal.edu.co", 1001, "Cajero", True)
    # neg = Negocio(empleado1, cliente1, 100)

    empleado2 = Empleado("DA", 101, 310, "carlos@unal.edu.co", "recogeCucarachas", "10/10/2010")

    #empleado3 = Empleado("EWE", 102, 310, "carlos@unal.edu.co", "recogeCucarachas", "10/10/2010")

    #empleado4 = Empleado("FASA", 103, 310, "carlos@unal.edu.co", "recogeCucarachas", "10/10/2010")
    print(len(Servicio.getAllServicios()))
    print(Servicio.crear_id())
    Servicio1 = Servicio("a", 1, "a", "aa")
    Servicio1 = Servicio("b", 4, "a", "aa")
    Servicio1 = Servicio("c", 3, "a", "aa")
    Servicio1 = Servicio("d", 9, "a", "aa")

    for i in range(len(Servicio.getAllServicios())):
        print(Servicio.getAllServicios()[i].id)
    #print(Empleado.eliminarEmpleado(103))
    #print(Empleado.busquedaEmpleado(103).nombre)
