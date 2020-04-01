package questao03;

public abstract class MeioDeTransporte {
	
	private int id;
	private short ano;
	private String modelo;
	private double cargaMaxima;
	
	// CONSTRUTOR PADRAO
	public MeioDeTransporte() {
		super();
	}
	
	// CONSTRUTOR COM PARAMETROS
	public MeioDeTransporte(int id, short ano, String modelo, double cargaMaxima) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.cargaMaxima = cargaMaxima;
	}
	
	// ENCAPSULAMENTO
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public short getAno() {
		return this.ano;
	}
	
	public void setAno(short ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getCargaMaxima() {
		return this.cargaMaxima;
	}
	
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	// METODO (ABSTRATO) PARA CALCULO DO CONSUMO
	public abstract double consumo();

}
