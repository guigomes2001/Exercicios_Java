package Java_IfElse;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		//Leitor básico utilizando loop-switch (Com loop de reinicialização)

		//Leitor básico utilizando loop-switch (Com loop de reinicialização)

		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {

			System.out.println();
			System.out.println(
					"Digite um número correspondente ao dia da semana para que o programa retorne a dia em questão (Ex: 1 para Domingo, 2 para Segunda-Feira...: ");
			int dia = leitor.nextInt();

			switch (dia) {

			case 1:
				System.out.println("1 - Domingo");
				break;
			case 2:
				System.out.println("2 - Segunda-Feira");
				break;
			case 3:
				System.out.println("3 - Terça-Feira");
				break;
			case 4:
				System.out.println("4 - Quarta-Feira");
				break;
			case 5:
				System.out.println("5 - Quinta-Feira");
				break;
			case 6:
				System.out.println("6 - Sexta-Feira");
				break;
			case 7:
				System.out.println("7 - Sábado");
				break;
			default:
				System.out.println("Digite um número conforme enunciado!");
				break;
			}
		}

		leitor.close();

	}

}
