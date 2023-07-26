package estruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		/*
		 * Fazer um programa que leia o número de um funcionário,seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcular o salário desse
		 * funcionário.
		 */

		System.out.println("Olá! Seja bem vindo a nossa loja");

		System.out.println("Por gentileza digite informações da peça número 1 ");

		int codigo1, codigo2, qtd1, qtd2;
		double preco1, preco2, total;

		System.out.println("Digite o código da peça número  =");
		codigo1 = leitor.nextInt();

		System.out.println("Digite o quantidade da peça =");
		qtd1 = leitor.nextInt();

		System.out.println("Digite o  preço  da peça =");
		preco1 = leitor.nextDouble();

		System.out.println("Por gentileza digite informações da peça número 2 ");

		System.out.println("Digite o código da peça número  =");
		codigo2 = leitor.nextInt();

		System.out.println("Digite o quantidade da peça =");
		qtd2 = leitor.nextInt();

		System.out.println("Digite o  preço  da peça =");
		preco2 = leitor.nextDouble();

		total = preco1 * qtd1 + preco2 * qtd2;

		System.out.printf(" Valor a pagar = %.2f %n ", +total);

		leitor.close();

	}

}
