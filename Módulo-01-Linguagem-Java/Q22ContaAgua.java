package modulo01;

import java.util.Scanner;

public class Q22ContaAgua {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int consumo;
		float valorPagar = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Consumo de agua da residencia (m3):" );
		consumo = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO VALOR A PAGAR
		if (consumo <= 10) {
			valorPagar = 7;
		}
		else if (consumo >= 11 && consumo <= 30) {
			valorPagar = 7 + (consumo-10)*1;
		}
		else if (consumo >= 31 && consumo <= 100) {
			valorPagar = 7 + 20*1 + (consumo - 30)*2;
		}
		else if (consumo >= 101) {
			valorPagar = 7 + 20*1 + 70*2 + (consumo-100)*5;
		}
		
		// SAIDA DE DADOS
		System.out.printf("Valor em Reais: %.2f", valorPagar);
	}

}
