package modulo01;

import java.util.Scanner;

public class Q06ConsumoDeCombustivel {

	public static void main(String[] args) {

		int distancia;
		float combGasto;
		double consumo;
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("CONSUMO DE COMBUSTIVEL");
		System.out.println("Distancia total percorrida (km):");
		distancia = entrada.nextInt();
		System.out.println("Total de combustivel gasto (litros):");
		combGasto = entrada.nextFloat();
		entrada.close();
		
		// CALCULO DO CONSUMO DE COMBUSTIVEL DO AUTOMOVEL
		consumo = distancia/combGasto;
		
		// SAIDA DE DADOS
		System.out.printf("CONSUMO = %.3f km/l\n", consumo); 
	}

}
