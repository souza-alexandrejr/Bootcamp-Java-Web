package modulo01;

import java.util.Scanner;

public class Q37VencedorParImpar {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		String nome[] = new String[2];
		String escolha[] = new String[2];
		String vencedor = "";
		int num[] = new int[2];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Entrada: [NOME] [PAR/IMPAR] [NUMERO]: ");
			String comando = entrada.nextLine();
			String[] parts = comando.split(" ");
			nome[i] = parts[0];
			escolha[i] = parts[1];
			num[i] = Integer.parseInt(parts[2]);
		}
		entrada.close();
				
		// DEFINICAO DO VENCEDOR
		if ((num[0] + num[1]) % 2 == 0) {
			if (escolha[0].contains("PAR"))
				vencedor = nome[0];
			else
				vencedor = nome[1];
		} 
		else
			if (escolha[0].contains("IMPAR"))
				vencedor = nome[0];
			else
				vencedor = nome[1];
		
		// SAIDA DE DADOS
		System.out.println(vencedor);

	}

}
