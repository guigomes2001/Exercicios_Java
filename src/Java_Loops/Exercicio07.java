package Java_Loops;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		//Programa com retorno de tabuda 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número para que o programa retorno a tabuada: ");
		int numero = leitor.nextInt();
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = "+ resultado);
		}
		
		leitor.close();
	}
}