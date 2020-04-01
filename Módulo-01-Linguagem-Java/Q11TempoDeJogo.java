package modulo01;

import java.util.Scanner;

public class Q11TempoDeJogo {

	public static void main(String[] args) {

		int horaInicial;
		int horaFinal;
		int tempoTotal;
							
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("TEMPO DE JOGO");
		System.out.println("Hora Inicial:");
		horaInicial = entrada.nextInt();
		System.out.println("Hora Final:");
		horaFinal = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO TEMPO DE JOGO
		if (horaFinal > horaInicial)
			tempoTotal = horaFinal - horaInicial;
		else
			tempoTotal = 24 - horaInicial + horaFinal;
			
		// SAIDA DE DADOS
		System.out.printf("O JOGO DUROU %d HORA(S)", tempoTotal);
	}

}
