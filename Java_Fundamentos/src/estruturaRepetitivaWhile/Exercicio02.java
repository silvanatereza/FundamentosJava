package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Um posto de combustivel deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritimo para ler o tipo de
		 * combustivel abastecido (codificado da seguinte forma : 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código invalido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido ). O programa
		 * será encerrado quando o código informando for o número 4. Deve ser escrito a
		 * mensagem " MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combistivel.
		 */

		System.out.println(" SEJA BEM VINDO   ");

		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;

		System.out.println(" Digite o númedo de acorod com o combustive de sua prefência  ");

		int tipo = leitor.nextInt();

		while (tipo != 4) {

		}
		if (tipo == 1) {

			alcool = +1;

		} else if (tipo == 2) {
			gasolina = gasolina + 1;

		} else if (tipo == 3) {
			diesel = diesel + 1;

			tipo = leitor.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println(" ÁLCOOL  : " + alcool);
		System.out.println(" Gasolina :  " + gasolina);
		System.out.println(" Diesel : " + diesel);

		leitor.close();

	}

}
