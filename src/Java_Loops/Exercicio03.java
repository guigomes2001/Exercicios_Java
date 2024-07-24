package Java_Loops;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Leitor básiico de dados pessoais 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Defina um nome com no mínimo 4 caracteres: ");
		String name = leitor.nextLine();
		
		while(name.length() < 4) {
			System.out.println("Nome informado não possui no mínimo 4 caracteres!!!");
			System.out.println("Defina um nome novamente com no mínimo 4 caracteres: ");
			name = leitor.nextLine();
		}
		
		System.out.println();
		System.out.println("Olá " + name + "! Bem-vindo(a)!");
		
		System.out.println("Informe sua idade (Entre 1 e 150 anos): ");
		double age = leitor.nextDouble();
		
		while(age <= 0 || age > 150) {
			System.out.println("Idade inválida!!!");
			System.out.println("Informe sua idade novamente (Entre 1 e 150 anos): ");
			age = leitor.nextDouble();
		}
		
		System.out.println(name + " você possui " + age + " anos!");
		System.out.println();
		
		System.out.println("Informe seu salário: ");
		double cash = leitor.nextDouble();
		
		while (cash <= 0) {
			System.out.println("Salário inválido!!!");
			System.out.println("Informe seu salário novamente: ");
			cash = leitor.nextDouble();
		}
		
		System.out.println("Seu nome é " + name + ", tem " + age + " anos e seu salário é de R$" + cash );
		System.out.println();
		
		System.out.println("Informe seu sexo com 'F' para feminino e 'M' para masculino: ");
		String sexo = leitor.next();
		
		while(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
			System.out.println("Sexo inválido!!!");
			System.out.println("Informe seu sexo novamente com 'F' para feminino e 'M' para masculino: ");
			sexo = leitor.nextLine();
		}
		
		System.out.println("Seu nome é " + name + ", tem " + age + " anos, seu salário é de R$" + cash + ", sexo " + sexo);
		System.out.println();
		
		System.out.println("Informe seu estado civil com 'S' para solteiro(a), 'C' casado(a), 'D' divorciado(a) ou 'V' viúvo(a) ");
		String estadoCivil = leitor.next();
		
		while(!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && !estadoCivil.equalsIgnoreCase("D") && !estadoCivil.equalsIgnoreCase("V")) {
			System.out.println("Estado civil inválido!!!");
			System.out.println("Informe seu estado civil novamente com 'S' para solteiro(a), 'C' casado(a), 'D' divorciado(a) ou 'V' viúvo(a) ");
			estadoCivil = leitor.nextLine();
		}
		
		System.out.println("Seu nome é " + name + ", tem " + age + " anos, seu salário é de R$" + cash + ", sexo " + sexo + ", estado civil " + estadoCivil);
		System.out.println();
		
		leitor.close();

	}

}
