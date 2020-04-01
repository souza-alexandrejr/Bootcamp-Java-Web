package modulo01;

import java.util.Scanner;

public class Q41PesoIdeal {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		double peso, altura, pesoIdeal;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a altura do individuo (m): ");
		altura = entrada.nextDouble();
		System.out.println("Digite o peso do individuo (kg): ");
		peso = entrada.nextDouble();
		entrada.close();
		
		// DEFINICAO DO PESO IDEAL
		if (altura <= 1.50)
			pesoIdeal = 50;
		else if (altura >= 1.51 && altura <= 1.90)
			pesoIdeal = 70;
		else
			pesoIdeal = 100;
		
		// SAIDA DE DADOS
		if (peso == pesoIdeal)
			System.out.println("Parabens! Peso ideal!");
		else if (peso < pesoIdeal)
			System.out.printf("Engorde %.2f KG", (pesoIdeal-peso));
		else
			System.out.printf("Emagreca %.2f KG", (peso-pesoIdeal));

	}

}
