package modulo01;

import java.util.Scanner;

public class Q09ConversaoDeHoras {

	public static void main(String[] args) {

			int t;
			int aux;
			int horas;
			int min;
			int seg;
								
			// ENTRADA DE DADOS		
			Scanner entrada = new Scanner(System.in);
			System.out.println("CONVERSAO DE HORAS");
			System.out.println("Tempo de duracao do evento (s):");
			t = entrada.nextInt();
			entrada.close();
			
			// CONVERSAO EM HH:MM:SS
			horas = t/3600;
			aux = t%3600;
			min = aux/60;
			seg = aux%60;
									
			// SAIDA DE DADOS
			System.out.printf("HH:MM:SS = %02d:%02d:%02d", horas, min, seg);
			
					
	}

}
