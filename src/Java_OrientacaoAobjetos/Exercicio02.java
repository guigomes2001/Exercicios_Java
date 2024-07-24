package Java_OrientacaoAobjetos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		boolean reiniciar = true;

		while (reiniciar) {

			Livro1 livro1 = new Livro1();
			Livro2 livro2 = new Livro2();
			Livro3 livro3 = new Livro3();
			
			System.out.println();
			System.out.println("Os livros disponíveis são: \n");
			System.out.println("1 - " + livro1.nome);
			System.out.println("2 - " + livro2.nome);
			System.out.println("3 - " + livro3.nome);

			System.out.println();
			System.out.println("Digite o número do respectivo livro desejado para verificar demais dados do mesmo: ");
			int numero = leitor.nextByte();
			System.out.println();

			if (numero == 1) {
				System.out.println("1 - " + livro1.nome + "\n");
				System.out.println("Autor: " + livro1.autor);
				System.out.println("Preço: " + livro1.preço);
				System.out.println("Em estoque: " + livro1.estoque);

			} else if (numero == 2) {
				System.out.println("2 - " + livro2.nome + "\n");
				System.out.println("Autor: " + livro2.autor);
				System.out.println("Preço: " + livro2.preço);
				System.out.println("Em estoque: " + livro2.estoque);

			} else {
				System.out.println("3 - " + livro3.nome + "\n");
				System.out.println("Autor: " + livro3.autor);
				System.out.println("Preço: " + livro3.preço);
				System.out.println("Em estoque: " + livro3.estoque);
			}
		}
		
		System.out.println();
		leitor.close();

	}

	static class Livro1 {

		String nome = "O homem mais rico da Babilônia";
		String autor = "George Samuel Clason";
		byte preço = 30;
		byte estoque = 50;

	}

	static class Livro2 {

		String nome = "A sutil arte de ligar o fod*-se";
		String autor = "Mark Manson";
		byte preço = 36;
		byte estoque = 50;

	}

	static class Livro3 {

		String nome = "O poder do silêncio";
		String autor = "Eckhart Tolle";
		byte preço = 32;
		byte estoque = 50;
	}

}
