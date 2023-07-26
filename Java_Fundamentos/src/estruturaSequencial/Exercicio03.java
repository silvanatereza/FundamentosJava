package estruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		/*
		 * Fazer um programa que leia o número de um funcionário de horas trabalhadas. o
		 * valor que recebe por hora e calcular o salário desse funcionário.A seguir,
		 * mostre o número e o salário do funcionário, com duas casas decimais
		 */

		System.out.println("Olá! Vamos cobrir quanto você vai receber ?");

		int horas, numero;

		double valorHora, salario;

		System.out.println("Digite seu número : ");
		numero = leia.nextInt();

		System.out.println("Digite o valor da hora  : ");
		valorHora = leia.nextDouble();

		System.out.println("Digite a quantidade de hora trabalhada  : ");
		horas = leia.nextInt();

		salario = valorHora * horas;

		System.out.printf("Seu salário esse mês será R$ : %.2f%n", salario);

		leia.close();

	}

}
