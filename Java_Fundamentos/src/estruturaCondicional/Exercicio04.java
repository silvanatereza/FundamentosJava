package estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo,sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração minima de 1 hora e máxima de 24 horas
		 */

		System.out.println("Hora do inicio do jogo ");
		int horaInicio = leitor.nextInt();

		System.out.println("Hora do final do jogo ");
		int horaFinal = leitor.nextInt();

		int duracao;

		if (horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaFinal;

			System.out.println(" O JOGO DUROU " + duracao + "(S)");

		}

		leitor.close();

	}

}
