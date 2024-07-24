package Java_IfElse;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Leitor básico de notas e cálculo de média
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe 3 notas para comparação e cálculo de média (Média geral = 7): ");
		double nota1 = leitor.nextDouble();
		double nota2 = leitor.nextDouble();
		double nota3 = leitor.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média das notas é: " + media);
		
		double mediaGeral = 7;

		if(media >= mediaGeral) {
			System.out.println("Aprovado!!!");
		} else {
			System.out.println("Reprovado");
		}
		
		leitor.close();
	}

}
