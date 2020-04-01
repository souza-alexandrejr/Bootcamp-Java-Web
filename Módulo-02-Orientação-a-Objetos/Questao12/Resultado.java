package questao12;

import java.util.List;

public class Resultado {
	
	private int candidatoID;
	private List<ServidorDeVotos> servidores;

	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}
	
	public List<ServidorDeVotos> getServidores() {
		return servidores;
	}

	public void setServidores(List<ServidorDeVotos> servidores) {
		this.servidores = servidores;
	}
	
	public int getTotalVotos() {
		System.out.println("Classe: Resultado");
		System.out.println("Metodo: getTotalVotos");
		return 0;
	}
	
	public void divulgarVencedor() {
		System.out.println("Classe: Resultado");
		System.out.println("Metodo: divulgarVencedor");
	}

}
