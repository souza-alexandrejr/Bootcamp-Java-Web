package modulo01;

import java.util.Scanner;

public class D05Fibonacci {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int aux, n, numOld, numNew;
				
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de N:");
		n = entrada.nextInt();
		entrada.close();
		
		// SAIDA DA SERIE DE FIBONACCI
		numOld = 0;
		numNew = 1;
		aux = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", aux);
			aux = numOld + numNew;
			numOld = numNew;
			numNew = aux;
		}
	}
}
