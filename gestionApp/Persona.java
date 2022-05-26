package gestionApp;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int telefono;
    protected String correo;

    public Persona(String nombre, String apellido, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract String getApellido();
    public abstract void setApellido(String apellido);

    public abstract int getTelefono();
    public abstract void setTelefono(int telefono);

    public abstract String getCorreo();
    public abstract void setCorreo(String correo);

}

