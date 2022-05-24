package gestionApp;

public abstract class Persona {
    String nombre;
    String apellido;
    int cedula;
    int edad;

    public Persona(String nombre, String apellido, int cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract String getApellido();
    public abstract void setApellido(String apellido);

    public abstract int getCedula();
    public abstract void setCedula(int cedula);

    public abstract int getEdad();
    public abstract void setEdad(int Edad);

}

