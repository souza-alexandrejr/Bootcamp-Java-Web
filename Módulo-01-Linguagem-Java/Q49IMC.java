package modulo01;

import java.util.Scanner;

public class Q49IMC {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		float peso, altura, imc;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o peso do individuo (kg): ");
		peso = entrada.nextFloat();
		System.out.println("Digite a altura do individuo (m): ");
		altura = entrada.nextFloat();
		entrada.close();
		
		// CALCULO DO IMC
		imc = peso/(altura*altura);
		
		// SAIDA DE DADOS
		if (imc < 20)
			System.out.println("IMC = " + imc + " - Abaixo do peso");
		else if (imc >= 20 && imc < 25)
			System.out.println("IMC = " + imc + " - Peso Normal");
		else if (imc >= 25 && imc < 30)
			System.out.println("IMC = " + imc + " - Sobre Peso");
		else if (imc >= 30 && imc < 40)
			System.out.println("IMC = " + imc + " - Obeso");
		else
			System.out.println("IMC = " + imc + " - Obeso Mórbido");
		
	}

}
