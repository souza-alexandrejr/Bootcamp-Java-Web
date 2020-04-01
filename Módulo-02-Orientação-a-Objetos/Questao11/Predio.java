package questao11;

import java.util.ArrayList;

public class Predio {
	
	private String nome;
	private String ala;
	private ArrayList<Sala> salas;
	private int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAla() {
		return ala;
	}
	public void setAla(String ala) {
		this.ala = ala;
	}
	public ArrayList<Sala> getSalas() {
		return salas;
	}
	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void criar() {
		System.out.println("Classe: Predio");
		System.out.println("Metodo: criar");

	}
	
	public void relatorioSalas() {
		System.out.println("Classe: Predio");
		System.out.println("Metodo: relatorioSalas");

	}

	
}
