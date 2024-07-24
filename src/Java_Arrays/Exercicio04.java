package Java_Arrays;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array e retorno dos valores em seus respectivos índices multiplicados
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
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
	}

}
