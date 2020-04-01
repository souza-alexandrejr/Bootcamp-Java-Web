package modulo01;

import java.util.Scanner;

public class Q08RendaConjunta {

	public static void main(String[] args) {

		double rH;
		double rM;
		double rC;
		int aliq;
		double imposto;
		double rendaLiq;
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("RENDA CONJUNTA");
		System.out.println("Renda do Homem:");
		rH = entrada.nextDouble();
		System.out.println("Renda da Mulher:");
		rM = entrada.nextDouble();
		entrada.close();
		
		// CALCULO DO IMPOSTO
		rC = rH + rM;
		
		if (rC <= 900.00)
			aliq = 0;
		else if (rC >= 900.01 && rC <= 1500.00)
			aliq = 10;
		else if (rC >= 1500.01 && rC <= 2500.00)
			aliq = 15;
		else
			aliq = 25;
		
		
		imposto = aliq*rC/100;
		rendaLiq = rC - imposto;
		
		// SAIDA DE DADOS
		System.out.printf("RENDA CONJUNTA: %.2f \n", rC);
		System.out.println("ALIQUOTA UTILIZADA: " + aliq + "%");
		System.out.printf("IMPOSTO DE RENDA: %.2f \n", imposto);
		System.out.printf("RENDA LIQUIDA: %.2f \n", rendaLiq);
		
	}

}
