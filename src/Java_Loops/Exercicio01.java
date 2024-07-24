package Java_Loops;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Leitor básico de nota mínima e máxima
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe uma nota entre 0 e 10:");
		double nota = leitor.nextDouble();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota informada está inválida!!!");
			System.out.println();
			System.out.println("Informe uma nota entra 0 e 10:");
			System.out.println();
			nota = leitor.nextDouble();
		}
		
		System.out.println("Nota registrada com sucesso!");
		
		leitor.close();
		

	}

}
