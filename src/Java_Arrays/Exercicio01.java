package Java_Arrays;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array 
		
		int[] vetorA = {1,2,3,4,5};
		int[] vetorB = {1,2,3,4,5};

		for(int i = 0; i <= vetorA.length; i++) {
			System.out.print(i + " ");
		} 
		
		System.out.println();
		
		for(int j = 0; j <= vetorB.length; j++) {
			System.out.print(j + " ");
		} 
	}
}
