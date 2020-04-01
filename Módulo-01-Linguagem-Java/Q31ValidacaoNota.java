package modulo01;

import java.util.Scanner;

public class Q31ValidacaoNota {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int erro;
		float media;
		float nota[] = new float[2];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			do {
				System.out.printf("Entre com a nota n. %d: ", i+1);
				nota[i] = entrada.nextFloat();
				if (!(nota[i] >= 0 && nota[i] <= 10)) {
					System.out.println("NOTA INVALIDA");
					erro = 1;
				}
				else {
					erro = 0;
				}
			} while (erro == 1);
		}
		entrada.close();
		
		// CALCULO DA MEDIA
		media = (nota[0] + nota[1])/2;
		System.out.printf("MEDIA: %.2f", media);
		
	}

}
