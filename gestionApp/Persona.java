package gestionApp;

public abstract class Persona {
    String nombre;
    String apellido;
    int DNI;
    int edad;

    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract String getApellido();
    public abstract void setApellido(String apellido);

    public abstract int getDNI();
    public abstract void setDNI(int DNI);

    public abstract int getEdad();
    public abstract void setEdad(int Edad);

}

