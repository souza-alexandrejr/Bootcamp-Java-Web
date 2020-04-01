package modulo01;

import java.util.Scanner;

public class Q32ConsumoCombustivel {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int alcool = 0, gasol = 0, diesel = 0;
		int somaAlcool = 0, somaGasol = 0, somaDiesel = 0;
		int tipo[] = new int[5];
		float litros[] = new float[5];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Tipo de Combustivel: ");
			tipo[i] = entrada.nextInt();
			System.out.println("Quantidade de litros: ");
			litros[i] = entrada.nextFloat();
			switch (tipo[i]) {
			case 1:
				alcool += 1;
				somaAlcool += litros[i];
				break;
			case 2:
				gasol += 1;
				somaGasol += litros[i];
				break;
			case 3:
				diesel += 1;
				somaDiesel += litros[i];
				break;
			}
			
		}
		entrada.close();
	
		// SAIDA DE DADOS
		System.out.printf("Alcool: %d - Qtd litros: %d\n", alcool, somaAlcool);
		System.out.printf("Gasolina: %d - Qtd litros: %d\n", gasol, somaGasol);
		System.out.printf("Diesel: %d - Qtd litros: %d\n", diesel, somaDiesel);
		
	}

}
