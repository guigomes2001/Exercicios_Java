package Java_Matriz;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Matriz

		Random aleatorio = new Random();

		double[][] numAleatorios = new double[4][4];

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = aleatorio.nextDouble(10);
			}
		}

		double maior = 0;
		double linha = 0;
		double coluna = 0;

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				if (numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					coluna = j;
				}

				System.out.println("O maior valor da coluna = " + maior);
				System.out.println("O valor da linha é = " + linha);
				System.out.println("O valor da coluna = " + coluna);
			}
		}

	}

}
