package Java_Arrays;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Programa básico com utitlização de Array e aplicação de método para raiz quadrada
		
		double[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] =  Math.sqrt(vetorA[i]); 
		}
		
		System.out.println("Valores vetor A: \n");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores vetor B:");
		System.out.println();
		for(int i = 0; i < vetorB.length; i++ ) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
