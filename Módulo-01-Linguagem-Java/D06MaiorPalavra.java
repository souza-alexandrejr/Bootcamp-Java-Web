package modulo01;

import java.util.Scanner;

public class D06MaiorPalavra {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		String frase;
		int numPalavras, numLetras;
		int maior;
		int index = 0;
				
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		frase = entrada.nextLine();
		entrada.close();
		
		// CALCULO DO NUMERO DE PALAVRAS
		String[] palavras = frase.split(" ");
		numPalavras = palavras.length;

		// DEFINICAO DA MAIOR PALAVRA
		maior = palavras[0].length();
		for (int i = 0; i < numPalavras; i++) {
			numLetras = palavras[i].length();
			if (numLetras > maior) {
				maior = numLetras;
				index = i;
			}
		}
		
		// SAIDA DE DADOS
		System.out.println("Maior Palavra = " + palavras[index]);

	}

}
