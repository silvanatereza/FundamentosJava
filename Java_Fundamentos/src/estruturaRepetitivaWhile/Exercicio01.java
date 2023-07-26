package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escreva a mensagem
		 * "SENHA INVALIDA". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "ACESSO PERMITIDO" e o algoritmo encerrado . Considere que a senha
		 * correta é o valor 2002 .
		 */

		System.out.println("VOCÊ TEM QUATRO OPÇÕES DE SENHA :");
		System.out.println("2003 , 2005 , 2010, 2002");

		System.out.println(" POR GENTILEZA ENTRE COM A SENHA  ");

		int senha = leitor.nextInt();

		while (senha != 2002) {
			System.out.println("SENHA INVALIDA ");

			senha = leitor.nextInt();

		}

		System.out.println(" ACESSO PERMITIDO  ");

		leitor.close();

	}

}
