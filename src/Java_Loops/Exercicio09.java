package Java_Loops;

public class Exercicio09 {

	public static void main(String[] args) {

		// Programa com retorno de números ímpares

		System.out.println("Números ímpares entre 1 e 50:");
		System.out.println();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		// Programa com retorno de números pares
		
		System.out.println("Números pares entre 1 e 50:");
		System.out.println();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		} 
	}
}


