package gestionApp;

public class Cliente {
	private int id;
	private String nombre;
	private int cedula;
	private String cel_num;
	
	
	public Cliente(int id, String nombre, int cedula, String cel_num) {
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.cel_num = cel_num;
	}

	
	//Setters y Getters 

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getCel_num() {
		return cel_num;
	}


	public void setCel_num(String cel_num) {
		this.cel_num = cel_num;
	}
	
	
	// las que eliminamos que pueden ir en toStrings
	
	public void Clientes_Potenciales() {

	}

	public void ConsultarClientes() {

	}
	
	public void ConsultarOportunidades() {

	}
	
	public void ConsultarVentas() {

	}
	
	public void ServiciosClientes() {

	}

	
	



	
	
}
