package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um número inteiro e dier se este número é par ou
		 * ímpar
		 */

		System.out.println("Digite um número :");
		int numero = leitor.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		leitor.close();

	}

}
