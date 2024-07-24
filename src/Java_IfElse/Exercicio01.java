package Java_IfElse;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Leitor básico com If-Else para comparação de maior/menor
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe 2 números para comparação de maior/menor: ");
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		
		if(num1 < num2) {
			System.out.println("O número " + num2 + " é maior!!!");
		} else if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior!!!");
		} else {
			System.out.println("Números iguais");
		}
		
		leitor.close();

	}

}
