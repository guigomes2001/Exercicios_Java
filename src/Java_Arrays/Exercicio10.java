package Java_Arrays;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		//Programa básico com utilização de Array e replicação de valores invertidos

		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {

			System.out.println();
			System.out.println("Informe 5 números inteiros para que o programa clone os valores invertidos: ");
			int[] vetorA = new int[5];

			for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = leitor.nextInt();
			}

			int[] vetorB = new int[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				vetorB[vetorB.length - 1 - i] = vetorA[i];
			}

			System.out.println("Os valores invertidos são: ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println();
				System.out.print(vetorB[i] + " ");
			}
			System.out.println();
		}
		leitor.close();
	}
}
