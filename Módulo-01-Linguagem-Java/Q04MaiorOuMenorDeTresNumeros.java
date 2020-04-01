package modulo01;

import java.util.Scanner;

public class Q04MaiorOuMenorDeTresNumeros {

	public static void main(String[] args) {
		
		int a, b, c;
		int max, min;
		Scanner entrada = new Scanner(System.in);
		
		// DADOS DE ENTRADA
		System.out.println("Digite o primeiro numero inteiro:");
		a = entrada.nextInt();
		System.out.println("Digite o segundo numero inteiro:");
		b = entrada.nextInt();
		System.out.println("Digite o terceiro numero inteiro:");
		c = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO MAIOR E MENOR INTEIRO
		if (a>b)
			if (b>c) {
				max = a;
				min = c;
			}
			else {
				max = a;
				min = b;
			}
		else {
			if (a>c) {
				max = b;
				min = c;
			}
			else {
				max = b;
				min = a;
			}
		}
		
		// SAIDA DE DADOS
		System.out.printf("MAIOR = %d \n",  max); 
		System.out.printf("MENOR = %d",  min);
		
	}

}
