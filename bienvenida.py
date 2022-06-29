from calendar import c
from cgitb import text
from os import stat
import time
from tkinter import*
from PIL import ImageTk, Image
from tkinter import messagebox
from operator import itemgetter
import os.path

from ventanaPrincipal import command

### Definicion
counter_hojaDeVida = -1

# list_hojaDeVida = Image[image3]
# list_descripciones_hv = [
#     'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
#     'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
#     'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
#     'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'
#     ]

# listdesc = ['a','b,','c','d']

app_desc = 'Esta es la descripcion de la aplicacion'


### Funciones

def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')


def Inicio(f,d,i1,i2,i3,i4):
    f.place_forget()
    d.place_forget()
    i1.grid_forget()
    i2.grid_forget()
    i3.grid_forget()
    i4.grid_forget()
    
    
      
    
    
def click_s():
    hojaDeVida2 = Label(P5, image=ss)
    hojaDeVida2.place(anchor=CENTER, relx=0.5, rely=0.5)
    flechita=  Button(P5, image=flecha, command = lambda: Inicio(hojaDeVida2,flechita,pan,pan2,pan3,pan4)   )
    flechita.place(anchor=CENTER, relx=0.1, rely=0.9)
    pan = Label(P6, image=imgA1)
    pan.grid(column=0, row=0,padx=30,pady=5)
    pan2 = Label(P6, image=imgB1)
    pan2.grid(column=1, row=0,padx=70,pady=5)
    pan3 = Label(P6, image=imgC1)
    pan3.grid(column=0, row=1,padx=30,pady=0)
    pan4= Label(P6, image=imgD1)
    pan4.grid(column=1, row=1,padx=70,pady=0)
    
    

def click_m():
    hojaDeVida2 = Label(P5, image=mm)
    hojaDeVida2.place(anchor=CENTER, relx=0.5, rely=0.5)
    flechita=  Button(P5, image=flecha, command = lambda: Inicio(hojaDeVida2,flechita,pan,pan2,pan3,pan4)   )
    flechita.place(anchor=CENTER, relx=0.1, rely=0.9)
    pan = Label(P6, image=img1)
    pan.grid(column=0, row=0,padx=30,pady=5)
    pan2 = Label(P6, image=img2)
    pan2.grid(column=1, row=0,padx=70,pady=5)
    pan3 = Label(P6, image=img3)
    pan3.grid(column=0, row=1,padx=30,pady=0)
    pan4= Label(P6, image=img4)
    pan4.grid(column=1, row=1,padx=70,pady=0)
    
def click_c():
    hojaDeVida2 = Label(P5, image=cc)
    hojaDeVida2.place(anchor=CENTER, relx=0.5, rely=0.5)
    flechita=  Button(P5, image=flecha, command = lambda: Inicio(hojaDeVida2,flechita,pan,pan2,pan3,pan4)   )
    flechita.place(anchor=CENTER, relx=0.1, rely=0.9)
    pan = Label(P6, image=imgA)
    pan.grid(column=0, row=0,padx=30,pady=5)
    pan2 = Label(P6, image=imgB)
    pan2.grid(column=1, row=0,padx=70,pady=5)
    pan3 = Label(P6, image=imgC)
    pan3.grid(column=0, row=1,padx=30,pady=0)
    pan4= Label(P6, image=imgD)
    pan4.grid(column=1, row=1,padx=70,pady=0)

def click_d():
    hojaDeVida2 = Label(P5, image=dd)
    hojaDeVida2.place(anchor=CENTER, relx=0.5, rely=0.5)
    flechita=  Button(P5, image=flecha, command = lambda: Inicio(hojaDeVida2,flechita)   )
    flechita.place(anchor=CENTER, relx=0.1, rely=0.9)

def clickPrincipal():
    pass
    
    #global counter_hojaDeVida, list_hojaDeVida, ind_img
    #counter_hojaDeVida+=1
    #if counter_hojaDeVida>=len(list_hojaDeVida):
        #counter_hojaDeVida = 0
    #hojaDeVida.config(text = str(list_hojaDeVida[counter_hojaDeVida]))
    #descripcion.config(text = str(listdesc[counter_hojaDeVida]))
    #print('Python/resources/bio_images'+str((counter_hojaDeVida+1))+'_1.jpg')
    #ind_img = ImageTk.PhotoImage(Image.open('Python/resources/bio_images'+str((counter_hojaDeVida+1))+'_1.jpg'))
    #pan.config(image=ind_img)
    



def imagenesEnMovimiento():
    global canvas_width, image_width, P4, canvas
    
    all_images_coordinates = [(canvasId,int(canvas.coords(canvasId)[1])) for canvasId in canvas.find_all()]
    
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

state = False
def aa(event):
    global state, canvas
    
    if (not state):
        canvas.config(background="red")
        imagenesEnMovimiento()
        state=True

###


##########################################################################
### root
##########################################################################

inicio = Tk()
inicio.title("Trabajo Final")
inicio.geometry("800x500")
inicio.overrideredirect(0)
inicio.wm_attributes("-transparent")
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


P1 = Frame(inicio, background="#ffffff", height = 100, width = 50)
P1.grid(row=0, column=0,sticky="news")
P1.rowconfigure(0, weight=1)
P1.rowconfigure(1, weight=1)
P1.columnconfigure(0, weight=1)


##########################################################################
### P2
##########################################################################

