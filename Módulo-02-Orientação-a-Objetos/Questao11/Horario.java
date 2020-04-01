package questao11;

import java.sql.Time;

public class Horario {
	
	private Time horarioDeInicio;
	private String dia;
	private Time horarioDeTermino;
	private Turma turma;
	
	public Time getHorarioDeInicio() {
		return horarioDeInicio;
	}
	public void setHorarioDeInicio(Time horarioDeInicio) {
		this.horarioDeInicio = horarioDeInicio;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Time getHorarioDeTermino() {
		return horarioDeTermino;
	}
	public void setHorarioDeTermino(Time horarioDeTermino) {
		this.horarioDeTermino = horarioDeTermino;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void criar() {
		System.out.println("Classe: Horario");
		System.out.println("Metodo: criar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Horario");
		System.out.println("Metodo: visualizar");

	}
	
	public void editar() {
		System.out.println("Classe: Horario");
		System.out.println("Metodo: editar");

	}
	
	public void excluir() {
		System.out.println("Classe: Horario");
		System.out.println("Metodo: excluir");

	}


}
