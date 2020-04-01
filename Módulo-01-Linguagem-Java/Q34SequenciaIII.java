package modulo01;

import java.util.Scanner;

public class Q34SequenciaIII {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int x, y;
		int i, j = 1;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade X de numeros por linha: ");
		x = entrada.nextInt();
		System.out.println("Digite o ultimo numero Y da sequencia: ");
		y = entrada.nextInt();
		entrada.close();
		
		// SAIDA DE DADOS
		while (j < y) {
			for (i = 1; i <= x; i++) {
				if (i != x)
					System.out.printf("%d ", j);
				else
					System.out.printf("%d\n", j);
				j++;
			}
		}

	}

}
