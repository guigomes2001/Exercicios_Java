package Java_Arrays;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array (Aplicando divisão para retorno de vetor C)
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {11,12,13,14,15,16,17,18,19,20};
		int[] vetorC = new int[vetorA.length];
				
		System.out.println("Valores vetor A: /n");
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores vetor B: \n");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores vetor C: \n");
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorB[i] / vetorA[i];
			System.out.print(vetorC[i] + " ");
		}
	}

}