P2 = Frame(inicio, background="white", height = 100, width = 50)
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
imgBienvenida=ImageTk.PhotoImage(Image.open("Python/resources/p3.png"))
mensajeBienvenida = Label(P3, background="#ffffff",image=imgBienvenida)
mensajeBienvenida.place(anchor=CENTER, relx=0.5, rely=0.5)

##########################################################################
### P4
##########################################################################

P4 = Frame(P1, background="#ffffff", width=100, height=50)
P4.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P4.grid_propagate(False)
rect=ImageTk.PhotoImage(Image.open('Python/resources/rect.png'))
rectl= Label(P4, image=rect)
rectl.place(anchor=CENTER, relx=0.5, rely=0.5)

### Rueda de imagenesS

canvas_width = 300
canvas_height = 140
canvas = Canvas(P4, width=canvas_width, height=canvas_height)
canvas.grid(row=0, column=0, padx=45,pady=17)

image_height = canvas_height
image_width = int(canvas_height*1.3)
my_image = ImageTk.PhotoImage(Image.open("Python/resources/slider/6.jpg").resize((image_width, canvas_height)))
img1_s = ImageTk.PhotoImage(Image.open("Python//resources/slider/1.jpg"))
img2_s = ImageTk.PhotoImage(Image.open("Python/resources/slider/2.jpg"))
img3_s = ImageTk.PhotoImage(Image.open("Python/resources/slider/3.jpg"))
img4_s = ImageTk.PhotoImage(Image.open("Python/resources/slider/4.jpg"))
img5_s = ImageTk.PhotoImage(Image.open("Python/resources/slider/5.jpg"))


list_images=[my_image,img1_s,img2_s,img3_s,img4_s,img5_s]
imagesList = [
    canvas.create_image(canvas_width + index*image_width, 0, anchor=NW, image=image_in_list, tags = index)
    for index, image_in_list in enumerate(list_images)
    ]


### Boton ventana principal
botonInit=ImageTk.PhotoImage(Image.open('Python/resources/button.png'))
botonPrincipal = Button(P4, image=botonInit , border=0,bg="white")
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.8)
  

##########################################################################
### P5
##########################################################################

P5 = Frame(P2, background="white", width=100, height=50)
P5.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P5.grid_propagate(False)
#P5.bind("<Button-1>", clickOn_hojaDeVida)


### Cambio de hoja de vida
image3=ImageTk.PhotoImage(Image.open('Python/resources/hoja.png'))

s=ImageTk.PhotoImage(Image.open('Python/resources/s.png'))
m=ImageTk.PhotoImage(Image.open('Python/resources/m.png'))
c=ImageTk.PhotoImage(Image.open('Python/resources/c.png'))
d=ImageTk.PhotoImage(Image.open('Python/resources/d.png'))

ss=ImageTk.PhotoImage(Image.open('Python/resources/ss.png'))
mm=ImageTk.PhotoImage(Image.open('Python/resources/mm.png'))
cc=ImageTk.PhotoImage(Image.open('Python/resources/cc.png'))
dd=ImageTk.PhotoImage(Image.open('Python/resources/dd.png'))

flecha=ImageTk.PhotoImage(Image.open('Python/resources/flecha.png'))

hojaDeVida = Label(P5, image=image3)
hojaDeVida.place(anchor=CENTER, relx=0.5, rely=0.5)
#s
botonPrincipal = Button(P5, image=s , border=0,bg="white", command=click_s)
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.35)
#d
botonPrincipal = Button(P5, image=m , border=0,bg="white",command=click_m)
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.523)  
#c
botonPrincipal = Button(P5, image=d , border=0,bg="white",command=click_d)
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.7)  
#m
botonPrincipal = Button(P5, image=c , border=0,bg="white",command=click_c)
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.88)  




#----------                 
#hojaDeVida.bind("<Button-1>", clickOn_hojaDeVida)

#descripcion = Label(P5, text= 'Esta es una breve descripción\n de los integrantes del grupo :D!', font=('Arial',12))
#descripcion.place(anchor=CENTER, relx=0.5, rely=0.5)
#descripcion.bind("<Button-1>", clickOn_hojaDeVida)




##########################################################################
### P6
##########################################################################

P6 = Frame(P2, background="black", width=100, height=50)
P6.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P6.grid_propagate(False)

fotos=ImageTk.PhotoImage(Image.open('Python/resources/fotos.png'))
img1 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/ferrari.png'))
img2 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/ferrari2.png'))
img3 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/ferrari3.png'))
img4 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/ferrari4.png'))


#************************************
imgA = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/carlos.png'))
imgB = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/carlos2.png'))
imgC = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/carlos3.png'))
imgD = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/carlos4.png'))
#***********************************

#***********************************
imgA1 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/santi.png'))
imgB1 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/santi2.png'))
imgC1 = ImageTk.PhotoImage(Image.open('Python/resources/bio_images/santi3.png'))
imgD1= ImageTk.PhotoImage(Image.open('Python/resources/bio_images/santi4.png'))
#************************************
#pan = Label(P6, text='owo').grid(column=0, row=0)
panFo=Label(P6,image=fotos)
panFo.place(anchor=CENTER, relx=0.5, rely=0.5)





# pan3 = Label(P6, image=img3).grid(column=0, row=1)
# pan4 = Label(P6, image=img4).grid(column=1, row=1)











##########################################################################
### Inicio del loop
##########################################################################

    
imagenesEnMovimiento()

inicio.mainloop()

