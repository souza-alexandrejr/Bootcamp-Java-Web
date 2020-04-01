package questao11;

public class Administrador extends Usuario {
	
	private Periodo periodo;
	
	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public void aprovarCadastro() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: aprovarCadastro");

	}
	
	public void aprovarAlocacao() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: aprovarAlocacao");

	}

	public void visualizarUsuario() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: visualizarUsuario");

	}
	
	public void editarUsuario() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: editarUsuario");

	}
	
	public void deletarUsuario() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: deletarUsuario");

	}
	
	public void gerenciarPeriodo() {
		System.out.println("Classe: Administrador");
		System.out.println("Metodo: gerenciarPeriodo");

	}
}
