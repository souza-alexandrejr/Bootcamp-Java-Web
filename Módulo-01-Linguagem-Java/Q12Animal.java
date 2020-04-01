package modulo01;

import java.util.Scanner;

public class Q12Animal {

	public static void main(String[] args) {

		String vertebra;
		String especie;
		String alimento;
		String animal = "";
		
		// ENTRADA DE DADOS		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ANIMAL");
		System.out.println("vertebrado/invertebrado?");
		vertebra = entrada.next();
		System.out.println("Especie:");
		especie = entrada.next();
		System.out.println("Tipo quanto à alimentacao:");
		alimento = entrada.next();
		entrada.close();
		
		// DEFINICAO DO ANIMAL
		if (vertebra.equals("vertebrado")) {
			if (especie.equals("ave")) {
				if (alimento.equals("carnivoro"))
					animal = "aguia";
				else if (alimento.equals("onivoro"))
					animal = "pomba";
			}
			else if (especie.equals("mamifero")) {
				if (alimento.equals("onivoro"))
					animal = "homem";
				else if (alimento.equals("herbivoro"))
					animal = "vaca";
			}
		}
		else if (vertebra.equals("invertebrado")) {
			if (especie.equals("inseto")) {
				if (alimento.equals("hematofogo"))
					animal = "pulga";
				else if (alimento.equals("herbivoro"))
					animal = "lagarta";
			}
			else if (especie.equals("anelideo")) {
				if (alimento.equals("hematofogo"))
					animal = "sanguessuga";
				else if (alimento.equals("onivoro"))
					animal = "minhoca";
			}
		}
				
		// SAIDA DE DADOS
		System.out.println("Nome do animal: " + animal);


	}

}
