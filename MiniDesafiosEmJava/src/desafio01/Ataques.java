package desafio01;

import java.util.Scanner;

public class Ataques {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * DESAFIO PEDRA e PAPEL PEDRA
		 * 
		 *  PEDRA = 1 
		 *  PAPEL = 2
		 */

		

		System.out.println("Escolha entre os Número para defini seu ataque ");
		System.out.println("    ");
		System.out.println(" PEDRA  : 1");
		System.out.println(" PAPEL  : 2");

		System.out.println(" Nome dos jogadores  ");
		String jogador1 = leitor.next();

		String jogador2 = leitor.next();

		System.out.println("  ");

		System.out.println(" Ataque jogador 1  ");
		int ataque1 = leitor.nextInt();

		System.out.println(" Ataque jogador 2  ");
		int ataque2 = leitor.nextInt();

		System.out.println("  ");

		System.out.println(" Ataque do jogador  1 ");

		System.out.println("  ");

		System.out.println(" Ataque do jogador  2 ");

		if (ataque1 == 1 && ataque2 == 1) {
			System.out.println(" ANIQUILAÇÃO MUTUA ! ");
		} else if (ataque1 == 2 && ataque2 == 2) {
			System.out.println(" ANIQUILAÇÃO MUTUA ! ");

		} else if (ataque1 == 2 && ataque2 == 1) {

			System.out.println(" Jogador : "  + jogador2 +     "venceu !");
		} else if (ataque1 == 1 && ataque2 == 2) {
			System.out.println(" jogador : " + jogador2   +    "venceu !");
		}

		else {
			System.out.println("JOGO ACABOU ! ");
		}

		leitor.close();

	}

}
