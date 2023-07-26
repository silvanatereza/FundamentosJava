package estruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Faça um um programa para ler valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa .
		 */

		System.out.println(" Olá , Vamos começar !");

		System.out.println(" Por gentileza, DIGITE UM NÚMERO  !");
		int numeroUm = leitor.nextInt();
		
		System.out.println(" Por gentileza, OUTRO   NÚMERO  !");
		int numeroDois = leitor.nextInt();

		int valor = numeroUm + numeroDois;

		System.out.println(" A soma dos númeos digitados é  = " + valor);

		leitor.close();
	}

}
