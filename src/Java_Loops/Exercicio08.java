package Java_Loops;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
    	
    	//Programa de cálculo expoente 
    	
        Scanner leitor = new Scanner(System.in);

        boolean reiniciar = true;
        
        while(reiniciar) {
        
        System.out.println();
        System.out.print("Digite a base: ");
        double base = leitor.nextDouble();

        System.out.println();
        
        System.out.print("Digite o expoente: ");
        int expoente = leitor.nextInt();
        
        if (expoente < 0) {
        	System.out.println();
            System.out.println("O expoente deve ser um número inteiro não negativo.");
            continue;
        }

        double resultado = 1;
        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
        System.out.println();
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
        
        }
        leitor.close();
    }
}

