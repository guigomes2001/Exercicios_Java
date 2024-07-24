package Java_OrientacaoAobjetos;

import java.util.Scanner;

public class Exercicio05_Recursividade {
	
	//Programa básico recursivo para calculo fatorial

	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		} else {
			return  num * fatorial(num - 1);
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um número para que o programa calcule o fatorial:");
		int valor = leitor.nextInt();
		
		int resultado = fatorial(valor);
		
		System.out.println("O fatorial de " + valor + " é: " + resultado);
		
		leitor.close();

	}

}
