package modulo01;

import java.util.Scanner;

public class Q30SequenciaNumerosSoma {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int m, n;
		int menor, maior;
		int soma = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		m = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		n = entrada.nextInt();
		entrada.close();
		
		// DEFINICAO DO MAIOR E MENOR 
		if (m > n) {
			menor = n;
			maior = m;
		}
		else {
			menor = m;
			maior = n;
		}
		
		// CALCULO DA SEQUENCIA E SAIDA DE DADOS
		while (menor <= maior) {
			System.out.printf("%d ", menor);
			soma += menor;
			menor++;		
		}
		System.out.printf("\nSoma = %d ", soma);
	}
}
