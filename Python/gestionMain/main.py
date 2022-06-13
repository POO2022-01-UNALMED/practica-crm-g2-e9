

from Python.gestionMain.uiMain.uiCliente import uiClientes
from Python.gestionMain.uiMain.uiEmpleado import uiEmpleados
from Python.gestionMain.uiMain.uiEmpresa import uiEmpresa
from Python.gestionMain.uiMain.uiNegocio import uiNegocios
from Python.gestionMain.uiMain.uiServicios import uiServicios


if __name__ == "__main__":
    
    def menuPrincipal():
        uiEmpresa.menuEmpresa()
        uiClientes.menuClientes()
        uiEmpleados.menuEmpleados()
        uiNegocios.menuNegocio()
        uiServicios.menuServicios()
        
