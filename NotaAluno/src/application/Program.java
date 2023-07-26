package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano . Ao final,mostrar qual a nota final do aluno no
		 * ano. Dizer também se o aluno esta aprovado ou não.
		 */

		Aluno aluno = new Aluno();

		System.out.print("Nome do aluno : ");
		aluno.nome = sc.next();
		System.out.print(" Nota 1  : ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3 : ");
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Media : %.2f%n", aluno.media());

		if (aluno.media() < 60) {
			System.out.println(" faltam : ");
			System.out.printf(" faltam 5.2f%n", aluno.faltaPontos());

		} else {
			System.out.println("Passou ! ");
		}

		sc.close();

	}

}
