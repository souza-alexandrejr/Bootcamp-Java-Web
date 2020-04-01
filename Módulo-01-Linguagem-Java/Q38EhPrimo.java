package modulo01;

import java.util.Scanner;

public class Q38EhPrimo {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int num;
		int aux = 0;
		int j = 1;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero a ser testado:");
		num = entrada.nextInt();
		entrada.close();
		while (j <= num) {
			if (num % j == 0) {
				aux++;
			}
			j++;
		}
		if (aux == 2)
			System.out.printf("É PRIMO");
		else
			System.out.printf("NÃO É PRIMO");
		}

}
