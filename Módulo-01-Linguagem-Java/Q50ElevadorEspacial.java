package modulo01;

import java.util.Scanner;

public class Q50ElevadorEspacial {

	public static void main(String[] args) {
		
		// DECLARACAO DE VARIAVEIS
		int n, aux = 1;
		int seq[] = new int[1018];
		String num;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o andar desejado: ");
		n = entrada.nextInt();
		entrada.close();
		
		// GERANDO SEQUENCIA SUPERSTICIOSA	
		
		for (int i = 0; i < 1018; i++) {
			num = Integer.toString(aux);
			if (num.contains("4") || num.contains("13")) {
				do {
					aux++;
					num = Integer.toString(aux);
				} while (num.contains("4") || num.contains("13"));
				seq[i] = aux;
				aux++;
			}
			else {
				num = Integer.toString(aux);
				seq[i] = aux;
				aux++;
			}
			
//			System.out.printf("%d\n", seq[i]);

		}
		
		// SAIDA DO ANDAR DESEJADO
		System.out.println("Andar equivalente: " + seq[n-1]);
				
	}

}
