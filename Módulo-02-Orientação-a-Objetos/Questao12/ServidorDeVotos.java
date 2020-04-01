package questao12;

import java.util.Calendar;
import java.util.List;

public class ServidorDeVotos {
	
	private int candidadoID;
	private int eleitorID;
	private Calendar data;
	private int contaVotos;
	private List<Votar> votar;
	private List<Resultado> resultado;
	
	public int getCandidadoID() {
		return candidadoID;
	}
	public void setCandidadoID(int candidadoID) {
		this.candidadoID = candidadoID;
	}
	public int getEleitorID() {
		return eleitorID;
	}
	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public int getContaVotos() {
		return contaVotos;
	}
	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}
	public List<Votar> getVotar() {
		return votar;
	}
	public void setVotar(List<Votar> votar) {
		this.votar = votar;
	}
	public List<Resultado> getResultado() {
		return resultado;
	}
	public void setResultado(List<Resultado> resultado) {
		this.resultado = resultado;
	}
	
	public int contaVotos() {
		System.out.println("Classe: ServidorDeVotos");
		System.out.println("Metodo: contaVotos");
		return this.contaVotos;
	}

}
