package questao11;

public class Usuario {
	
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	private boolean ativo;
	private int id;
	private String registro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public void solicitarCadastro() {
		System.out.println("Classe: Usuario");
		System.out.println("Metodo: solicitarCadastro");

	}
	
	public void editar() {
		System.out.println("Classe: Usuario");
		System.out.println("Metodo: editar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Usuario");
		System.out.println("Metodo: visualizar");

	}
	
	public void excluir() {
		System.out.println("Classe: Usuario");
		System.out.println("Metodo: excluir");

	}

}
