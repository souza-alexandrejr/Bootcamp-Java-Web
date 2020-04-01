package livraria.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import livraria.bean.Livro;
import livraria.bean.Pessoa;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class LivroBean implements Serializable {

	private Livro livro;
	private List<Livro> listaLivros;
	private String sucessMessage;
	
	public LivroBean() {
		this.livro = new Livro();
		this.listaLivros = new ArrayList<Livro>();
		this.sucessMessage = "";
	}
	
	@PostConstruct
	public void init() {
		this.livro.setUsuario(new Pessoa());
	}
	
	public String getSucessMessage() {
		return this.sucessMessage;
	}

	public void setSucessMessage(String sucessMessage) {
		this.sucessMessage = sucessMessage;
	}
	
	public Livro getLivro() {
		return this.livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getListaLivros() {
		return this.listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	public void validaTitulo(FacesContext context, UIComponent toValidate, String titulo) {
		if (titulo.isEmpty()) {
			FacesMessage mensagem = new FacesMessage("O campo TÍTULO é obrigatório!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		else if (titulo.length() <= 2) {
			FacesMessage mensagem = new FacesMessage("TÍTULO inválido!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		int cont = 0;
		for (int i=0; i < this.listaLivros.size(); i++) {
			String nomeLivro = this.listaLivros.get(i).getTitulo();
			if (titulo.equalsIgnoreCase(nomeLivro))
				cont++;
		}
		if (cont!=0) {
			FacesMessage mensagem = new FacesMessage("Esse livro já pertence a outro usuário!!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
	}
	
	public void validaAutor(FacesContext context, UIComponent toValidate, String autor) {
		if (autor.isEmpty()) {
			FacesMessage mensagem = new FacesMessage("O campo AUTOR é obrigatório!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		else if (autor.length() <= 2) {
			FacesMessage mensagem = new FacesMessage("AUTOR inválido!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
	}
	
	public void validaTotalPaginas(FacesContext context, UIComponent toValidate, int ntpags) {
		if (ntpags == 0) {
			FacesMessage mensagem = new FacesMessage("NÚMERO TOTAL DE PÁGINAS inválido!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
	}
	
	public void adicionar(Pessoa pessoa) {
		this.sucessMessage = "";
		Livro livroAux = new Livro();
		
		Pessoa pessoaAux = new Pessoa();
		this.livro.setUsuario(pessoa);
		
		livroAux.setAberto(this.livro.isAberto());
		livroAux.setAutor(this.livro.getAutor());
		livroAux.setPaginaAtual(this.livro.getPaginaAtual());
		livroAux.setTotalPaginas(this.livro.getTotalPaginas());
		livroAux.setTitulo(this.livro.getTitulo());
		pessoaAux.setNome(pessoa.getNome());
		livroAux.setUsuario(pessoaAux);
		
		this.listaLivros.add(livroAux);
		this.sucessMessage = "LIVRO adicionado com sucesso!! Cadastre outro usuário ou adicione outro livro.";
	}
	
	public String listar() {
		return "lista";
	}
	
	public String adicionarNovoUsuario() {
		return "pessoa";
	}
	
	public String navegar() {
		return "leituraLivro";
	}
	
	public String voltarPagInicial() {
		return "pessoa";
	}

}
