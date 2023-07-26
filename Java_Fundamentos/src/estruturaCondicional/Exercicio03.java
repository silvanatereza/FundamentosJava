package estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Leia 2 valores inteiros (A e B ).Apos, o programa deve mostrar uma mensagem
		 * " SÃO MULTIPLOS" ou "NÃO SÃO MULTIPLOS", indicando se os valores lidos são
		 * mútiplos entre si.
		 */

		System.out.println("Digite um número A : ");
		int a = leitor.nextInt();

		System.out.println("Digite um número B : ");
		int b = leitor.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println(" SÃO MÚLTIPLOS : ");
		} else {
			System.out.println(" NÃO SÃO  MÚLTIPLOS : ");

		}

		leitor.close();

	}

}
