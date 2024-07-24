package Java_Matriz;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
    	
    	//Programa básico com utilização de Matriz com impressão de pares e ímpares
        
        Scanner leitor = new Scanner(System.in);
        
        int[][] tabela = new int[2][3];
        
        for(int i = 0; i < tabela.length; i++) {
        	for(int j = 0; j < tabela[i].length; j++) {
        		System.out.println("Informe os valores das posições [" + i + "," + j + "]" );
        		tabela[i][j] = leitor.nextInt();
        	}
        }
        
        System.out.println();
        System.out.println("Tabela com os valores informados:");
        System.out.println();
        
        for(int i = 0; i < tabela.length; i++) {
        	for(int j = 0; j < tabela[i].length; j++) {
        		System.out.print(tabela[i][j] + "\t");
        	}
        	System.out.println();
        }
        
        int qntdPares = 0;
        int qntdImpares = 0;
        
        for(int i = 0; i < tabela.length; i++) {
        	for(int j = 0; j < tabela[i].length; j++) {
        		if(tabela[i][j] % 2 == 0) {
        			qntdPares++;
        		} else {
        			qntdImpares++;
        		}
        	}
        }
        
        System.out.println();
        System.out.println("A quantidade de números pares digitados é: " + qntdPares);
        System.out.println("A quantidade de números ímpares digitados é: " + qntdImpares);

        
        leitor.close();

    }

}
