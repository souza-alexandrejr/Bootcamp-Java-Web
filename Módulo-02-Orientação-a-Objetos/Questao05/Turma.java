package questao05;

import java.util.ArrayList;

public class Turma {

	private String cod;
	private Integer turno;
	private Integer sala;
	private ArrayList<Aluno> alunos;
	
	// ENCAPSULAMENTO
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public Integer getTurno() {
		return turno;
	}
	
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	
	public Integer getSala() {
		return sala;
	}
	
	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public ArrayList<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
