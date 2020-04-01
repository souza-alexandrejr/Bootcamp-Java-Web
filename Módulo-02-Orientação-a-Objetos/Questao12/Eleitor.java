package questao12;

import java.util.List;

public class Eleitor extends Pessoa {
	
	private String endereco;
	private int eleitorID;
	private ZonaEleitoral zona;
	private List<Votar> votar;
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getEleitorID() {
		return eleitorID;
	}
	
	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}
	
	public ZonaEleitoral getZona() {
		return zona;
	}
	
	public void setZona(ZonaEleitoral zona) {
		this.zona = zona;
	}
	
	public List<Votar> getVotar() {
		return votar;
	}

	public void setVotar(List<Votar> votar) {
		this.votar = votar;
	}

	public int validar() {
		System.out.println("Classe: Eleitor");
		System.out.println("Metodo: validar");
		return this.eleitorID; 
	}
	

}
