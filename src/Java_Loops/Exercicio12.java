package Java_Loops;

import java.util.Scanner; 

public class Exercicio12 {

	public static void main(String[] args) {
		
		//Programa de cálculo percentual 
		
				Scanner leitor = new Scanner(System.in);
				
				int contador = 0;
				 
				 System.out.println("Informe a população de um país A e B para que o programa colha os valores e calcule a quantidade de anos que será necessário para que o país A ultrapasse a população do país B:");
				 double popA = leitor.nextDouble();
				 double popB = leitor.nextDouble();
				 System.out.println();
				 System.out.println("Informe a porcentagem do país A e em seguida, do país B:");
				 double percA = leitor.nextInt();
				 double percB = leitor.nextInt();
				 
				 while(popA < popB) {
					 popA += (popA/100) * percA; 
					 popB += (popB/100) * percB;
					 contador++;
				 }
				 
				 System.out.println("Quantidade de anos para que a população A ultrapasse a população B é de " + contador + " anos");
				 
				  leitor.close();
		
	/*	int Apop = 80000;
		int Bpop = 200000;
		int contador = 0;
		
		while(Apop < Bpop) {
			Apop += (Bpop/100) * 3;
			Bpop += (Bpop/100) * 1.5;
			contador++;
		}
		
		System.out.println("Quantidade de anos para que a população A ultrapasse a população B é de " + contador + " anos"); */

	}

}
