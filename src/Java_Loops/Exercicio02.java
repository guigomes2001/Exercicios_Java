package Java_Loops;

import java.util.Scanner;

public class Exercicio02 {
	
	//Leitor básico para definição de login e senha

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Defina seu login: ");
        String login = leitor.nextLine();
        System.out.println();
        System.out.println("Defina sua senha: ");
        String passwrd = leitor.nextLine();
        System.out.println();

        while (login.equals(passwrd)) {
            System.out.println();
            System.out.println("Login e senha não podem ser iguais!!!");
            System.out.println();
            System.out.println("Defina seu login novamente: ");
            login = leitor.nextLine();
            System.out.println("Defina sua senha novamente: ");
            passwrd = leitor.nextLine();
        }

        System.out.println("Login e senha definidos com sucesso!");

        leitor.close();
    }

}
