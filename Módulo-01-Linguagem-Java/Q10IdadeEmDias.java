package modulo01;

import java.util.Scanner;

public class Q10IdadeEmDias {

	public static void main(String[] args) {

		int idade;
		int aux;
		int ano;
		int mes;
		int dia;
							
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("IDADE EM DIAS:");
		idade = entrada.nextInt();
		entrada.close();
		
		// CONVERSAO EM HH:MM:SS
		ano = idade/365;
		aux = idade%365;
		mes = aux/30;
		dia = aux%30;
								
		// SAIDA DE DADOS
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", ano, mes, dia);
	}

}
