package Java_Loops;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
    	
    	//Programa da sequência Fibonacci
    	
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = leitor.nextInt();
        
        System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
            
            leitor.close();
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
