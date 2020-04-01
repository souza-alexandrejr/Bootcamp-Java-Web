package modulo01;

import java.util.Scanner;

public class Q16PopulacaoPaises {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int t = 0;
		double popA, popB;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Populacao A = ");
		popA = entrada.nextDouble();
		System.out.println("Populacao B (> A)= ");
		popB = entrada.nextDouble();
		entrada.close();
		
		while (popA <= popB) {
			popA = popA*(1.03);
			popB = popB*(1.015);
			t++;
		}
		
		// SAIDA DO TEMPO NECESSARIO PARA IGUALDADE ENTRE POPULACOES
		System.out.printf("%d anos", t);		
		
	}

}
