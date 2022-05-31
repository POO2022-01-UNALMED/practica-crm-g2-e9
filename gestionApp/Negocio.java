package gestionApp;

import gestionApp.Evento.Correo;
import gestionApp.Evento.Evento;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Negocio {
	
	private int ID;
	public Empleado empleadoEncargado;
	public Cliente cliente;
	private String etapa;
	private int valorVenta;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaFinalizacion;

	private ArrayList<Evento> eventos;
	private ArrayList<Servicio> servicios;
	private static ArrayList<Negocio> negociosActivos = new ArrayList<>();

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    
    public Negocio(int ID, Empleado empleadoEncargado, Cliente cliente, int valorVenta) {
		this.ID = ID;
		this.empleadoEncargado = empleadoEncargado;
		this.cliente = cliente;
		this.valorVenta = valorVenta;
		this.fechaCreacion = LocalDateTime.now();
		//this.fechaFinalizacion = fechaFinalizacion;
		this.servicios = new ArrayList<>();
		this.eventos = new ArrayList<>();
		Negocio.negociosActivos.add(this);
	}

    
    // setters y getters


	public int getID() {return ID;}
	public void setID(int ID) {this.ID = ID;}

	public Empleado getEmpleadoEncargado() {return empleadoEncargado;}
	public void setEmpleadoEncargado(Empleado empleadoEncargado) {this.empleadoEncargado = empleadoEncargado;}

	public Cliente getCliente() {return cliente;}
	public void setCliente(Cliente cliente) {this.cliente = cliente;}

	public String getEtapa() {return etapa;}

	public int getValorVenta() {return valorVenta;}
	public void setValorVenta(int valorVenta) {this.valorVenta = valorVenta;}

	public LocalDateTime getFechaCreacion() {return fechaCreacion;}
	public LocalDateTime getFechaFinalizacion() {return fechaFinalizacion;}

	public ArrayList<Servicio> getServicios() {return servicios;}
	public void setServicios(ArrayList<Servicio> servicios) {this.servicios = servicios;}
	public void agregarServicio (Servicio nuevoServicio){this.servicios.add(nuevoServicio);}
	public void eliminarServicio(int indice){this.servicios.remove(indice);}

	public ArrayList<Evento> getEventos() {return eventos;}
	public void agregarEvento (Evento nuevoEvento){this.eventos.add(nuevoEvento);}
	public void eliminarEvento(int indice){this.eventos.remove(indice);}

	public static ArrayList<Negocio> getNegociosActivos() {return Negocio.negociosActivos;}
	public static void setNegociosActivos(ArrayList<Negocio> negociosActivos) {Negocio.negociosActivos = negociosActivos;}
	public static void agregarNegocio(Negocio nuevoNegocio){Negocio.negociosActivos.add(nuevoNegocio);}
	public static void eliminarNegocio(int indice){Negocio.negociosActivos.remove(indice);}


	// Etapa Negocio.

	public void definirEtapa(){
		int numLlamadas = 0;
		double tiempoLlamadas = 0;
		int numCorreos = 0;
		double tamañoCorreos = 0;
		int numReuniones = 0;
		double tiempoReuniones = 0;
		double calculoMetrica = 0;
		if (this.eventos.size() == 0){
			this.etapa = "Prospeccion";
		}
		else{
			if(this.eventos.get(this.eventos.size()-1).getRespuesta().equals("No interesado")){
				this.etapa = "Finalizado";
				this.fechaFinalizacion = LocalDateTime.now();
			}
			else{
				for(int i=0; i<this.eventos.size(); i++){
					if (this.eventos.get(i) instanceof Reunion){
						tiempoReuniones +=  ((Reunion)this.eventos.get(i)).getDuracionReunion();
						numReuniones += 1;
					}
					else if (this.eventos.get(i) instanceof Correo){
						tamañoCorreos +=  ((Correo)this.eventos.get(i)).getCantidadPalabras();
						numCorreos += 1;
					}
					else if (this.eventos.get(i) instanceof Llamada){
						tiempoLlamadas +=  ((Llamada)this.eventos.get(i)).getDuracionLlamada();
						numLlamadas += 1;
					} 
				}
				calculoMetrica = (numReuniones*tiempoReuniones + tamañoCorreos*numCorreos + tiempoLlamadas * numLlamadas)-2;
				if(this.etapa == "Prospeccion"){
					if (calculoMetrica > 0.7){
						this.etapa  = "Presentacion";
					}										
				}
				else if(this.etapa == "Presentacion"){
					if (calculoMetrica > 0.7){
						this.etapa  = "Negociacion";
					}		
				}
				else if(this.etapa == "Negociacion"){
					if (calculoMetrica > 0.7){
						this.etapa  = "Cerrado";
						this.fechaFinalizacion = LocalDateTime.now();
					}		
				}
				
			}
		}

	}

}
