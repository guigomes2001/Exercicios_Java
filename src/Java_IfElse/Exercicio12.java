package Java_IfElse;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
    	
    	//Programa de classificação de suspeita ramificando If com método de comparação
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as seguintes perguntas com 'Sim' ou 'Não':");
        System.out.println();

        System.out.println("Telefonou para a vítima?");
        String telefonou = scanner.nextLine().toLowerCase();
        System.out.println("Esteve no local do crime?");
        String esteveNoLocal = scanner.nextLine().toLowerCase();
        System.out.println("Devia para a vítima?");
        String devia = scanner.nextLine().toLowerCase();
        System.out.println("Já trabalhou para a vítima?");
        String trabalhou = scanner.nextLine().toLowerCase();
        System.out.println("Mora perto da vítima?");
        String moraPerto = scanner.nextLine().toLowerCase();

        int respostasPositivas = 0;
        
        if (telefonou.equalsIgnoreCase("sim")) respostasPositivas++;
        if (esteveNoLocal.equalsIgnoreCase("sim")) respostasPositivas++;
        if (devia.equalsIgnoreCase("sim")) respostasPositivas++;
        if (trabalhou.equalsIgnoreCase("sim")) respostasPositivas++;
        if (moraPerto.equalsIgnoreCase("sim")) respostasPositivas++;

        String classificacao;
        
        if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (respostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        System.out.println();
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
