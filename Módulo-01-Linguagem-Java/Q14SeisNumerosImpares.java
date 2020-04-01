package modulo01;

import java.util.Scanner;

public class Q14SeisNumerosImpares {
	
	public static void main(String[] args) {

		int x;
		int aux;
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		x = entrada.nextInt();
		entrada.close();

		// CALCULO DOS SEIS NUMEROS IMPARES CONSECUTIVOS
		if (x%2 == 0)
			aux = x + 1;
		else
			aux = x;
		
		for (int i = 0; i < 6; i++) {
			// SAIDA DE DADOS
			System.out.println(aux);
			aux = aux + 2;
		}
			
		}
}
