package modulo01;

public class Q29SequenciaII {

	public static void main(String[] args) {

		int i = 1;
		int j;
		while (i <= 9) {
			for (j = 7; j >= 5; j--) {
				System.out.printf("I = %d  J = %d\n", i, j);
			}
			i += 2;
		}
	}
}
