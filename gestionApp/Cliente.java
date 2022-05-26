package gestionApp;

public class Cliente{
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
	
	public static void clientesPotenciales() {

	}

	public static void consultarClientes() {

	}
	
	public static void consultarOportunidades() {

	}
	
	public static void consultarVentas() {

	}
	
	public static void serviciosClientes() {

	}



	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		
	}

	public int getDNI() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDNI(int DNI) {
		// TODO Auto-generated method stub
		
	}


	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setEdad(int Edad) {
		// TODO Auto-generated method stub
		
	}
}

	