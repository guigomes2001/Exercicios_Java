package Java_IfElse;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Leitor básico com If-Else e loop While (Loop em resposta divergente do solicitado)
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu sexo com 'F' para feminino, 'M' para masculino ou 'NI' para não informar:");
		String sexo = leitor.nextLine();
		
		if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Ni")) {
			System.out.println("Informação registrada com sucesso");
		} else if(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("Ni")) {
			
			while(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("Ni")) {
				System.out.println("Reposta não está de acordo com o enunciado!!!");
				System.out.println("Informe seu sexo novamente com 'F' para feminino, 'M' para masculino ou 'NI' para não informar:");
				sexo = leitor.nextLine();
				
				if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Ni")) {
					System.out.println("Informação registrada com sucesso");
				}
			} 
		}
		
		leitor.close();

	}

}
