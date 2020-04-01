package modulo01;

import java.util.Scanner;

public class D08RaizesEquacao2Grau {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int a, b, c;
		double delta, raiz1, raiz2;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do coeficiente A:");
		a = entrada.nextInt();
		System.out.println("Digite o valor do coeficiente B:");
		b = entrada.nextInt();
		System.out.println("Digite o valor do coeficiente C:");
		c = entrada.nextInt();
		entrada.close();
		
		// CALCULO DAS RAIZES
		delta = b*b - 4*a*c;
		if (delta < 0)
			System.out.printf("Indeterminadas");
		else {
			raiz1 = (- b - Math.sqrt(delta))/(2*a);
			raiz2 = (- b + Math.sqrt(delta))/(2*a);
			
			// SAIDA DE DADOS
			if (raiz1 != raiz2)
				System.out.printf("X1 = %.2f ; X2 = %.2f", raiz1, raiz2);
			else if (raiz1 == raiz2)
				System.out.printf("X1 = %.2f", raiz1);
		}
	}
}
