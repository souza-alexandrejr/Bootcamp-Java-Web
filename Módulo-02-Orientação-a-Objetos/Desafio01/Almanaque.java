package questao01;

public class Almanaque extends Livro {

	private int pagAtual;
	
	public void avancarPagina() {
		// verificando se a pagina está dentro dos limites (item E.II)
		if (this.getPaginaAtual() > 0 && this.getPaginaAtual() <= this.getTotalPaginas()) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.getPaginaAtual();
				// avancando paginas duas a duas (item F.I)
				this.setPaginaAtual(pagAtual+=2); // registro da pagina atual (item E.IV)
			}
			else
				System.out.println("Erro: abrir almanaque!!");
		}
		else
			System.out.println("Erro: pagina invalida - fora dos limites!!");
	}
	
	public void folhear(int numPag) { 
		// definicao do indice (item F.II)
		if (this.getPaginaAtual() % 2 != 0) {
			pagAtual = this.getPaginaAtual();
			this.setPaginaAtual(pagAtual+=1); 
		}
		// verificando se a pagina está dentro dos limites (item E.II)
		if ((this.getPaginaAtual() > 0) && (this.getPaginaAtual() <= this.getTotalPaginas())) {
			// verificando se o livro está aberto (item E.I)
			if (this.isAberto() == true) { 
				pagAtual = this.getPaginaAtual();
				this.setPaginaAtual(pagAtual+=numPag); // registro da pagina atual (item E.IV)
			}
			else
				System.out.println("Erro: abrir almanaque!!!");
		}
		else 
			System.out.println("Erro: pagina invalida - fora dos limites!!");
		
	}
	
}
