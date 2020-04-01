package questao11;

import java.util.ArrayList;

public class Sala {
	
	private int codigo;
	private String nome;
	private int capacidade;
	private String topologia;
	private Predio predio;
	private ArrayList<Horario> gradeHoraria;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getTopologia() {
		return topologia;
	}
	public void setTopologia(String topologia) {
		this.topologia = topologia;
	}
	public Predio getPredio() {
		return predio;
	}
	public void setPredio(Predio predio) {
		this.predio = predio;
	}
	public ArrayList<Horario> getGradeHoraria() {
		return gradeHoraria;
	}
	public void setGradeHoraria(ArrayList<Horario> gradeHoraria) {
		this.gradeHoraria = gradeHoraria;
	}
	
	public void criar() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: criar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: visualizar");

	}
	
	public void editar() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: editar");

	}
	
	public void excluir() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: excluir");

	}
	
	public void mostrarGradeHorario() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: mostrarGradeHorario");

	}

	public void importarSalas() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: importarSalas");

	}
	
	public void alocarSala() {
		System.out.println("Classe: Sala");
		System.out.println("Metodo: alocarSala");

	}
	
}
