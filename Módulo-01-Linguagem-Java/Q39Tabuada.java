package modulo01;

import java.util.Scanner;

public class Q39Tabuada {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int num, mult;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo: ");
		num = entrada.nextInt();
		entrada.close();
		
		for (int i = 1; i <= 10; i++) {
			mult = num*i;
			System.out.printf("%d x %d = %d\n", num, i, mult);

		}
	}

}
