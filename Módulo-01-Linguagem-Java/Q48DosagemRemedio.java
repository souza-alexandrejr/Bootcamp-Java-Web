package modulo01;

import java.util.Scanner;

public class Q48DosagemRemedio {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int idade, nGotas, dosagem;
		float peso;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a idade do paciente (anos): ");
		idade = entrada.nextInt();
		System.out.println("Digite o peso do paciente (kg): ");
		peso = entrada.nextFloat();
		entrada.close();
		
		// CALCULO DA DOSAGEM DO MEDICAMENTO
		if (idade >= 12) {
			if (peso >= 60)
				dosagem = 1000;
			else
				dosagem = 875;
		} 
		else {
			if (peso >= 5 && peso <= 9)
				dosagem = 125;
			else if (peso >= 9.1 && peso <= 16)
				dosagem = 250;
			else if (peso >= 16.1 && peso <= 24)
				dosagem = 375;
			else if (peso >= 24.1 && peso <= 30)
				dosagem = 500;
			else
				dosagem = 750;
		}
		
		// CALCULO NO NUMERO DE GOTAS
		nGotas = dosagem/500*20;
		
		// SAIDA DE DADOS
		System.out.printf("%d gotas", nGotas);

				
				
	}

}
