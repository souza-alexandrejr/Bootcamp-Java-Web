package questao02;

import java.util.Date;

public class Produto {
	
	private Integer id;
	private String nome;
	private String descricao;
	private Date validade;
	
	// CONSTRUTOR PADRAO
	public Produto(){
		super();
	}
	
	// CONSTRUTOR COM ENTRADA DE PARAMETROS
	public Produto(Integer id, String nome, String descricao, Date validade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.validade = validade;
	}
	
	// ENCAPSULAMENTO
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getValidade() {
		return this.validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public Integer getCod() {
		return this.id;
	}
}
