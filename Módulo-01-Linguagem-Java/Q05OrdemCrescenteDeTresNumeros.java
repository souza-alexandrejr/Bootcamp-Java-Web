package modulo01;

import java.util.Scanner;

public class Q05OrdemCrescenteDeTresNumeros {

	public static void main(String[] args) {

		int a, b, c;
		int max, med, min;
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
				med = b;
				min = c;
			}
			else {
				max = a;
				med = c;
				min = b;
			}
		else {
			if (a>c) {
				max = b;
				med = a;
				min = c;
			}
			else {
				max = b;
				med = c;
				min = a;
			}
		}
			
		// SAIDA DE DADOS
		System.out.println("ORDEM CRESCENTE DE TRES NUMEROS");
		System.out.printf("%d \n%d \n%d \n", min, med, max); 
	
		
	}

}
