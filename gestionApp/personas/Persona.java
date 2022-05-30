package gestionApp.personas;

public abstract class Persona {
    protected String nombre;
    protected int cedula;
    protected String cel;
    protected String correo;

    public Persona(String nombre, int cedula, String cel, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cel = cel;
        this.correo = correo;
    }

    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract int getCedula();
    public abstract void setCedula(int cedula);

    public abstract String getCel();
    public abstract void setCel(String cel);

    public abstract String getCorreo();
    public abstract void setCorreo(String correo);

}

