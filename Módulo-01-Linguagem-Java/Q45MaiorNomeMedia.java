package modulo01;

import java.util.Scanner;

public class Q45MaiorNomeMedia {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int idade[] = new int[5];
		String nome[] = new String[5];
		int maiorIdade = 0, menorIdade = 0;
		double media, soma = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("DIGITE O NOME #%d: ", i+1);
			nome[i] = entrada.next();
			System.out.printf("DIGITE A IDADE #%d: ", i+1);
			idade[i] = entrada.nextInt();
		}
		entrada.close();
		
		// CALCULO DA MAIOR E MENOR IDADE
		maiorIdade = idade[0];
		menorIdade = idade[0];
		for (int i = 0; i < 5; i++) {
			if (idade[i] > maiorIdade)
				maiorIdade = idade[i];
			else if (idade[i] < menorIdade)
				menorIdade = idade[i];
			soma += idade[i];
		}
		media = soma/5;
		
		// SAIDA DE DADOS
		for (int i = 0; i < 5; i++) {
			if (idade[i] == maiorIdade)
				System.out.printf("Maior idade: %d\n", maiorIdade);
			if (idade[i] == menorIdade)
				System.out.printf("Nome da pessoa mais nova: %s\n", nome[i]);
		}
		System.out.printf("Media das idades: %.2f", media);
		
			
			

		
		
	}

}
