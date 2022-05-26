package gestionApp;

public class Contacto extends Persona{
    public Contacto (String nombre, String apellido, int cedula, int edad){
        super(nombre,apellido,cedula,edad);
    
}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public int getCedula(){return cedula;}
    public void setCedula(int cedula){this.cedula = cedula;}
}
