package questao04;

public class Ferramenta extends ItemDeLoja {
	
	private String categoria;
	private Integer serial;

	// ENCAPSULAMENTO
	public Integer getSerial() {
		return serial;
	}
	
	public void setSerial(Integer serial) {
			this.serial = serial;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	// METODO SEPARAR()
	public void separar() {
		this.categoria = "Outros";
	}
	
	// METODO SEPARAR (COM PARAMETROS)
	public void separar(String valor) {
		this.categoria = valor;
	}
	
	// METODO GET IDENTIFICADOR
	public int getIdentificador() {
		return this.serial;
	}
}
