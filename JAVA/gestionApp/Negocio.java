package gestionApp;

import gestionApp.Evento.Correo;
import gestionApp.Evento.Evento;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Negocio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	public Empleado empleadoEncargado;
	public Cliente cliente;
	private String id;
	private String etapa;
	private int valorVenta;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaFinalizacion;
	private ArrayList<Evento> eventos;
	private ArrayList<Servicio> servicios;
	private static int idCounter = 0;
	private static ArrayList<Negocio> allNegocios = new ArrayList<>();
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    

    public Negocio(Empleado empleadoEncargado, Cliente cliente, int valorVenta) {
		this.id = "0".repeat(3-String.valueOf(idCounter).length()) + String.valueOf(idCounter);
		this.empleadoEncargado = empleadoEncargado;
		this.cliente = cliente;
		this.valorVenta = valorVenta;
		this.fechaCreacion = LocalDateTime.now();
		this.servicios = new ArrayList<>();
		this.eventos = new ArrayList<>();
		allNegocios.add(this);
		empleadoEncargado.setNegociosEmpleado(this);
		this.definirEtapa();
		idCounter += 1;
	}

    
    // setters y getters


	public String getId() {return id;}

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

	public static ArrayList<Negocio> getNegocios() {return Negocio.allNegocios;}
	public static void agregarNegocio(Negocio nuevoNegocio){Negocio.allNegocios.add(nuevoNegocio);}
	
	
	public  void eliminarNegocio(String id){
		for(int i = 0; i < allNegocios.get(i).getCliente().getEmpresa().getNegociosAbiertos().size(); i++) {
			if(allNegocios.get(i).getCliente().getEmpresa().getNegociosAbiertos().get(i).getId().equals(id)) {
				allNegocios.get(i).getCliente().getEmpresa().eliminarNeg(id);
				}
		}
		for(int j = 0; j < allNegocios.size(); j++){
			if (allNegocios.get(j).getId()==id){
				allNegocios.remove(j);
				}
			}
	}


	// Etapa Negocio.

	public void definirEtapa(){
		int numLlamadas = 0;
		double tiempoLlamadas = 0;
		int numCorreos = 0;
		double tamanoCorreos = 0;
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
						tamanoCorreos +=  ((Correo)this.eventos.get(i)).getCantidadPalabras();
						numCorreos += 1;
					}
					else if (this.eventos.get(i) instanceof Llamada){
						tiempoLlamadas +=  ((Llamada)this.eventos.get(i)).getDuracionLlamada();
						numLlamadas += 1;
					} 
				}
				calculoMetrica = (numReuniones*tiempoReuniones + tamanoCorreos*numCorreos + tiempoLlamadas * numLlamadas)-1.2;
				if(this.etapa == "Prospeccion"){
					if (calculoMetrica > 0.4){
						this.etapa  = "Presentacion";
					}										
				}
				else if(this.etapa == "Presentacion"){
					if (calculoMetrica > 0.5){
						this.etapa  = "Negociacion";
					}		
				}
				else if(this.etapa == "Negociacion"){
					if (calculoMetrica > 0.6){
						this.etapa  = "Cerrado";
						this.fechaFinalizacion = LocalDateTime.now();
						/*esto ultimo es para cuando la etapa del negocio est� "cerrado" se elimine
						 * los negocios de las listas , de la de negocio de empresa y la de allNegocios
						 * est� sin probar
						 */
						this.eliminarNegocio(this.id);
						
						
						
					}		
				}
				
			}
		}

	}



	
	
	

	public  String toStringNegocio(){
		return "\tDatos del Negocio \nID del Negocio: "+ getId() +
		 "\nCliente del negocio" + cliente.toString() + 
		 "\nEmpleado encargado del negocio: " + empleadoEncargado.toString() +
		 "\nValor de venta del negocio: " + valorVenta +
		 "\nEtapa del negocio: " + etapa +
		 "\nEventos: " +  
		 "\nServicios: " +  
		 "\n/////////////////////////////////////////////\n";

	}




}

