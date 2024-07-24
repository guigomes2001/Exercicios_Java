package Java_Arrays;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		//Programa básico com utilização de Array - Comparação de notas e situação escolar
		
		 Scanner leitor = new Scanner(System.in);
	        
	     int numAlunos = 5;
	     
	     double[] nota1 = new double[numAlunos];
	     double[] nota2 = new double[numAlunos];
	     double[] media = new double[numAlunos];
	     
	     for(int i = 0; i < numAlunos; i++) {
	    	 System.out.println("Informe a primeira nota do aluno " + (i+1) + ":");
	    	 nota1[i] = leitor.nextDouble();
	    	 System.out.println("Informe a segunda nota do aluno " + (i+1) + ":");
	    	 nota2[i] = leitor.nextDouble();
	    	 
	    	 media[i] = (nota1[i] + nota2[i]) / 2;
	    	 
	    	 String situacaoEscolar = (media[i] >= 7) ? "Aprovado" : "Reprovado";
	    	 System.out.println("A média do aluno " + (i+1) + ", situação: " + situacaoEscolar);
	     }
	       
	       leitor.close(); 
	}
}










































