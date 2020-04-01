package modulo01;

import java.util.Scanner;

public class Q33Pum {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int n;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero N: ");
		n = entrada.nextInt();
		entrada.close();
		
		// SAIDA DE DADOS
		for (int i = 1; i <= 4*n; i++) {
			if (i % 4 != 0)
				System.out.printf("%d ", i);
			else
				System.out.printf("PUM\n");
		}
	}

}
