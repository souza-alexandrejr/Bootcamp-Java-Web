package modulo01;

import java.util.Scanner;

public class Q40Triangulo {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int lado1, lado2, lado3;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro lado do triangulo: ");
		lado1 = entrada.nextInt();
		System.out.println("Digite o valor do segundo lado do triangulo: ");
		lado2 = entrada.nextInt();
		System.out.println("Digite o valor do terceiro lado do triangulo: ");
		lado3 = entrada.nextInt();
		entrada.close();
		
		// VERIFICACAO QUANTO A FORMACAO DO TRIANGULO
		if (!((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)))
			System.out.println("VALORES NAO FORMAM UM TRIANGULO");
		else {
			if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3))
				System.out.println("TRIANGULO EQUILATERO");
			else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))
				System.out.println("TRIANGULO ISOSCELES");
			else
				System.out.println("TRIANGULO ESCALENO");
		}

	}

}
