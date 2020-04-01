package livraria.bean;

import java.util.List;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual = 0;		// ITEM C
	private boolean aberto = false;		// ITEM C
	private Pessoa usuario; 			// ITEM B
	private int pagAtual;
	private String errorMsg = "";
	
	// ENCAPSULAMENTO
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPaginas() {
		return this.totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPaginaAtual() {
		return this.paginaAtual;
	}
	
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public boolean isAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Pessoa pessoa) {
		this.usuario = pessoa;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	// ITEM D: METODO detalhes()
	public String detalhes() {
		return ((this.titulo) + "," + (this.autor) + "," + (this.totalPaginas) + "," + (this.paginaAtual) + "," + (this.aberto) + "," + (this.usuario.getNome()));
	}
	
	// METODOS DA INTERFACE 'PUBLICACAO'
	int cont = 0;
	public void abrir() {
		this.errorMsg = "";
		// verificando se nao há nenhum outro livro aberto com essa pessoa (itens E.V e E.VI)
		List<Livro> lista = getUsuario().getLivros();
		for (int i = 0; i < lista.size(); i++) {
			Livro book = lista.get(i);
			if (book.isAberto())
				cont++;
		}
		if (cont == 0)
			this.aberto = true;
		else {
//			System.out.println("Erro: Fechar livro anterior!!!");
			this.setErrorMsg("Fechar livro anterior!!!");
		}
	}
	
	public void fechar() {
		this.errorMsg = "";
		this.aberto = false;
	}
	
	public void voltarPagina() {
		this.errorMsg = "";
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual >= 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				// navegando uma pagina por ver (item E.III)
				pagAtual-=1;
				if ((pagAtual >= 0) && (pagAtual <= this.totalPaginas))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
//				System.out.println("Erro: abrir livro!!!");
				this.setErrorMsg("Abrir livro!!");
			}
		}
		else {
//			System.out.println("Página Inválida: Fora dos limites!!");
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}
	
	public void avancarPagina() {
		this.errorMsg = "";
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual >= 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				// navegando uma pagina por vez (item E.III)
				pagAtual+=1;
				if ((pagAtual >= 0) && (pagAtual <= this.totalPaginas))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
//				System.out.println("Erro: abrir livro!!");
				this.setErrorMsg("Abrir livro!!");
			}
		
		}
		else {
//			System.out.println("Página Inválida: Fora dos limites!!");
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}
	
	public void folhear(int numPag) {
		this.errorMsg = "";
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.paginaAtual >= 0 && this.paginaAtual <= this.totalPaginas) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.paginaAtual;
				pagAtual += numPag;
				if ((pagAtual >= 0) && (pagAtual <= this.totalPaginas))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
//				System.out.println("Erro: abrir livro!!");
				this.setErrorMsg("Abrir livro!!");
			}
		}
		else {
//			System.out.println("Página Inválida: Fora dos limites!!");
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}

}
