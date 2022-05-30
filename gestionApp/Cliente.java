package gestionApp;

public class Cliente extends Persona{
	private int id;

	
	
	public Cliente(String nombre, int cedula, String cel, String correo, int id) {
		super(nombre, cedula, cel, correo);
		this.id = id;

	}

	public String getNombre(){return nombre;}
	public void setNombre(String nombre){this.nombre = nombre;}

	public int getCedula(){return cedula;}
	public void setCedula(int cedula){this.cedula = cedula;}

	public String getCel(){return this.cel;}
	public void setCel(String cel){this.cel = cel;}

	public String getCorreo(){return correo;}
	public void setCorreo(String correo){this.correo = correo;}


	
	//Setters y Getters 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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



}