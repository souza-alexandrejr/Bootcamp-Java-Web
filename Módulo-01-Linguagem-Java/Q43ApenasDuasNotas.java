package modulo01;

import java.util.Scanner;

public class Q43ApenasDuasNotas {
	
	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int compra, valorPago, troco;
		int notas, aux = 0;
		int n_100 = 0;
		int n_50 = 0;
		int n_20 = 0;
		int n_10 = 0;
		int n_5 = 0;
		int n_2 = 0;
		
		// ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da compra (R$): ");
		compra = entrada.nextInt();
		System.out.println("Digite o valor pago (R$): ");
		valorPago = entrada.nextInt();
		entrada.close();
		
		// CALCULO DO TROCO
		troco = valorPago - compra;
		
		// DECOMPOSICAO NO MENOR NUMERO DE NOTAS (CEDULAS) POSSIVEIS
		if (troco >= 100) {
			n_100 = troco/100;
			aux = troco % 100;
			n_50 = aux/50;
			aux = aux % 50;
			n_20 = aux/20;
			aux = aux % 20;
			n_10 = aux/10;
			aux = aux % 10;
			n_5 = aux/5;
			aux = aux % 5;
			n_2 = aux/2;
		} else if (troco >= 50 && troco < 100) {
			n_50 = troco/50;
			aux = troco % 50;
			n_20 = aux/20;
			aux = aux % 20;
			n_10 = aux/10;
			aux = aux % 10;
			n_5 = aux/5;
			aux = aux % 5;
			n_2 = aux/2;
		} else if (troco >= 20 && troco < 50) {
			n_20 = troco/20;
			aux = troco % 20;
			n_10 = aux/10;
			aux = aux % 10;
			n_5 = aux/5;
			aux = aux % 5;
			n_2 = aux/2;
		} else if (troco >= 10 && troco < 20) {
			n_10 = troco/10;
			aux = troco % 10;
			n_5 = aux/5;
			aux = aux % 5;
			n_2 = aux/2;
		} else if (troco >= 5 && troco < 10) {
			n_5 = troco/5;
			aux = troco % 5;
			n_2 = aux/2;
		} else if (troco >= 2 && troco < 5) {
			aux = troco % 5;
			n_2 = troco/2;
		}
		
		notas = n_100 + n_50 + n_20 + n_10 + n_5 + n_2;
		
		// SAIDA DE DADOS
		if(notas == 2)
			System.out.println("Possivel");
		else
			System.out.println("Impossivel");
		
	}

}
