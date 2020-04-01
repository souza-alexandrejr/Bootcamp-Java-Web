package modulo01;

public class D01RainhaMonge {

	public static void main(String[] args) {
		
		// DECLARACAO DE VARIAVEIS
		double qtd = 1;
		double soma = 0;
		
		// CALCULO DA QUANTIDADE E SOMA
		for (int i = 0; i < 64; i++) {
			soma += qtd;
			System.out.printf("Casa: %d - Qtd: %f - Soma: %f\n", i+1, qtd, soma);
			qtd *= 2;
		}
	}
}
