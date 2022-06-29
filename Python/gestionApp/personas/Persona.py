
class Persona:

    def __init__(self,nombre,cedula,cel,correo,id):
        self.nombre = nombre
        self.cedula = cedula 
        self.cel = cel
        self.correo = correo
    
    def getNombre(self): return self.nombre
    def sefNombre(self,nombre): self.nombre = nombre
    
    def getCedula(self): return self.cedula
    def sefCedula(self,cedula): self.cedula = cedula
     
    def getCel(self): return self.cel
    def sefCel(self,cel): self.cel = cel    
    
    def getCorreo(self): return self.correo
    def sefCorreo(self,correo): self.correo = correo   
    
    def toStringDatos(self):
        return "Nombre: " + self.nombre + "\nCedula " + self.cedula + "\nCel: " + self.cel + "\nCorreo: " + self.correo