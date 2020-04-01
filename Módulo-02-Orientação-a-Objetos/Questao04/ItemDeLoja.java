package questao04;

public class ItemDeLoja {
	
	private int codigoDoItem;
	private String nomeDoItem;
	private String descricaoDoItem;
	private double valorDoItem;
	
	// CONSTRUTOR PADRAO
	public ItemDeLoja() {
		super();
	}
	
	// CONSTRUTOR COM ENTRADA DE PARAMETROS
	public ItemDeLoja(int codigo, String nome, String descricao, double valor) {
		this.codigoDoItem = codigo;
		this.nomeDoItem = nome;
		this.descricaoDoItem = descricao;
		this.valorDoItem = valor;
	}
	
	// ENCAPSULAMENTO
	public int getIdentificador() {
		return this.codigoDoItem;
	}
	
	public void setIdentificador(int codigo) {
		this.codigoDoItem = codigo;
	}
	
	public String getNomeDoItem() {
		return this.nomeDoItem;
	}
	
	public void setNomeDoItem(String nome) {
		this.nomeDoItem = nome;
	}
	
	public String getDescricaoDoItem() {
		return this.descricaoDoItem;
	}
	
	public void setDescricaoDoItem(String descricao) {
		this.descricaoDoItem = descricao;
	}
	
	public double getValorDoItem(){
		return this.valorDoItem;
	}
	
	public void setValorDoItem(double valor) {
		this.valorDoItem = valor;
	}

}
