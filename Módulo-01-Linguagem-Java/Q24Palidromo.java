package modulo01;

import java.util.Scanner;

public class Q24Palidromo {

	public static void main(String[] args) {
		
		// DECLARACAO DE VARIAVEIS
		int numInt;
		int n[] = new int[5];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero inteiro de CINCO algarismos: ");
		numInt = entrada.nextInt();
		entrada.close();
		
		// CONVERSAO DO NUMERO
		n[0] = numInt / 10000; 
		n[1] = (numInt % 10000) / 1000; 
		n[2] = ((numInt % 10000) % 1000) / 100;
		n[3] = (((numInt % 10000) % 1000) % 100) / 10;
		n[4] = (((numInt % 10000) % 1000) % 100) % 10;
		
		// SAIDA DE DADOS
		String s = n[4] + "" + n[3] + "" + n[2] + "" + n[1] + "" + n[0];
				
		if (numInt == Integer.parseInt(s))
			System.out.println("S");
		else
			System.out.println("N");
		
	}

}
