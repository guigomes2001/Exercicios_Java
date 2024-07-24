package Java_Matriz;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		//Programa básico com utilização de Matriz com saída de > < Linha - Coluna

		Random aleatorio = new Random();

		int[][] numAleatorio = new int[10][10];
		

		System.out.println("Matriz de base para retorno: ");
		System.out.println();
		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				numAleatorio[i][j] = aleatorio.nextInt(100);
				System.out.print(numAleatorio[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;

		for (int i = 0; i < numAleatorio[4].length; i++) {
			for (int j = 0; j < numAleatorio[4].length; j++) {
				if (numAleatorio[i][j] > maiorL5) {
					maiorL5 = numAleatorio[i][j];
				}
				if (numAleatorio[4][j] < menorL5) {
					menorL5 = numAleatorio[4][j];
				}
			}
		}
		System.out.println("O maior valor da linha 5 é: " + maiorL5);
		System.out.println("O menor valor da linha 5 é: " + menorL5);
		System.out.println();

		int maiorC7 = 0;
		int menorC7 = Integer.MAX_VALUE;

		for (int i = 0; i < numAleatorio.length; i++) {
				if (numAleatorio[i][6] > maiorC7) {
					maiorC7 = numAleatorio[i][6];
				}
				if (numAleatorio[i][6] < menorC7) {
					menorC7 = numAleatorio[i][6];
				}
			}
		System.out.println("O maior valor da coluna 7 é: " + maiorC7);
		System.out.println("O menor valor da coluna 7 é: " + menorC7);
	}
}