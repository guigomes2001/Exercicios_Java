package Java_IfElse;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Leitor básico de comparação e apresentação de maior digitado

		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {
			
			System.out.println();
			System.out.println("Informe 3 valores que o programa retornará o maior deles: ");
			int num1 = leitor.nextInt();
			int num2 = leitor.nextInt();
			int num3 = leitor.nextInt();

			if (num1 > num2 && num1 > num3) {
				System.out.println("O maior número é o " + num1 + "!");
			} else if (num2 > num1 && num2 > num3) {
				System.out.println("O maior número é o " + num2 + "!");
			} else if (num3 > num1 && num3 > num2) {
				System.out.println("O maior número é o " + num3 + "!");
			} else if (num1 == num2 && num1 == num3 && num2 == num1 && num2 == num3 && num3 == num1 && num3 == num2) {
				System.out.println("Os números são iguais!");
			}

		}

		leitor.close();

	}

}
