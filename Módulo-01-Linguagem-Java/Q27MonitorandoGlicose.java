package modulo01;

import java.util.Scanner;

public class Q27MonitorandoGlicose {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		float glic[] = new float[4];
		double glicMed;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("TAXA DE GLICOSE");
		for (int i = 0; i < 4; i++) {
			System.out.printf("Medicao n. %d: ", i+1);
			glic[i] = entrada.nextFloat();
		}
		entrada.close();
		
		// SAIDA DE DADOS
		for (int i = 0; i < 4; i++) {
			if (glic[i] < 110)
				System.out.println("NORMAL");
			else if (glic[i] >= 110 && glic[i] <= 125)
				System.out.println("ALTERADA");
			else
				System.out.println("MUITO ALTA");
		}
		
		// CALCULO DA MEDIA DAS LEITURAS
		glicMed = (glic[0] + glic[1] + glic[2] + glic[3])/4;
		System.out.printf("MEDIA DAS LEITURAS: %.2f", glicMed);
	}

}
