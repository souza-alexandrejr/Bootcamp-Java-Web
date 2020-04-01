package questao03;

public class Terrestre extends MeioDeTransporte {

	private int qtdeRodas;
	private double potencia;
	
	// CONSTRUTOR PADRAO
	public Terrestre() {
		super();
	}
	
	// CONSTRUTOR COM PARAMETROS
	public Terrestre(int qtdeRodas, double potencia) {
		this.qtdeRodas = qtdeRodas;
		this.potencia = potencia;
	}
	
	// ENCAPSULAMENTO
	public int getQtdeRodas() {
		return this.qtdeRodas;
	}
	
	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}
	
	public double getPotencia() {
		return this.potencia;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	// METODO PARA O CALCULO DO CONSUMO
	public double consumo() {
		return (this.potencia*getCargaMaxima()*100);
	}
	
}
