package modulo01;

import java.util.Scanner;

public class Q01Media {

	public static void main(String[] args) {
		
		float a;
		float b;
		double media;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a primeira nota (0,0 a 10,0):");
		a = entrada.nextFloat();
		System.out.println("Entre com a segunda nota (0,0 a 10,0):");
		b = entrada.nextFloat();
		entrada.close();
		
		// CALCULO DA MEDIA (PESO 11)
		media = (a*3.5 + b*7.5)/11;
		
		// SAIDA DE DADOS
		System.out.printf("Media do Primeiro Bimestre = %.5f",  (media)); 
		
	}

}
