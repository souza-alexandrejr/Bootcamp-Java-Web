package livraria.bean;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private List<Livro> livros = new ArrayList<Livro>();
	
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
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	// ITEM A: METODO fazerAniversario()
	public void fazerAniversario() {
		this.idade++;
	}
	
}
