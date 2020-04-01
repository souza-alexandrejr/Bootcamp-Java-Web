package modulo01;

import java.util.Scanner;

public class Q20DescontoContaEnergia {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		String bairro;
		int erro;
		double renda;
		double consumo;
		double desconto;
		double valorPagar;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Codigo do bairro do cliente (S/I/T): ");
			bairro = entrada.next();
			if (!(bairro.equals("S") || bairro.equals("I") || bairro.equals("T"))) {
				System.out.println("ERRO: BAIRRO INVALIDO");
				erro = 1;
			}
			else {
				erro = 0;
			}
		} while (erro == 1);
		
		do {
			System.out.println("Renda do usuario (R$): ");
			renda = entrada.nextDouble();
			if (renda < 0) {
				System.out.println("ERRO: RENDA NAO PODE SER NEGATIVA");
				erro = 1;
			}
			else {
				erro = 0;
			}
		} while (erro == 1);
		
		do {
			System.out.println("Consumo energetico (R$): ");
			consumo = entrada.nextDouble();
			if (consumo < 0) {
				System.out.println("ERRO: CONSUMO NAO PODE SER NEGATIVO");
				erro = 1;
			}
			else {
				erro = 0;
			}
		} while (erro == 1);
		
		entrada.close();
		
		// CALCULO DO DESCONTO
		desconto = 0;
		switch (bairro) {
		case "S":
			if (renda >= 50 && renda < 500)
				desconto = 50;
			else if (renda >= 500 && renda < 1000)
				desconto = 25;
			break;
		case "I":
			if (renda >= 240 && renda < 1000)
				desconto = 240;
			else if (renda >= 1000 && renda < 5000)
				desconto = 120;
			break;
		case "T":
			if (renda >= 5000 && renda < 10000)
				desconto = 720;
			else if (renda >= 10000 && renda < 20000)
				desconto = 360;
			break;	
		}
		
		valorPagar = consumo - desconto;
		
		// SAIDA DE DADOS
		System.out.printf("Valor a pagar: %.2f", valorPagar);

	}

}
