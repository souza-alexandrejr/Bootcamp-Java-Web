package modulo01;

import java.util.Scanner;

public class Q36PapaiNoel {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int n;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade Ho's: ");
		n = entrada.nextInt();
		entrada.close();
		
		// SAIDA DOS HO HO HO
		for (int i = 1; i <= n; i++) {
			if (i != n)
				System.out.printf("HO ");
			else
				System.out.printf("HO!");
		}
	}

}
