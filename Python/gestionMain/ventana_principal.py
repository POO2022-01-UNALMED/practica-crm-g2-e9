import time
from tkinter import*
from PIL import ImageTk, Image
from tkinter import messagebox
from operator import itemgetter

import sys
import os

# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, os.getcwd().split('\\Python\\gestionMain')[0])

#from Python.gestionApp.Personas.Empleado import Empleado
#from Python.gestionApp.Personas.Cliente import Cliente
from Python.gestionApp.Empresa import Empresa

### Definicion
app_desc = 'Esta es la descripcion de la aplicacion'
app_func = 'Esto es lo que hace la app'

### Funciones


def funcionesAplicacion():
    global app_desc
    messagebox.showinfo(message = app_func, title = 'Descripcion Aplicacion')

def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')


### Clase Generadora

class FieldFrame(Frame):
    def __init__(self, frame = None, tituloCriterios = None, criterios = None, tituloValores = None, valores = None, deshabilitado = None, botones = None):

        if not isinstance(frame, Frame):
            raise TypeError("frame should be Frame type")

        if not isinstance(tituloCriterios, str):
            raise TypeError("tituloCriterios should be str type")

        if not isinstance(criterios, list):
            raise TypeError("criterios should be list type")

        if not isinstance(tituloValores, str):
            raise TypeError("tituloValores should be str type")

        if valores!=None:
            if not isinstance(valores, list):
                raise TypeError("valores should be list type")

        if deshabilitado!=None:
            if not isinstance(deshabilitado, list):
                raise TypeError("deshabilitado should be list type")

        if botones!=None:
            if not isinstance(botones, dict):
                raise TypeError("botones should be dict type")
        
        
        self.frame = frame
        self.tituloCriterios = tituloCriterios
        self.criterios = criterios
        self.tituloValores = tituloValores
        self.valores = valores
        self.deshabilitado = deshabilitado
        self.botones = botones

        for widget in self.frame.winfo_children():
            widget.destroy()
        
        self.generarCriterios()
        self.generarValores()
        self.deshabilitarIngresos()
        self.crearBotones()
        self.frame.update()

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

    def crearBotones(self):
        if self.botones != None:
            fila = len(self.criterios)
            columna = 0
        
            for textoBoton in self.botones.keys():
                if columna > 1:
                    columna = 0
                    fila += 1
                    
                Button(self.frame, text=textoBoton, command=self.botones[textoBoton]).grid(row = fila, column=columna)
                columna += 1
                
    

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

def vaciarCampos(frame):
    for widget in frame.winfo_children():
        if widget.winfo_class() == 'Entry':
            widget.delete(0, 'end')

def funcWrapper(func, args):
    func(*args)

def setValores(frame, classDestino):
    entryValues = []
    for widget in frame.winfo_children():
        if widget.winfo_class() == 'Entry':
            entryValues.append(widget.get())
    funcWrapper(classDestino, entryValues)
    


def camposCrearEmpresa():

    global nombreProceso, descipcionProceso

    nombreProceso['text'] = 'Crear Empresa'
    descipcionProceso['text'] = 'Este proceso permite añadir una nueva EMPRESA a la base de datos'
        
    camposCrearEmpresa = FieldFrame(frame = F23,
           tituloCriterios = 'Criterios',
           criterios = ['Nombre', 'Nit','Descripcion'],
           tituloValores = 'Valores',
           valores = None,
           deshabilitado = None,
           botones = {'Crear Empresa' : lambda: setValores(F23, Empresa), 'Vaciar Campos': lambda:vaciarCampos(F23)}
           )
    
def camposCrearCliente():

    global nombreProceso, descipcionProceso

    nombreProceso['text'] = 'Crear Cliente'
    descipcionProceso['text'] = 'Este proceso permite añadir un nuevo CLIENTE a la base de datos'
    
    FieldFrame(frame = F23,
           tituloCriterios = 'Criterios',
           criterios = ['Nombre', 'Cedula','Celular','Correo','Cargo','Activo','Probabilidad de Compra'],
           tituloValores = 'Valores',
           valores = None,
           deshabilitado = None,
           botones = {'Crear cliente' : lambda:setValores(F23, Cliente), 'Vaciar Campos': lambda:vaciarCampos(F23)}
           )


def camposCrearEmpleado():

    global nombreProceso, descipcionProceso

    nombreProceso['text'] = 'Crear Empleado'
    descipcionProceso['text'] = 'Este proceso permite añadir un nuevo EMPLEADO a la base de datos'
    
    FieldFrame(frame = F23,
           tituloCriterios = 'Criterios',
           criterios = ['Nombre', 'Cedula','Celular','Correo','Cargo','Fecha Contrato'],
           tituloValores = 'Valores',
           valores = None,
           deshabilitado = None,
           botones = {'Crear Empleado' : lambda:setValores(F23, Cliente), 'Vaciar Campos': lambda:vaciarCampos(F23)}
           )


menu = Menu(ventanaPrincipal)
ventanaPrincipal.config(menu=menu)

Archivo = Menu(menu)
menu.add_cascade(label="Archivo", menu=Archivo)
Archivo.add_command(label="Aplicacion",command=funcionesAplicacion)
Archivo.add_command(label="Salir",command=ventanaPrincipal.destroy)

Procesos_Consultas = Menu(menu)
menu.add_cascade(label="Procesos y Consultas", menu=Procesos_Consultas)
Procesos_Consultas.add_command(label="Crear Empresa",command=camposCrearEmpresa)
Procesos_Consultas.add_command(label="Crear Cliente",command=camposCrearCliente)

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
descipcionProceso.place(anchor=CENTER, relx=0.5, rely=0.5)

##########################################################################
### Frame 2.3
##########################################################################

F23 = Frame(F21, background="blue", height = 100, width = 100)
F23.grid(row=2, column=0, padx = 100, pady = 100, sticky="news")

F23.columnconfigure(0, weight=1)
F23.columnconfigure(1, weight=1)
   
ventanaPrincipal.mainloop()
