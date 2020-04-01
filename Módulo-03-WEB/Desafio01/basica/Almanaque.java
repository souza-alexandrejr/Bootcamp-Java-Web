package livraria.bean;

public class Almanaque extends Livro {

	private int pagAtual;
	
	public void voltarPagina() {
		setErrorMsg("");
		// verificando se a pagina está dentro dos limites (item E.II)
		if (getPaginaAtual() >= 0 && getPaginaAtual() <= getTotalPaginas()) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = getPaginaAtual();
				// navegando uma pagina por ver (item E.III)
				pagAtual-=2;
				if ((pagAtual >= 0) && (pagAtual <= getTotalPaginas()))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
				this.setErrorMsg("Abrir almanaque!!");
			}
		}
		else {
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}
	
	public void avancarPagina() {
		setErrorMsg("");
		// verificando se a pagina está dentro dos limites (item E.II)
		if (getPaginaAtual() >= 0 && getPaginaAtual() <= getTotalPaginas()) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = getPaginaAtual();
				// navegando uma pagina por ver (item E.III)
				pagAtual+=2;
				if ((pagAtual >= 0) && (pagAtual <= getTotalPaginas()))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
				this.setErrorMsg("Abrir almanaque!!");
			}
		}
		else {
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}
	
	public void folhear(int numPag) { 
		setErrorMsg("");
		// definicao do indice (item F.II)
		if (this.getPaginaAtual() % 2 != 0) {
			pagAtual = this.getPaginaAtual();
			this.setPaginaAtual(pagAtual+=1); 
		}
		// verificando se a pagina está dentro dos limites (item E.II)
		if (getPaginaAtual() >= 0 && getPaginaAtual() <= getTotalPaginas()) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = getPaginaAtual();
				// navegando uma pagina por ver (item E.III)
				pagAtual+=numPag;
				if ((pagAtual >= 0) && (pagAtual <= getTotalPaginas()))
					this.setPaginaAtual(pagAtual); // registro da pagina atual (item E.IV)
				else
					this.setErrorMsg("Página Inválida: Fora dos limites!!");
			}
			else {
				this.setErrorMsg("Abrir almanaque!!");
			}
		}
		else {
			this.setErrorMsg("Página Inválida: Fora dos limites!!");
		}
	}
	
}
