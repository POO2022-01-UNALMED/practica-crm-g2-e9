package gestionApp;

public class Servicios {
    private String nombreServicios;
    private int valorProducto;
    private String tipo;
    private String descripcion;
    public Servicios  (String nombreServicios, int valorProducto, String tipo, String descripcion) {
		this.nombreServicios = nombreServicios;
        this.valorProducto = valorProducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
		
	}

    public String getNombreServicios(){
        return nombreServicios;
    }
    public void setNombreServicios(String nombreServicios){
        this.nombreServicios = nombreServicios;
    }
    public int getValorProducto(){
        return valorProducto;
    }
    public void setValorProducto(int valorProducto){
        this.valorProducto = valorProducto;
    }
    public String getTipo(String tipo){
        return tipo;
    }
    public void setTipo(int String){
        this.tipo = tipo;
    }
    public String getDescripcion (String descripcion){
        return descripcion;
    }
    public void setDescripcion (){
        this.descripcion = descripcion;
    }

}
