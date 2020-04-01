package modulo01;

import java.util.Scanner;

public class Q07CaixaEletronico {

	public static void main(String[] args) {

		int n;
		int aux;
		int n_100;
		int n_50;
		int n_20;
		int n_10;
		int n_5;
		int n_2;
		int n_1;
				
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("CAIXA ELETRONICO");
		System.out.println("Valor em dinheiro (0 < N < 1000000):");
		n = entrada.nextInt();
		entrada.close();
				
		// DECOMPOSICAO NO MENOR NUMERO DE NOTAS (CEDULAS) POSSIVEIS
		n_100 = n/100;
		aux = n%100;
		n_50 = aux/50;
		aux = aux%50;
		n_20 = aux/20;
		aux = aux%20;
		n_10 = aux/10;
		aux = aux%10;
		n_5 = aux/5;
		aux = aux%5;
		n_2 = aux/2;
		n_1 = aux%2;
		
		// SAIDA DE DADOS
		System.out.printf("%d\n", n);
		System.out.printf("%d nota(s) de R$ 100,00\n", n_100);
		System.out.printf("%d nota(s) de R$ 50,00\n", n_50);
		System.out.printf("%d nota(s) de R$ 20,00\n", n_20);
		System.out.printf("%d nota(s) de R$ 10,00\n", n_10);
		System.out.printf("%d nota(s) de R$ 5,00\n", n_5);
		System.out.printf("%d nota(s) de R$ 2,00\n", n_2);
		System.out.printf("%d nota(s) de R$ 1,00\n", n_1);
		
	}

}
