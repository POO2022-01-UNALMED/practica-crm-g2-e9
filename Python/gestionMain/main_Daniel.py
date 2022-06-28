import time
from tkinter import*
from PIL import ImageTk, Image
from tkinter import messagebox
from operator import itemgetter

### Definicion
counter_hojaDeVida = -1
list_hojaDeVida = ["hoja1","hoja2","hoja3"]

app_desc = 'Esta es la descripcion de la aplicacion'


### Funciones

def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')

def clickOn_hojaDeVida(event):
    global counter_hojaDeVida, list_hojaDeVida
    counter_hojaDeVida+=1
    if counter_hojaDeVida>=len(list_hojaDeVida):
        counter_hojaDeVida = 0
    hojaDeVida.config(text = str(list_hojaDeVida[counter_hojaDeVida]))

def imagenesEnMovimiento():
    global canvas_width, image_width, P4, canvas
    
    all_images_coordinates = [(canvasId,int(canvas.coords(canvasId)[0])) for canvasId in canvas.find_all()]
    
    for image_coordinates in all_images_coordinates:
        canvas.move(image_coordinates[0], -5, 0)
        
        if image_coordinates[1] <= -image_width:
            
            tag = int(canvas.gettags(image_coordinates[0])[0])
            canvas.delete(image_coordinates[0])
            max_coord = max(all_images_coordinates, key=itemgetter(1))[1]
            
            if (max_coord <= canvas_width-int(canvas_height*1.3)):
                canvas.create_image(canvas_width, 0, anchor=NW, image=list_images[tag] , tags = tag)
            else:
                canvas.create_image(max_coord + image_width - 5, 0, anchor=NW, image=list_images[tag] , tags = tag)
    P4.update()
    P4.after(70, imagenesEnMovimiento)


##########################################################################
### root
##########################################################################

inicio = Tk()
inicio.title("Trabajo Final")
inicio.geometry("700x700")
inicio.resizable(0, 0)

inicio.columnconfigure(0, weight=1)
inicio.columnconfigure(1, weight=1)
inicio.rowconfigure(0, weight=1)


### Barra Menu

menuBar = Menu(inicio)
inicio.config(menu=menuBar)

menu1 = Menu(menuBar)
menuBar.add_cascade(label="Inicio", menu=menu1, command=mostrarDescripcion)
menu1.add_command(label="Descripcion",command=mostrarDescripcion)
menu1.add_command(label="Salir",command=inicio.destroy)

##########################################################################
### P1
##########################################################################


P1 = Frame(inicio, background="black", height = 100, width = 50)
P1.grid(row=0, column=0,sticky="news")
P1.rowconfigure(0, weight=1)
P1.rowconfigure(1, weight=1)
P1.columnconfigure(0, weight=1)

##########################################################################
### P2
##########################################################################

P2 = Frame(inicio, background="black", height = 100, width = 50)
P2.grid(row=0, column=1,sticky="news")
P2.rowconfigure(0, weight=1)
P2.rowconfigure(1, weight=1)
P2.columnconfigure(0, weight=1)

##########################################################################
### P3
##########################################################################

P3 = Frame(P1, background="bisque", width=100, height=50)
P3.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P3.rowconfigure(0, weight=1)
P3.grid_propagate(False)


### Mensaje de Bienvenida

mensajeBienvenida = Label(P3, text="Mensaje de Bienvenida", font=("Arial", 25))
mensajeBienvenida.place(anchor=CENTER, relx=0.5, rely=0.5)

##########################################################################
### P4
##########################################################################

P4 = Frame(P1, background="pink", width=100, height=50)
P4.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P4.grid_propagate(False)


### Rueda de imagenes

canvas_width = 350
canvas_height = 100
canvas = Canvas(P4, width=canvas_width, height=canvas_height)
canvas.grid(row=0, column=0, sticky='nsew')

image_height = canvas_height
image_width = int(canvas_height*1.3)
my_image = ImageTk.PhotoImage(Image.open("aff.jpg").resize((image_width, canvas_height), Image.ANTIALIAS))

list_images=[my_image,my_image,my_image,my_image]
imagesList = [
    canvas.create_image(canvas_width + index*image_width, 0, anchor=NW, image=image_in_list, tags = index)
    for index, image_in_list in enumerate(list_images)
    ]


### Boton ventana principal

botonPrincipal = Button(P4, text="Ir a la ventana principal")
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.9)  

##########################################################################
### P5
##########################################################################

P5 = Frame(P2, background="pink", width=100, height=50)
P5.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P5.grid_propagate(False)


### Cambio de hoja de vida

hojaDeVida = Label(P5, text = 'Hoja de vida', font=("Arial", 25))
hojaDeVida.place(anchor=CENTER, relx=0.5, rely=0.5)                 
hojaDeVida.bind("<Button-1>", clickOn_hojaDeVida)

##########################################################################
### P6
##########################################################################

P6 = Frame(P2, background="bisque", width=100, height=50)
P6.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P6.grid_propagate(False)





##########################################################################
### Inicio del loop
##########################################################################

    
imagenesEnMovimiento()

inicio.mainloop()
