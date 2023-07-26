package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double media() {

		return nota1 + nota2 + nota2;

	}

	public double faltaPontos() {
		if (media() < 60) {
			return 60 - media();
		} else {
			return 0;
		}
	}

}
