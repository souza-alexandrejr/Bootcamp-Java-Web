package modulo01;

import java.util.Scanner;

public class Q23ComparadorNumerosInteiros {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int x, y;
		int result = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero inteiro:" );
		x = entrada.nextInt();
		System.out.println("Entre com o segundo numero inteiro:" );
		y = entrada.nextInt();
		entrada.close();
		
		// SAIDA DE DADOS
		result = 0;
		if (x > y)
			result = 1;
		System.out.printf("%d\n", result);
		
		result = 0;
		if (x == y)
			result = 1;
		System.out.printf("%d\n", result);

		result = 0;
		if (x < y)
			result = 1;
		System.out.printf("%d\n", result);

		result = 0;
		if (x != y)
			result = 1;
		System.out.printf("%d\n", result);

		result = 0;
		if (x >= y)
			result = 1;
		System.out.printf("%d\n", result);
		
		result = 0;
		if (x <= y)
			result = 1;
		System.out.printf("%d\n", result);
				
	}

}
