package modulo01;

public class Q13NumerosPares {

	public static void main(String[] args) {
		
		int n = 1;
		int aux = 2;

		while (n < 100) {
			
			// SEQUENCIA DE NUMEROS PARES
			n = 2*aux - 2;
			
			// SAIDA DE DADOS
			System.out.println(n);
			
			aux++;
		}
			
	}

}
