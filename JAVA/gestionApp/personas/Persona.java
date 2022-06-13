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

    protected abstract String getNombre();
    protected abstract void setNombre(String nombre);

    protected abstract int getCedula();
    protected abstract void setCedula(int cedula);

    protected abstract String getCel();
    protected abstract void setCel(String cel);

    protected abstract String getCorreo();
    protected abstract void setCorreo(String correo);

}

