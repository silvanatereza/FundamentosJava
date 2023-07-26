package estruturaCondicional;

import java.io.InputStream;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não */
		
		
		
		 
		 System.out.println("Por gentileza, digite um número :  ");
		 int numero = leitor.nextInt();
		 
		 if (numero <= 0) {
			 System.out.println("NEGATIVO!");
		 }
		 else {
			 System.out.println("POSITIVO!");
		 }
		 
		
		
		
		leitor.close();

	}

	

}
