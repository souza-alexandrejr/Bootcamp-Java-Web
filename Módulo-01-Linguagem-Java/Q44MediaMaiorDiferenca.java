package modulo01;

import java.util.Scanner;

public class Q44MediaMaiorDiferenca {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int numImp = 0;
		double n[] = new double[5];
		double maiorNum = 0, menorNum = 0, maiorPar;
		double media, dif, soma = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("Numero #%d: ", i+1);
			n[i] = entrada.nextDouble();
		}
		entrada.close();
		
		// CALCULO DA MEDIA DOS IMPARES
		for (int i = 0; i < 5; i++) {
			if (n[i] % 2 != 0) {
				soma += n[i];
				numImp++;
			}
				
		}
		media = soma/numImp;
		
		// CALCULO DO MAIOR PAR
		maiorPar = 0;
		for (int i = 0; i < 5; i++) {
			if ((i == 0) && (n[i] % 2 == 0))
				maiorPar = n[i];
			if ((n[i] % 2 == 0) && (n[i] > maiorPar))
				maiorPar = n[i];
		}
		
		// CALCULO DA DIFERENCA ENTRE O MAIOR E MENOR NUMERO
		maiorNum = n[0];
		menorNum = n[0];
		for (int i = 0; i < 5; i++) {
			if (n[i] > maiorNum)
				maiorNum = n[i];
			else if (n[i] < menorNum)
				menorNum = n[i];
		}
		dif = maiorNum - menorNum;
		
		// SAIDA DE DADOS
		System.out.printf("Media dos Impares = %.2f\n", media);
		System.out.printf("Maior numero PAR = %.2f\n", maiorPar);
		System.out.printf("Diferenca = %.2f\n", dif);

	}

}
