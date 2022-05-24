package gestionApp;

public class Empresa {
    private String cargo;
    private String negociosAbiertos;
    private String negociosCerrados;
    private String etapaVenta;
    private String valor;
    private Productos producto;
    
    
    
	public Empresa(String cargo, String negociosAbiertos, String negociosCerrados, String etapaVenta, String valor) {
		this.cargo = cargo;
		this.negociosAbiertos = negociosAbiertos;
		this.negociosCerrados = negociosCerrados;
		this.etapaVenta = etapaVenta;
		this.valor = valor; 
		
		
	}


	
	// getters y setters 
	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getNegociosAbiertos() {
		return negociosAbiertos;
	}



	public void setNegociosAbiertos(String negociosAbiertos) {
		this.negociosAbiertos = negociosAbiertos;
	}



	public String getNegociosCerrados() {
		return negociosCerrados;
	}



	public void setNegociosCerrados(String negociosCerrados) {
		this.negociosCerrados = negociosCerrados;
	}



	public String getEtapaVenta() {
		return etapaVenta;
	}



	public void setEtapaVenta(String etapaVenta) {
		this.etapaVenta = etapaVenta;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}






	

    
}
