package Java_OrientacaoAobjetos;

import java.util.Scanner;

public class Exercicio06_Recursividade_Fibonacci2 {
	
	public static int fibonacci(int num) {
		
		if(num < 1) {
			
			return 1;
		} else {
			
		return fibonacci(num-1) + fibonacci(num-2);
		}
	}

	public static void main(String[] args) {
		
	// Esse bloco retorna a sequência até o n-enésimo valor atribuido no inteiro
		
	/*	int valor = 10;
		
		for(int i = 0; i < valor; i++) {
			System.out.print(fibonacci(i) + " ");
		} 
	*/
		
	//Esse bloco retorna a sequência até o n-enésimo valor informado no Scanner
		
		 Scanner leitor = new Scanner(System.in);
	        
	        System.out.println("Informe o n-ésimo número para que retorne a sequência Fibonacci:");
	        int valor = leitor.nextInt();
	        
	        if (valor <= 0) {
	            System.out.println("O número deve ser maior que zero.");
	        } else {
	            System.out.println("A sequência de Fibonacci até o " + valor + "º número é:");
	            for(int i = 0; i < valor; i++) {
	                System.out.print(fibonacci(i) + " ");
	            }
	        }
	        
	        leitor.close(); 
	    }
}
