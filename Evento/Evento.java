package gestionApp;

public class Evento {

    int ID;
    Negocio negocio;
    String tipoInteraccion;
    String descripcion;
    String fecha;
    String respuesta;

    public Evento(int ID, Negocio negocio, String tipoInteraccion, String descripcion){
        this.ID = ID;
        this.negocio = negocio;
        this.tipoInteraccion = tipoInteraccion;
        this.descripcion = descripcion;
        this.fecha = "00/00/0000";
        this.respuesta = this.darRespuesta();

        //ejecucion de metodo para dar respuesta;
    }

    private String darRespuesta(){
        float probabilidadDeInteres = (float) 0.3;
        if (negocio.getEtapa().equals("Presentación")){
            float probabilidad =    negocio.getEmpleadoEncargado().getHabilidadVenta()+
                    negocio.cliente.getProbCompra()+ probabilidadDeInteres;

            if (probabilidad >= 0.7 ){return "Si";
            } else if (probabilidad <= 0.3) {return "No";}
            else {return "Interes";}
        }

        if (negocio.getEtapa().equals("Negociación")){
            float valorEsperado = (float) (Math.random()*0.5+0.5);
            if (valorEsperado >= 0.75){return "Compra";
            }else if (valorEsperado >= 0.6 && valorEsperado <0.75){
                return "No compra, sigue interesado";
            }else {return "No compra";}
        }



        return "a";
    }


    //---------------Metodos Setter y Getter---------------

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public String getTipoInteraccion() {return tipoInteraccion;}
    public void setTipoInteraccion(String tipoInteraccion) {this.tipoInteraccion = tipoInteraccion;}

    public Negocio getNegocio() {return negocio;}
    public void setNegocio(Negocio negocio) {this.negocio = negocio;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getRespuesta() {return respuesta;}
    public void setRespuesta(String respuesta) {this.respuesta = respuesta;}


    //Metodo para elegir si una respuesta cambia la etapa del negocio




    public static void anadirEvento(){
        
    }
    public static void cursoEvento(){
        
    }
    public static void modificarEvento(){
        
    }

    public static void main(String[] args) {
        System.out.println("Hola!");
        float a = (float) (Math.random()*0.4);
        float valorEsperado = (float) (Math.random()*0.5+0.5);
        System.out.println(valorEsperado);
    }
    
}
