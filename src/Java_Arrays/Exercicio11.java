package Java_Arrays;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array e formação de um novo vetor conforme registros colhidos

		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {
			
			System.out.println();
			System.out.println();
			System.out.println("Informe a primeira leva com 3 números:");
			int[] vetorA = new int[3];

			for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = leitor.nextInt();
			}

			System.out.println();
			System.out.println("Informe a segunda leva com 3 números:");
			int[] vetorB = new int[3];

			for (int i = 0; i < vetorB.length; i++) {
				vetorB[i] = leitor.nextInt();
			}

			int[] vetorC = new int[vetorA.length + vetorB.length];

			for (int i = 0; i < vetorA.length; i++) {
				vetorC[i] = vetorA[i];
			}

			for (int i = 0; i < vetorA.length; i++) {
				vetorC[vetorA.length + i] = vetorB[i];
			}

			System.out.println();
			System.out.println("A primeira e segunda leva formam a seguinte sequência da terceira leva: ");

			for (int i = 0; i < vetorC.length; i++) {
				System.out.print(vetorC[i] + " ");
			}
		}

		leitor.close();
	}

}
