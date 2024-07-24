package Java_Arrays;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array e soma de vetores
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {11,12,13,14,15,16,17,18,19,20};
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Valores vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores vetor C (Valores vetor A e B somados):");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
