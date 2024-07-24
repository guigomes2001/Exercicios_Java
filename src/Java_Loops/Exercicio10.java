package Java_Loops;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		//Programa de retorno de números inteiros entre os números informados 
		
		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {

			System.out.println();
			System.out.println("Informe 2 números inteiros para que o programa retorne os números inteiros no intervalo compreendido entre os eles:");
			int num1 = leitor.nextInt();
			int num2 = leitor.nextInt();

			if (num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.println("Números no intervalo " + num1 + " e " + num2 + ":");
			System.out.println();

			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
		leitor.close();
	}
}
