package questao12;

import java.util.Calendar;

public class Votar {
	
	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private String cargoCandidato;
	private Candidato candidato;
	private Eleitor eleitor;
	private ServidorDeVotos servidor;
	
	public int getCandidatoID() {
		return candidatoID;
	}
	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
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
	public String getCargoCandidato() {
		return cargoCandidato;
	}
	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public ServidorDeVotos getServidor() {
		return servidor;
	}
	public void setServidor(ServidorDeVotos servidor) {
		this.servidor = servidor;
	}
	
	public void votar(int candidatoID) {
		System.out.println("Classe: Votar");
		System.out.println("Metodo: votar");
	}
	
	public void cancelar() {
		System.out.println("Classe: Votar");
		System.out.println("Metodo: cancelar");
	}
	
}
