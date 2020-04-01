package modulo01;

import java.util.Scanner;

public class Q17NumeroPrimo {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int i = 0, j;
		int aux, n;
		int x;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero de casos de teste: ");
		n = entrada.nextInt();
		
		// TESTE SE EH NUMERO PRIMO OU NAO
		while (i < n) {
			System.out.println("Numero a ser testado:");
			x = entrada.nextInt();
			aux = 0;
			j = 1;
			while (j <= 107) {
				if (x%j == 0) {
					aux++;
				}
				j++;
			}
			if (aux == 2)
				System.out.printf("%d eh primo\n" , x);
			else
				System.out.printf("%d nao eh primo\n" , x);
			i++;
		}
		entrada.close();
	}

}
