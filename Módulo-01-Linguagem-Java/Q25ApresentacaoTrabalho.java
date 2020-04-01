package modulo01;

import java.util.Scanner;

public class Q25ApresentacaoTrabalho {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int req1, req2, req3, req4, req5, nota;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Atendeu ao requisito 'Interface Grafica'? ");
		req1 = entrada.nextInt();
		System.out.println("Atendeu ao requisito 'Inteligencia Artificial'? ");
		req2 = entrada.nextInt();
		System.out.println("Atendeu ao requisito 'Encapsulamento'? ");
		req3 = entrada.nextInt();
		System.out.println("Atendeu ao requisito 'Indentacao'? ");
		req4 = entrada.nextInt();
		System.out.println("Atendeu ao requisito 'Uso de Structs'? ");
		req5 = entrada.nextInt();
		entrada.close();
		
		// CALCULO DA NOTA
		nota = 0;
		if (req1 == 1 || req2 == 1)
			nota += 1;
		if (req3 == 1 && req4 == 1)
			nota += 1;
		if (req5 == 1)
			nota += 1;
		
		// SAIDA DE DADOS
		if (nota == 3)
			System.out.println("AVALIADO");
		else
			System.out.println("0 (Zero)");
			
	}

}
