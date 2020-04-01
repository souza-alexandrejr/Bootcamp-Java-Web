package modulo01;

import java.util.Scanner;

public class D03ManipulandoTextoI {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		String frase;
		int cont = 0;
				
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		frase = entrada.nextLine();
		entrada.close();
		
		// CALCULO DO TOTAL DE LETRAS "A"
		for (int i = 0; i < frase.length(); i++) {
			if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'A'))
				cont++;
		}
		
		// SAIDA DE DADOS
		System.out.println("TOTAL DE A: " + cont);

	}

}
