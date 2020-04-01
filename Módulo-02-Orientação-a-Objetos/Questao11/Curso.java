package questao11;

import java.util.ArrayList;

public class Curso {
	
	private String nome;
	private int id;
	private ArrayList<Disciplina> disciplinas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void visualizar() {
		System.out.println("Classe: Curso");
		System.out.println("Metodo: visualizar");

	}
	
	public void criar() {
		System.out.println("Classe: Curso");
		System.out.println("Metodo: criar");

	}
	
	public void excluir() {
		System.out.println("Classe: Curso");
		System.out.println("Metodo: excluir");

	}
	
	public void relatorioSalas() {
		System.out.println("Classe: Curso");
		System.out.println("Metodo: relatorioSalas");

	}

}
