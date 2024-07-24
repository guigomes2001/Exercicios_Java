package Java_IfElse;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Outro leitor básico de valores buscando o melhor preço
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe 3 valores de produtos para que o programa retorne o produto ideal para compra: ");
		int prod1 = leitor.nextInt();
		int prod2 = leitor.nextInt();
		int prod3 = leitor.nextInt();
		
		if(prod1 < prod2 && prod1 < prod3) {
			System.out.println("Produto com valor mais barato é o que cuta R$" + prod1);
		} else if(prod2 < prod1 && prod2 < prod3) {
			System.out.println("Produto com valor mais barato é o que cuta R$" + prod2);
		} else if(prod3 < prod1 && prod3 < prod2) {
			System.out.println("Produto com valor mais barato é o que cuta R$" + prod3);
		} else if(prod1 == prod2 || prod1 == prod3 || prod2 == prod1 || prod2 == prod3 || prod3 == prod1 || prod3 == prod2) {
			System.out.println("Os produtos possuem o mesmo custo!");
		}
		
		leitor.close();

	}

}
