package Java_Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
    	
    	//Programa básico com utilização de Array
    	
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetorB = new int[vetorA.length]; 
       
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.println("Vetor A:");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        System.out.println("\nVetor B:");
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
