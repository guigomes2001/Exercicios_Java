package Java_IfElse;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Programa de comparação e apresentação de vogais e consoantes (Loop de reinicialização)
		
		Scanner leitor = new Scanner(System.in);
		
		boolean reiniciar = true;
		
		while(reiniciar) {
		
		System.out.println();
		System.out.println("Digite uma letra para que o programa informe se é uma vogal ou consoante: ");
		String letra = leitor.nextLine();
		
		String a = "A";
		String e = "E";
		String i = "I";
		String o = "O";
		String u = "U";
		
		if(letra.equalsIgnoreCase(a) || letra.equalsIgnoreCase(e) || letra.equalsIgnoreCase(i) || letra.equalsIgnoreCase(o) || letra.equalsIgnoreCase(u)) {
			System.out.println("A letra digitada é uma vogal!!!");
		} else if(letra != a && letra == e && letra != i && letra != o && letra != u) {
			System.out.println("A letra digitada é uma consoante!!!");
		}
		}

		leitor.close();
	}

}
