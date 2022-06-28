from uiMain.uiCliente import uiClientes
from uiMain.uiEmpleado import uiEmpleados
from uiMain.uiEmpresa import uiEmpresa
from uiMain.uiNegocio import uiNegocios
from uiMain.uiServicios import uiServicios

from doctest import master
from tkinter import *
import tkinter as tk
from turtle import width


if __name__ == "__main__":

    def funcionPruebas():
        pass

    def menuPrincipal():
        uiEmpresa.menuEmpresa()
        uiClientes.menuClientes()
        uiEmpleados.menuEmpleados()
        uiNegocios.menuNegocio()
        uiServicios.menuServicios()


    ventana=Tk()
    ventana.title("Ventana de inicio")
    ventana.geometry("1000x700")
    ventana.resizable(width=False, height=False)
    ventana.option_add('*tearOff', FALSE)


    menu = Menu(ventana)
    menu1 = Menu(menu)
    menu2 = Menu(menu)
    menu.add_cascade(menu=menu1, label='Inicio' )

    menu1.add_command(label="Descripcion", )
    menu1.add_command(label="Salir", )
    ventana['menu'] = menu


    framea= tk.Frame(ventana, borderwidth=0, relief="ridge", width=500, height=700)
    frameb = tk.Frame(ventana, borderwidth=0, relief="ridge", width=500, height=700)
    frame1 = tk.Frame(framea,borderwidth=2,relief="flat", bg="#FFFFFF" ,width=500, height=270 )
    frame2 = tk.Frame(frameb, borderwidth=2, relief="flat", bg="#FFFFFF" ,width=500, height=270 )
    frame3 = tk.Frame(framea, borderwidth=2, relief="flat", bg="#AFAFAF" ,width=500, height=430 )
    frame4 = tk.Frame(frameb, borderwidth=2, relief="flat", bg="#23B4A5" ,width=500, height=430 )
    bienvenida = tk.Label(frame1,font=("Roboto", 29),bg="#FFFFFF",fg="#030716", text="Bienvenido a este programa")
    texto= tk.Label(frame1,font=("Roboto", 10),bg="#FFFFFF",fg="#AFAFAF", text="Lorem ipsum dolor sit amet,  consetetur sadipscing elitr, sed diam nonumy eirmod tempor \n Lorem ipsum dolor sit amet consetetur sadipscing elitr Lorem ipsum dolor sit amet consetetur sadipscing elitr \n Lorem ipsum dolor sit amet,  consetetur sadipscing elitr, sed diam nonumy eirmod tempor \n Lorem ipsum dolor sit amet consetetur sadipscing elitr Lorem ipsum dolor sit amet consetetur sadipscing elitr")

    btn = Button(frame3,fg="#030716", bg="#AFAFAF", text="ENTRAR EN EL PROGRAMA",font="Roboto")





    framea.pack(fill=tk.Y, side=tk.LEFT)
    frameb.pack(fill=tk.Y, side=tk.RIGHT)

    frame1.grid(column=0 ,row=0)
    frame2.grid(column=2, row=0 )
    frame3.grid(column=0, row=2 )
    frame4.grid(column=2, row=2)
    bienvenida.grid()
    texto.grid()
    btn.grid(column=0, row=2,pady=200,padx=220)

    ventana.mainloop()
