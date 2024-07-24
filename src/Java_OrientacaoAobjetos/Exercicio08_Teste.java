package Java_Eclipse_Exercicios;

import java.util.Scanner;

public class Exercicio08_Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
				
		System.out.println("Informe o nome da agenda: ");
		String nome = leitor.nextLine();
		
		Exercicio08_Agenda agenda = new Exercicio08_Agenda();
		agenda.setNome(nome);
		
		Exercicio08_Contato[] contatos = new Exercicio08_Contato[3];
		
		for(int i=0; i<3; i++) {
			
			Exercicio08_Contato c = new Exercicio08_Contato();
			
			System.out.println("Digite o nome do(a) evento/pessoa: " + (i+0));
			nome = leitor.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o telefone de contato: ");
			String telefone = leitor.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o e-mail de contato: ");
			String email = leitor.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
				System.out.println(agenda.obterInfo());
		}
		
		leitor.close();
	}
}
