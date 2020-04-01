package modulo01;

import java.util.Scanner;

public class Q02Salario {

	public static void main(String[] args) {
		
		int num;
		int horas;
		float valor;
		float salario;
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ENTRADA DE DADOS DO FUNCIONARIO");
		System.out.println("Numero do funcionario:");
		num = entrada.nextInt();
		System.out.println("Quantidade de horas trabalhadas:");
		horas = entrada.nextInt();
		System.out.println("Valor recebido por hora trabalhada:");
		valor = entrada.nextFloat();
		entrada.close();
		
		// CALCULO DO SALARIO
		salario = valor*horas;
		
		// SAIDA DE DADOS
		System.out.printf("NUMERO = %d \n", num);
		System.out.printf("SALARIO = R$ %.2f \n", salario);
				
		
	}

}
