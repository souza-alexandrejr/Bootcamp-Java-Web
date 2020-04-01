package questao12;

public class Candidato extends Pessoa {
	
	private int candidatoID;
	private String cargo;
	private boolean resultado;
	private String uf;
	private Partido partido;
	private Votar votar;
	
	public int getCandidatoID() {
		return candidatoID;
	}
	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Votar getVotar() {
		return votar;
	}
	public void setVotar(Votar votar) {
		this.votar = votar;
	}
	
	public int candidatura() {
		System.out.println("Classe: Candidato");
		System.out.println("Metodo: candidatura");
		return this.candidatoID;
	}
	
}
