package Java_Arrays;

public class Exercicio08 {
	public static void main(String[] args) {

		// Utilizando Array e aplicando função para soma dos valores contidos no Array

		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		int soma = calcularSoma(vetorA);

		System.out.println("Os valores contidos no vetor A são: \n");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A soma dos valores contidos no vetor A é: " + soma);
		System.out.println();
		System.out.println("Os números divisíveis por 5 contidos no vetor A são:");
		
		for(int i = 0; i < vetorA.length; i++) { 
		    if (vetorA[i] % 5 == 0) { //Alterando o valor do módulo, o programa retorna outros valores divisíveis pelos elementos do Array 
		        System.out.print(vetorA[i] + " ");
		    }
		}
	}

	public static int calcularSoma(int[] vetorA) {
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
			
		}

		return soma;
	}

	public static int calcularDivisao(int[] vetorA) {
		int start = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) { //Alterando o valor do módulo, o programa retorna outros valores divisíveis pelos elementos do Array 
				start++;
			}
		}
		return start;
	}
}


