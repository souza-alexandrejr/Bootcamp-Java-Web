package modulo01;

import java.util.Scanner;

public class Q03SalarioComBonificacao {

	public static void main(String[] args) {

		String nome;
		double salarioFixo;
		double montante;
		double total;
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ENTRADA DE DADOS DO VENDEDOR");
		System.out.println("Nome do vendedor:");
		nome = entrada.next();
		System.out.println("Salario fixo do vendedor:");
		salarioFixo = entrada.nextDouble();
		System.out.println("Total de vendas efetuadas no mês (R$):");
		montante = entrada.nextDouble();
		entrada.close();
		
		// TOTAL A RECEBER NO FINAL DO MES
		total = salarioFixo + 0.15*montante;
		
		// SAIDA DE DADOS
		System.out.printf("FUNCIONARIO = %s \n",  nome); 
		System.out.printf("TOTAL = R$ %.2f",  total); 
		
		
	}

}
