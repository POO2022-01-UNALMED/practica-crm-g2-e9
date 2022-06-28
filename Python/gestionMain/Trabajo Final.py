from tkinter import*
import time
from tkinter import messagebox
from PIL import ImageTk, Image

counter_hojaDeVida = -1
list_hojaDeVida = ["hoja1","hoja2","hoja3"]

app_desc = 'Esta es la descripcion de la aplicacion'




def mostrarDescripcion():
    global app_desc
    messagebox.showinfo(message = app_desc, title = 'Descripcion Aplicacion')

def clickOn_hojaDeVida(event):
    global counter_hojaDeVida, list_hojaDeVida
    counter_hojaDeVida+=1
    if counter_hojaDeVida>=len(list_hojaDeVida):
        counter_hojaDeVida = 0
    hojaDeVida.config(text = str(list_hojaDeVida[counter_hojaDeVida]))

inicio = Tk()
inicio.title("Trabajo Final")
inicio.geometry("700x700")
inicio.resizable(0, 0)

inicio.columnconfigure(0, weight=1)
inicio.columnconfigure(1, weight=1)
inicio.rowconfigure(0, weight=1)

menuBar = Menu(inicio)
inicio.config(menu=menuBar)

menu1 = Menu(menuBar)
menuBar.add_cascade(label="Inicio", menu=menu1, command=mostrarDescripcion)
menu1.add_command(label="Descripcion",command=mostrarDescripcion)
menu1.add_command(label="Salir",command=inicio.destroy)

P1 = Frame(inicio, background="white", height = 100, width = 50)
P1.grid(row=0, column=0,sticky="news")
P2 = Frame(inicio, background="black", height = 100, width = 50)
P2.grid(row=0, column=1,sticky="news")

P1.rowconfigure(0, weight=1)
P1.rowconfigure(1, weight=1)
P1.columnconfigure(0, weight=1)

P2.rowconfigure(0, weight=1)
P2.rowconfigure(1, weight=1)
P2.columnconfigure(0, weight=1)


P3 = Frame(P1, background="bisque", width=100, height=50)
P3.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P3.rowconfigure(0, weight=1)
P3.grid_propagate(False)

P4 = Frame(P1, background="pink", width=100, height=50)
P4.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P4.grid_propagate(False)

P5 = Frame(P2, background="pink", width=100, height=50)
P5.grid(row=0, column=0, padx=1, pady=1,sticky="news")
P5.grid_propagate(False)

P6 = Frame(P2, background="bisque", width=100, height=50)
P6.grid(row=1, column=0, padx=1, pady=1,sticky="news")
P6.grid_propagate(False)



mensajeBienvenida = Label(P3, text="Mensaje de Bienvenida", font=("Arial", 25))
mensajeBienvenida.place(anchor=CENTER, relx=0.5, rely=0.5)

hojaDeVida = Label(P5, text = 'Hoja de vida', font=("Arial", 25))
hojaDeVida.place(anchor=CENTER, relx=0.5, rely=0.5)                 
hojaDeVida.bind("<Button-1>", clickOn_hojaDeVida)


canvas_width = 300
canvas_height = 100
canvas = Canvas(P4, width=canvas_width, height=canvas_height)
canvas.grid(row=0, column=0, sticky='nsew')


my_image = ImageTk.PhotoImage(Image.open("aff.jpg").resize((int(canvas_height*1.3), canvas_height), Image.ANTIALIAS))
my_img = canvas.create_image(0,0, anchor=NW, image=my_image)

#my_img1 = canvas.create_image(int(canvas_height*1.3)+1,0, anchor=NW, image=my_image)
#my_img2 = canvas.create_image(2*int(canvas_height*1.3)+1,0, anchor=NW, image=my_image)
#my_img3 = canvas.create_image(3*int(canvas_height*1.3)+1,0, anchor=NW, image=my_image)
#imagesList = [my_img,my_img1,my_img2,my_img3]

botonPrincipal = Button(P4, text="Ir a la ventana principal")
botonPrincipal.place(anchor=CENTER, relx=0.5, rely=0.9)  

counter_canvas = 0
def moveImage():
    global counter_canvas, canvas_width, P4, canvas, my_img
    counter_canvas += 5
    if counter_canvas > canvas_width:
        canvas.delete(my_img)
        my_img = canvas.create_image(0,0, anchor=NW, image=my_image)
        counter_canvas = 0
    canvas.move(my_img, 5, 0)
    P4.update()
    P4.after(50, moveImage)
    
moveImage()
##for x in range(0,30):
##    canvas.move(my_img, 5, 0)
##    P4.update()
##    time.sleep(0.05)
##
##for x in range(0,30):
##    canvas.move(my_img, 0, 5)
##    P4.update()
##    time.sleep(0.05)
##    
##for x in range(0,30):
##    canvas.move(my_img, -5, 0)
##    P4.update()
##    time.sleep(0.05)
##
##for x in range(0,30):
##    canvas.move(my_img, 0, -5)
##    P4.update()
##    time.sleep(0.05)
#
 



inicio.mainloop()
