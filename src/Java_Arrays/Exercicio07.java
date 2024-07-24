package Java_Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array e aplicação de condição para retorno de valor ímpar/par

		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 0;
			} else {
				vetorB[i] = 1;
			}
		}

		System.out.println("Valores vetor A: ");
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Valores vetor B: ");
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		} 
		
		//No bloco de código abaixo o programa retorna a quantidade de pares contidos em um Array
		
/*      int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int contadorPares = contarPares(vetorA);
		
		System.out.println("Quantidade de pares no vetor A é: " + contadorPares);
	}
		
	public static int contarPares (int[] vetorA) {
		int count = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
		
			if (vetorA[i] % 2 == 0) { //Invertendo a codição, o programa retorna a quantidade valores ímpares no Array (if (vetorA[i] % 2 != 0)) 
	                count++;
	            }
	        }
	        return count;
	    }                         */
	}
}
















