package modulo01;

import java.util.Scanner;

public class Q18InverterQuatroAlgarismos {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int numInt;
		int n[] = new int[4];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero inteiro de quatro algarismos: ");
		numInt = entrada.nextInt();
		entrada.close();
		
		// CONVERSAO DO NUMERO
		n[0] = numInt / 1000; 
		n[1] = (numInt % 1000) / 100; 
		n[2] = ((numInt % 1000) % 100) / 10;
		n[3] = ((numInt % 1000) % 100) % 10;
		
		// SAIDA DE DADOS
		for (int i = 3; i >= 0; i--) {
			if (n[i] != 0)
				System.out.printf("%d", n[i]);
		}

	}

}
