package modulo01;

import java.util.Scanner;

public class Q21CarrosJoaoMaria {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int maxAno = 0;
		int ano[] = new int[3];
		float maxVel = 0;
		float velMed;
		float veloc[] = new float[3];
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.printf("DADOS DO CARRO n. %d\n", i+1);
			System.out.printf("Ano: ");
			ano[i] = entrada.nextInt();
			System.out.printf("Velocidade: ");
			veloc[i] = entrada.nextFloat();
		}
		entrada.close();
				
		// DEFINICAO DO CARRO MAIS NOVO E MAIS RAPIDO
		maxAno = ano[0];
		maxVel = veloc[0];
		for (int i = 1; i < 3; i++) {
			if (ano[i] > maxAno)
				maxAno = ano[i];
			if (veloc[i] > maxVel)
				maxVel = veloc[i];
		  }
			
		// CALCULO DA VELOCIDADE MEDIA
		velMed = (veloc[0] + veloc[1] + veloc[2])/3;
		
		// SAIDA DE DADOS
		System.out.printf("Ano do carro mais novo: %d\n", maxAno);
		System.out.printf("Velocidade do carro mais rapido: %.2f\n", maxVel);
		System.out.printf("Velocidade media entre os carros: %.2f\n", velMed);
	}

}
