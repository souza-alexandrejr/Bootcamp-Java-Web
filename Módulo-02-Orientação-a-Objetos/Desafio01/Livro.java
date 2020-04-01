package questao01;

import java.util.ArrayList;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual = 0;		// ITEM C
	private boolean aberto = false;		// ITEM C
	private Pessoa pessoa; 				// ITEM B
	private int pagAtual;
	
	// ENCAPSULAMENTO
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPaginaAtual() {
		return paginaAtual;
	}
	
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	// ITEM D: METODO detalhes()
	public String detalhes() {
		return ((this.titulo) + "," + (this.autor) + "," + (this.totalPaginas) + "," + (this.paginaAtual) + "," + (this.aberto) + "," + (this.pessoa.getNome()));
	}
	
	// METODOS DA INTERFACE 'PUBLICACAO'
	int cont = 0;
	public void abrir() {
		// verificando se nao há nenhum outro livro aberto com essa pessoa (itens E.V e E.VI)
		ArrayList<Livro> lista = pessoa.getLivros();
		for (int i = 0; i < lista.size(); i++) {
			Livro book = lista.get(i);
			if (book.isAberto())
				cont++;
		}
		if (cont == 0)
			this.aberto = true;
		else {
			System.out.println("Erro: Fechar livro anterior!!!");
		}
	}
	
	public void fechar() {
		this.aberto = false;
	}
	
	public void voltarPagina() {
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual >= 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				// navegando uma pagina por ver (item E.III)
				this.setPaginaAtual(pagAtual-=1); // registro da pagina atual (item E.IV)
			}
			else
				System.out.println("Erro: abrir livro!!!");
		}
		else 
			System.out.println("Erro: pagina invalida - fora dos limites!!");
	}
	
	public void avancarPagina() {
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual >= 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				// navegando uma pagina por ver (item E.III)
				this.setPaginaAtual(pagAtual+=1); // registro da pagina atual (item E.IV)
			}
			else
				System.out.println("Erro: abrir livro!!");
		}
		else
			System.out.println("Erro: pagina invalida - fora dos limites!!");
	}
	
	public void folhear(int numPag) {
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual > 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				this.setPaginaAtual(pagAtual += numPag); // registro da pagina atual (item E.IV)
			}
			else
				System.out.println("Erro: abrir livro!!!");
		}
		else 
			System.out.println("Erro: pagina invalida - fora dos limites!!");
		
	}

}
