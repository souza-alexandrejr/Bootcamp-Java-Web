package questao11;

import java.util.ArrayList;

public class Turma {
	
	private String nome;
	private Disciplina disciplina;
	private ArrayList<Horario> horarios;
	private int id;
	private ArrayList<Curso> cursos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public ArrayList<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void criar() {
		System.out.println("Classe: Turma");
		System.out.println("Metodo: criar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Turma");
		System.out.println("Metodo: visualizar");

	}
	
	public void editar() {
		System.out.println("Classe: Turma");
		System.out.println("Metodo: editar");

	}
	
	public void excluir() {
		System.out.println("Classe: Turma");
		System.out.println("Metodo: excluir");

	}

}
