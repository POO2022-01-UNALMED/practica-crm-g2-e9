from requests import get
from Python.gestionApp.Empresa import Empresa
from Python.gestionApp.personas.Cliente import Cliente
from Python.gestionApp.personas.Empleado import Empleado


class Registro:
        

            
        
    def registrarEmpleado(nombre, cedula, cel, correo, cargo, fechaInicioContrato): 
        empleado = Empleado(nombre, cedula, cel, correo, cargo, fechaInicioContrato)
        return empleado
    
    def registrarCliento(nombre, cedula, cel, correo, cargo, activo, nit):
        

        emp = Empresa.buscarEmpresa(nit)
        if (emp != None):
            cliente = Cliente(nombre, emp ,cedula, cel, correo, cargo, activo)
            return cliente
        else: 
            cliente = Cliente(nombre, cedula, cel, correo, cargo, activo)
            return cliente
        
 
        

        
        
        
        
    
