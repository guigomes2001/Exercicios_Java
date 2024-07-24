package Java_IfElse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Leitor básico de números positivos/negativos 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = leitor.nextDouble();
		
		if(numero < 0) {
			System.out.println("Número negativo: " + numero);
		} else if(numero > 0) {
			System.out.println("Número positivo: " + numero);
		} else if(numero == 0) {
			System.out.println("Número nulo:" + numero);
		}
 		
		leitor.close();

	}

}
