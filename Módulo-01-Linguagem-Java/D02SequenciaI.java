package modulo01;

import java.util.Scanner;

public class D02SequenciaI {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int n;
		double num, den;
		double a = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de N:");
		n = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO VALOR DE A
		num = n;
		den = 1;
		for (int i = n; i >= 1; i--) {
			a += num/den;
			num -= 1;
			den += 1;
		}
		
		// SAIDA DE DADOS
		System.out.printf("A = %f", a);
		
		

	}

}
