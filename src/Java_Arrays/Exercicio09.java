package Java_Arrays;

public class Exercicio09 {
	public static void main(String[] args) {
		
		//Programa básico com Array e retorno comparativo de percentual 
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		
		int qntdPares = 0;
		int qntdImpares = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qntdPares++;
			} else {
				qntdImpares++;
			}
		}
		
		double percentualPar = (double) qntdPares / vetorA.length * 100;
		double percentualImpar = (double) qntdImpares / vetorA.length * 100;
		
		System.out.println("Percentual de pares é de " + percentualPar + " %");
		System.out.println("Percentual de ímpares é de " + percentualImpar + " %");
	}
}