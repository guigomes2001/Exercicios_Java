package Java_Loops;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Impressão de números. Sequências em horizontal e vertical
		
		//Impressão vertical
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; numbers.length > i; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		//Impressão horizontal
		
		int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};
		
		for(int i = 0; numbers2.length > i; i++) {
			System.out.print(numbers2[i] + " ");
		}
		
	}

}
