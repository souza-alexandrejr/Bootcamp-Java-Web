package modulo01;

public class D07SequenciaNumeros {

	public static void main(String[] args) {

		// DECLARACAO DE VARIAVEIS
		int numPar = 0, somaPar = 0;
		int numImpar = 1, somaImpar = 0;
		int num;
		double fatNum = 1;
		
		// CALCULO DA SOMA DOS NUMEROS PARES E IMPARES
		while (numPar < 50){
			numPar += 2;
			numImpar += 2;
			somaPar += numPar;
			somaImpar += numImpar;
		}
		
		// CALCULO DOS FATORIAIS
		if (somaPar > somaImpar)
			num = somaPar - somaImpar;
		else
			num  = somaImpar - somaPar;
		
		for (int i = num; i >= 1; i--) {
			fatNum *= i;
		}
		
		// SAIDA DE DADOS
		System.out.println(fatNum);

	}

}
