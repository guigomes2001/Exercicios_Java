package Java_IfElse;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		//Programa comparativo de dados e retorno conforme conceito e média de dados
		
		/* Médias de aproveitamento ------- Conceito 
		 
			Entre 9.0 e 10.0 				A - Aprovado 
			Entre 7.5 e 9.0 				B - Aprovado 
			Entre 6.0 e 7.5					C - Aprovado 
			Entre 4.0 e 5.9					D - Reprovado 
			Entre 4.0 e zero 				E - Reprovado 
			
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe duas notas para que o programa avalie as mesmas (De 0 a 10 pontos): ");
		double nota1 = leitor.nextDouble();
		double nota2 = leitor.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média das notas é " + media);
		
		if(media >= 9 && media <= 10) {
			System.out.println("Aprovado - Conceito A");
		} else if(media >= 7.5 && media <= 9) {
			System.out.println("Aprovado - Conceito B");
		} else if(media >= 6 && media <= 7.5) {
			System.out.println("Aprovado - Conceito C");
		} else if(media >= 4 && media <= 5.9){
			System.out.println("Reprovado - Conceito D");
		} else if(media >= 4 && media == 0) {
			System.out.println("Reprovado - Conceito E");
		}
		 
		leitor.close();
	}

}
