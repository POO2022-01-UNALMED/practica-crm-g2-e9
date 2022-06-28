import time
from tkinter import*
from PIL import ImageTk, Image
from tkinter import messagebox
from operator import itemgetter

### Definicion
counter_hojaDeVida = -1
list_hojaDeVida = ["hoja1","hoja2","hoja3"]

app_desc = 'Esta es la descripcion de la aplicacion'
app_func = 'Esto es lo que hace la app'

### Funciones


def funcionesAplicacion():
    global app_desc
    messagebox.showinfo(message = app_func, title = 'Descripcion Aplicacion')

def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')


##########################################################################
### root
##########################################################################

ventanaPrincipal = Tk()
ventanaPrincipal.title("Ventana Principal")
ventanaPrincipal.geometry("700x700")
ventanaPrincipal.resizable(0, 0)

ventanaPrincipal.columnconfigure(0, weight=1)
ventanaPrincipal.rowconfigure(0, weight=1)



### Barra Menu

def command():
    pass

def crearEmpresa():
    FieldFrame(F23,
           'Criterios',
           ['Nombre', 'Nit','Pais'],
           'Valores',
           ['1','2',''],
           ['Nombre']
           )
    F23.update()


def crearCliente():
    FieldFrame(F23,
           'Criterios',
           ['Nombre', 'Apellido','Pais'],
           'Valores',
           ['1','2',''],
           None
           )
    F23.update()

menu = Menu(ventanaPrincipal)
ventanaPrincipal.config(menu=menu)

Archivo = Menu(menu)
menu.add_cascade(label="Archivo", menu=Archivo)
Archivo.add_command(label="Aplicacion",command=funcionesAplicacion)
Archivo.add_command(label="Salir",command=ventanaPrincipal.destroy)

Procesos_Consultas = Menu(menu)
menu.add_cascade(label="Procesos y Consultas", menu=Procesos_Consultas)
Procesos_Consultas.add_command(label="Crear Empresa",command=crearEmpresa)
Procesos_Consultas.add_command(label="Crear Cliente",command=crearCliente)

Ayuda = Menu(menu)
menu.add_cascade(label="Ayuda", menu=Ayuda)
Ayuda.add_command(label="Acerca de",command=mostrarDescripcion)

##########################################################################
### Frame 2.1
##########################################################################


F21 = Frame(ventanaPrincipal, background="white", height = 100, width = 100)
F21.grid(row=0, column=0, sticky="news")
F21.rowconfigure(0, weight=0)
F21.rowconfigure(1, weight=2)
F21.rowconfigure(2, weight=8)
F21.columnconfigure(0, weight=1)
F21.grid_propagate(False)

nombreProceso = Label(F21, text = 'Nombre Proceso')
nombreProceso.grid(row = 0, column = 0)

##########################################################################
### Frame 2.2
##########################################################################


F22 = Frame(F21, background="green", height = 100, width = 100)
F22.grid(row=1, column=0, sticky="news")

descipcionProceso = Label(F22, text = 'Descripcion Proceso')
descipcionProceso.grid(row = 0, column = 0)

##########################################################################
### Frame 2.3
##########################################################################

F23 = Frame(F21, background="blue", height = 100, width = 100)
F23.grid(row=2, column=0, padx = 100, pady = 100, sticky="news")

F23.columnconfigure(0, weight=1)
F23.columnconfigure(1, weight=1)

### Crear Empresa

class FieldFrame(Frame):
    def __init__(self, frame, tituloCriterios, criterios, tituloValores, valores, deshabilitado):
        self.frame = frame
        self.tituloCriterios = tituloCriterios
        self.criterios = criterios
        self.tituloValores = tituloValores
        self.valores = valores
        self.deshabilitado = deshabilitado
        self.generarCriterios()
        self.generarValores()
        self.deshabilitarIngresos()

    def generarCriterios(self):

        label_criterios = [
            Label(self.frame, text = str(criterio))
            for criterio in self.criterios
        ]

        for index, criterio in enumerate(label_criterios):
            criterio.grid(row = index, column = 0)

    def generarValores(self):
        if self.valores == None:

            self.camposValores = [
                Entry(self.frame)
                for valor in self.criterios
            ]
            
            for index, valor in enumerate(self.camposValores):
                valor.grid(row = index, column = 1, sticky="news")
                                
        else:
            self.camposValores = [
                Entry(self.frame)
                for valor in self.valores
            ]
            
            for index, valor in enumerate(self.camposValores):
                valor.insert(-1, self.valores[index])
                valor.grid(row = index, column = 1, sticky="news")
                

    def deshabilitarIngresos(self):
        if self.deshabilitado != None:
            for index, valor in enumerate(self.camposValores):
                if self.criterios[index] in self.deshabilitado:
                    valor.config(state= "disabled")
        
    



ventanaPrincipal.mainloop()
