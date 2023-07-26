package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um número N.Depois leia N pares e mostre a divisão
		 * do primeiro pelo segundo.Se o denominador for iagual a zero, mostre a
		 * mensagem "DIVISÃO IMPOSSIVEL".
		 */

		int n = leitor.nextInt();

		for (int i = 0; 1 < n; i++) {

			int x = leitor.nextInt();
			int y = leitor.nextInt();

			if (y == 0) {

				System.out.println(" DIVISÃO IMPOSSIVEL ");

			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		leitor.close();

	}

}
