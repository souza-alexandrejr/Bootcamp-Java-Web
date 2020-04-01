package livraria.controlador;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import livraria.bean.Pessoa;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class PessoaBean implements Serializable {
	
	private Pessoa pessoa;
	private String opcao;
	
	public PessoaBean() {
		this.opcao = "";
		this.pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public void validaNome(FacesContext context, UIComponent toValidate, String nome) {
		if (nome.isEmpty()) {
			FacesMessage mensagem = new FacesMessage("O campo NOME é obrigatório!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		else if (nome.length() <= 2) {
			FacesMessage mensagem = new FacesMessage("Nome inválido!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		
	}
	
	public String adicionarLivro() {
		return "livros";
	}
	
	public String adicionarAlmanaque() {
		return "almanaques";
	}
}
