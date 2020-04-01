package modulo01;

public class Q35SequenciaIV {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		double num, den;
		double s = 1;

		den = 2;
		for (num = 3; num <= 39; num+=2) {
			s += num/den;
			den*=2;
		}
		System.out.printf("S = %.14f", s);
	}

}
