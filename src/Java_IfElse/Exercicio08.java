package Java_IfElse;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		//Leitor comparativo de números e retorno em ordem decrescente
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite 4 números:");

		int num1 = leitor.nextInt();
		int num2 = leitor.nextInt();
		int num3 = leitor.nextInt();
		int num4 = leitor.nextInt();

		System.out.println();

		if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
			System.out.println(num1);
			if (num2 >= num3 && num2 >= num4) {
				System.out.println(num2);
				if (num3 >= num4) {
					System.out.println(num3);
					System.out.println(num4);
				} else {
					System.out.println(num4);
					System.out.println(num3);
				}
			} else if (num3 >= num4) {
				System.out.println(num3);
				System.out.println(num4);
				System.out.println(num2);
			} else {
				System.out.println(num4);
				System.out.println(num3);
				System.out.println(num2);
			}
		} else if (num2 >= num3 && num2 >= num4) {
			System.out.println(num2);
			if (num3 >= num4) {
				System.out.println(num3);
				System.out.println(num4);
				System.out.println(num1);
			} else {
				System.out.println(num4);
				System.out.println(num3);
				System.out.println(num1);
			}
		} else if (num3 >= num4) {
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num1);
			System.out.println(num2);
		} else {
			System.out.println(num4);
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}

		leitor.close();
	}
}
