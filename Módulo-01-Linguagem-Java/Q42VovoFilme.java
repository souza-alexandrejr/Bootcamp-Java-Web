package modulo01;

import java.util.Scanner;

public class Q42VovoFilme {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		double valorAntigo, valorAtual, aumento;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor antigo do ingresso (R$): ");
		valorAntigo = entrada.nextDouble();
		System.out.println("Digite o valor atual do ingresso (R$): ");
		valorAtual = entrada.nextDouble();
		entrada.close();
		
		// CALCULO DO AUMENTO EM PORCENTAGEM
		aumento = (valorAtual/valorAntigo - 1)*100;
		
		// SAIDA DE DADOS
		System.out.println(aumento + " %");

	}

}
