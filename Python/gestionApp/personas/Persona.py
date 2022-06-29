class Persona:
    
    def __init__(self,nombre,cedula,cel,correo):
        self.nombre = nombre
        self.cedula = cedula 
        self.cel = cel
        self.correo = correo
    

    def getNombre(self): return self.nombre
    def setNombre(self,nombre): self.nombre = nombre
    
    def getCedula(self): return self.cedula
    def setCedula(self,cedula): self.cedula = cedula
     
    def getCel(self): return self.cel
    def setCel(self,cel): self.cel = cel    
    
    def getCorreo(self): return self.correo
    def setCorreo(self,correo): self.correo = correo   
    
    def toStringDatos(self):
        return "Nombre: " + self.nombre + "\nCedula " + self.cedula + "\nCel: " + self.cel + "\nCorreo: " + self.correo