package questao11;

public class Coordenador extends Usuario {
	
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void solicitarCadastro() {
		System.out.println("Classe: Coordenador");
		System.out.println("Metodo: solicitarCadastro");

	}
	
	public void editar() {
		System.out.println("Classe: Coordenador");
		System.out.println("Metodo: editar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Coordenador");
		System.out.println("Metodo: visualizar");

	}
	
	public void excluir() {
		System.out.println("Classe: Coordenador");
		System.out.println("Metodo: excluir");

	}
	
}
