package modulo01;

import java.util.Scanner;

public class Q19AumentoTrabalhadores {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		double salario;
				
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Salario atual: ");
		salario = entrada.nextDouble();
		entrada.close();
		
		// CALCULO DO NOVO SALARIO
		if (salario < 300)
			salario *= 1.05;
		else if (salario >= 300 && salario < 500)
			salario *= 1.07;
		else 
			salario *= 1.10;
		
		// SAIDA DE DADOS
		System.out.printf("Novo salario: %.2f", salario);
		
	}

}
