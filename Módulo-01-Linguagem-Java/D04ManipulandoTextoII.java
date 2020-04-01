package modulo01;

import java.util.Scanner;

public class D04ManipulandoTextoII {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		String frase;
		int numPalavras = 0;
		int total = 0;
				
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		frase = entrada.nextLine();
		entrada.close();
		
		// CALCULO DO NUMERO DE PALAVRAS
		String[] palavras = frase.split(" ");
		total = palavras.length;
		for (int i = 0; i < total; i++) {
			if (!(palavras[i].isEmpty()))
					numPalavras++;
		}
		
		// SAIDA DE DADOS
		System.out.println("TOTAL DE PALAVRAS = " + numPalavras);

	}

}
