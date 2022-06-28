from cgitb import text
import time
from tkinter import*
from PIL import ImageTk, Image
from tkinter import messagebox
from operator import itemgetter
import os.path

### Definicion
counter_hojaDeVida = -1
list_hojaDeVida = ["Daniel","Santiago","Miguel","Carlos"]
list_descripciones_hv = [
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'
    ]

listdesc = ['a','b,','c','d']

app_desc = 'Esta es la descripcion de la aplicacion'


### Funciones

def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')

def clickOn_hojaDeVida(event):
    global counter_hojaDeVida, list_hojaDeVida, ind_img
    counter_hojaDeVida+=1
    if counter_hojaDeVida>=len(list_hojaDeVida):
        counter_hojaDeVida = 0
    hojaDeVida.config(text = str(list_hojaDeVida[counter_hojaDeVida]))
    descripcion.config(text = str(listdesc[counter_hojaDeVida]))
    print('./resources/bio_images/'+str((counter_hojaDeVida+1))+'_1.jpg')
    ind_img = ImageTk.PhotoImage(Image.open('./resources/bio_images/'+str((counter_hojaDeVida+1))+'_1.jpg'))
    pan.config(image=ind_img)



def imagenesEnMovimiento():
    global canvas_width, image_width, P4, canvas
    
    all_images_coordinates = [(canvasId,int(canvas.coords(canvasId)[0])) for canvasId in canvas.find_all()]
    
    for image_coordinates in all_images_coordinates:
        canvas.move(image_coordinates[0], -3, 0)
        
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
inicio.geometry("800x500")
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


P1 = Frame(inicio, background="#263238", height = 100, width = 50)
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

P3 = Frame(P1, background="#263238", width=100, height=50)
P3.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P3.rowconfigure(0, weight=1)
P3.grid_propagate(False)


### Mensaje de Bienvenida

mensajeBienvenida = Label(P3, background="#263238", fg='#d4d4d4', text="¡Bienvenido a CRM - G2E9!", font=("Arial", 20))
mensajeBienvenida.place(anchor=CENTER, relx=0.5, rely=0.5)

##########################################################################
### P4
##########################################################################

P4 = Frame(P1, background="#263238", width=100, height=50)
P4.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P4.grid_propagate(False)


### Rueda de imagenes

canvas_width = 350
canvas_height = 150
canvas = Canvas(P4, width=canvas_width, height=canvas_height)
canvas.grid(row=0, column=0, sticky='nsew')

image_height = canvas_height
image_width = int(canvas_height*1.3)
<<<<<<< Updated upstream
my_image = ImageTk.PhotoImage(Image.open("Python/gestionMain/aff.jpg").resize((image_width, canvas_height), Image.ANTIALIAS))

list_images=[my_image,my_image,my_image,my_image]
=======
<<<<<<< HEAD
my_image = ImageTk.PhotoImage(Image.open("C:/CARLOS/UN/2022_1/POO/SegundaEntrega/practica-crm-g2-e9/Python/gestionMain/a.jpg").resize((image_width, canvas_height)))
img1_s = ImageTk.PhotoImage(Image.open('./resources/slider/1.jpg'))
img2_s = ImageTk.PhotoImage(Image.open('./resources/slider/2.jpg'))
img3_s = ImageTk.PhotoImage(Image.open('./resources/slider/3.jpg'))
img4_s = ImageTk.PhotoImage(Image.open('./resources/slider/4.jpg'))
img5_s = ImageTk.PhotoImage(Image.open('./resources/slider/5.jpg'))
=======
my_image = ImageTk.PhotoImage(Image.open("Python/gestionMain/aff.jpg").resize((image_width, canvas_height), Image.ANTIALIAS))
>>>>>>> 8fda7d8a7418aef9b622b7fc38f70657fa502e4d


list_images=[my_image,img1_s,img2_s,img3_s,img4_s,img5_s]
>>>>>>> Stashed changes
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
P5.bind("<Button-1>", clickOn_hojaDeVida)


### Cambio de hoja de vida

hojaDeVida = Label(P5, text = 'Hoja de vida', font=("Arial", 25))
hojaDeVida.place(anchor=CENTER, relx=0.5, rely=0.25)                 
hojaDeVida.bind("<Button-1>", clickOn_hojaDeVida)

descripcion = Label(P5, text= 'Esta es una breve descripción\n de los integrantes del grupo :D!', font=('Arial',12))
descripcion.place(anchor=CENTER, relx=0.5, rely=0.5)
descripcion.bind("<Button-1>", clickOn_hojaDeVida)




##########################################################################
### P6
##########################################################################

P6 = Frame(P2, background="black", width=100, height=50)
P6.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P6.grid_propagate(False)
img1 = ImageTk.PhotoImage(Image.open('./resources/bio_images/4_1.jpg'))
img2 = ImageTk.PhotoImage(Image.open('./resources/bio_images/4_2.jpg'))
img3 = ImageTk.PhotoImage(Image.open('./resources/bio_images/4_3.jpg'))
img4 = ImageTk.PhotoImage(Image.open('./resources/bio_images/4_4.jpg'))

#pan = Label(P6, text='owo').grid(column=0, row=0)
pan = Label(P6, image=img1)
pan.grid(column=0, row=0)
pan2 = Label(P6, image=img2).grid(column=1, row=0)
pan3 = Label(P6, image=img3).grid(column=0, row=1)
pan4 = Label(P6, image=img4).grid(column=1, row=1)











##########################################################################
### Inicio del loop
##########################################################################

    
imagenesEnMovimiento()

inicio.mainloop()
