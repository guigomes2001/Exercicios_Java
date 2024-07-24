package Java_Loops;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
    	
    	//Leitor básico e comparação >< 
    	
        Scanner leitor = new Scanner(System.in);
        
        boolean reiniciar = true;
        
        while(reiniciar) {
        	
        System.out.println();
        System.out.println("Informe 5 valores para que o programa informe o maior valor dentre eles:");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int num4 = leitor.nextInt();
        int num5 = leitor.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num4 > maior) {
            maior = num4;
        }
        if (num5 > maior) {
            maior = num5;
        } 
        
        if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5){
        	System.out.println("Os números são iguais");
        }
        
        System.out.println();
        System.out.println("O maior número é o " + maior);
        
        }

        leitor.close();
    }

}
