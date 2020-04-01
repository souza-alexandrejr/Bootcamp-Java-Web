package questao01;

public class Transporte {
	
	private Integer id;
	private Integer ano;
	private String modelo;
	private Double cargaMaxima;
	private Double potencia;
	
	// CONSTRUTOR-PADRAO
	public Transporte() {
		super();
	}
	
	// CONSTRUTOR COM PARAMETROS
	public Transporte(Integer id, Integer ano, String modelo, Double cargaMaxima, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.cargaMaxima = cargaMaxima;
		this.potencia = potencia;
	}
	
	// ENCAPSULAMENTO
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return this.ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCargaMaxima() {
		return this.cargaMaxima;
	}
	
	public void setCargaMaxima(Double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	public Double getPotencia() {
		return this.potencia;
	}
	
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	
	// METODO LEIA MODELO
	public String leiaModelo() {
		return this.modelo;
	}
	
	// METODO GRAVA MODELO
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// METODO PARA CALCULO DO CONSUMO
	public Double consumo() {
		return (potencia*cargaMaxima*100);
	}
	
}
