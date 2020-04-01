package questao01;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private ArrayList<Livro> livros; 
	
	// ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	// ITEM A: METODO fazerAniversario()
	public void fazerAniversario() {
		this.idade++;
	}
	
}
