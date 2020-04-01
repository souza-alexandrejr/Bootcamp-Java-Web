package modulo01;

import java.util.Scanner;

public class Q46SomaFatoriais {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int m, n;
		double fatM = 1, fatN = 1;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		m = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		n = entrada.nextInt();
		entrada.close();
		
		// CALCULO DOS FATORIAIS
		for (int i = m; i > 1; i--)
			fatM *= i;
		for (int i = n; i > 1; i--)
			fatN *= i;
		
		// SAIDA DE DADOS
		System.out.println((fatM + fatN));

	}

}
