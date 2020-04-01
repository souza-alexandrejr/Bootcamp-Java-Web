package modulo01;

import java.util.Scanner;

public class Q15SequenciaFibonacci {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int i = 0;
		int num;
		int e, e1, e2;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("N primeiros numeros da Sequencia de Fibonacci. N =");
		num = entrada.nextInt();
		entrada.close();
		
		// EXIBICAO DOS N PRIMEIROS NUMEROS DA SEQUENCIA DE FIBONACCI
		e1 = 0;
		e2 = 1;
		System.out.printf("%d\n%d\n", e1, e2);
		while (i < (num-2)) {
			e = e1 + e2;
			e1 = e2;
			e2 = e;
			System.out.println(e);
			i++;			
		}
	}

}
