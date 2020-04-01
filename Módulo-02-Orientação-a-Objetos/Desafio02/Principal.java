package questao02;

import java.util.ArrayList;
import questao01.Almanaque;
import questao01.Livro;
import questao01.Pessoa;

public class Principal {

	public static void main(String[] args) {

		// ITEM A
		Pessoa p1 = new Pessoa();
		p1.setNome("Alex");
		p1.setIdade(23);
//		p1.fazerAniversario();
//		System.out.println(p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Rebeca");
		
		// ITEM B
		ArrayList<Livro> listaP1 = new ArrayList<Livro>();
		ArrayList<Livro> listaP2 = new ArrayList<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setTitulo("O Senhor dos Aneis");
		livro1.setAutor("J.R.R. Tolken");
		livro1.setTotalPaginas(403);
		livro1.setPessoa(p1);
		
		Livro livro2 = new Livro();
		livro2.setTitulo("As Cronicas de Narnia");
		livro2.setAutor("C.S. Lewis");
		livro2.setTotalPaginas(201);
		livro2.setPessoa(p2);
		
		Livro livro3 = new Livro();
		livro3.setTitulo("Harry Potter");
		livro3.setAutor("J.K. Rowling");
		livro3.setTotalPaginas(400);
		livro3.setPessoa(p2);
		
		// ITEM C
		Almanaque alm1 = new Almanaque();
		alm1.setTitulo("Turma da Monica");
		alm1.setAutor("Mauricio de Sousa");
		alm1.setTotalPaginas(55);
		alm1.setPessoa(p1);
		
		Almanaque alm2 = new Almanaque();
		alm2.setTitulo("Os Vingadores");
		alm2.setAutor("Stan Lee");
		alm2.setTotalPaginas(80);
		alm2.setPessoa(p2);
		
		listaP1.add(livro1);
		listaP1.add(alm1);
		p1.setLivros(listaP1);
		
		listaP2.add(livro2);
		listaP2.add(livro3);
		listaP2.add(alm2);
		p2.setLivros(listaP2);
		
		// ITEM D (LISTA DE PUBLICACOES)
		System.out.println(livro1.detalhes());
		System.out.println(livro2.detalhes());
		System.out.println(livro3.detalhes());
		System.out.println(alm1.detalhes());
		System.out.println(alm2.detalhes());
	
		// ITEM E
		livro1.abrir();
		livro1.avancarPagina(); 
		System.out.println("O livro1 está na pagina " + livro1.getPaginaAtual());
		livro1.fechar();
		
		livro2.abrir();
		livro2.setPaginaAtual(10);
		livro2.folhear(-5);
		System.out.println("O livro2 está na pagina " + livro2.getPaginaAtual());
		livro2.fechar(); // TESTE: abrindo o livro3 sem fechar o 2
		
		livro3.abrir(); 
		livro3.setPaginaAtual(30);
		livro3.avancarPagina();
		livro3.avancarPagina();
		livro3.voltarPagina();
		System.out.println("O livro3 está na pagina " + livro3.getPaginaAtual());
		livro3.fechar();
		
		alm1.abrir();
		alm1.setPaginaAtual(3);
		alm1.avancarPagina();
		alm1.voltarPagina(); // metodo da classe Livro
		System.out.println("O alm1 está na pagina " + alm1.getPaginaAtual());
		alm1.fechar();
		
		alm2.abrir();
		alm2.setPaginaAtual(3);
		alm2.folhear(5);
		System.out.println("O alm2 está na pagina " + alm2.getPaginaAtual());
		alm2.fechar();
		
		// ITEM F (LISTA DE PUBLICACOES ATUALIZADA)
		System.out.println(livro1.detalhes());
		System.out.println(livro2.detalhes());
		System.out.println(livro3.detalhes());
		System.out.println(alm1.detalhes());
		System.out.println(alm2.detalhes());

	}

}
