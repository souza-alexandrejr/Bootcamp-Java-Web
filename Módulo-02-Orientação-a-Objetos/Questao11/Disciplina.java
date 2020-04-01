package questao11;

import java.util.ArrayList;

public class Disciplina {
	
	private int id;
	private String nome;
	private ArrayList<Turma> turmas;
	private Curso curso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void criar() {
		System.out.println("Classe: Disciplina");
		System.out.println("Metodo: criar");

	}
	
	public void editar() {
		System.out.println("Classe: Disciplina");
		System.out.println("Metodo: editar");

	}
	
	public void excluir() {
		System.out.println("Classe: Disciplina");
		System.out.println("Metodo: excluir");

	}
	
	public void visualizar() {
		System.out.println("Classe: Disciplina");
		System.out.println("Metodo: visualizar");

	}
	
	public void relatorioSalas() {
		System.out.println("Classe: Disciplina");
		System.out.println("Metodo: relatorioSalas");

	}

}
