package modulo01;

import java.util.Scanner;

public class Q26BrinquedosParque {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int idade, numBrinq;
		float altura;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Altura do cliente (m): ");
		altura = entrada.nextFloat();
		System.out.println("Idade do cliente (anos): ");
		idade = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO NUMERO DE BRINQUEDOS PERMITIDOS
		numBrinq = 0;
		if (altura >= 1.70 || idade >= 16)
			numBrinq += 1;
		if (altura >= 1.40 && idade >= 12)
			numBrinq += 1;
		if (altura >= 1.50 && idade >= 14)
			numBrinq += 1;
		
		// SAIDA DE DADOS
		System.out.println("Numero de brinquedos permitidos: " + numBrinq);
		
	}

}
