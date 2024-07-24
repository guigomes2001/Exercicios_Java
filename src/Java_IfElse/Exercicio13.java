package Java_IfElse;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
    	
    	//Leitor básico de datas em java 

        Scanner leitor = new Scanner(System.in);

  
        boolean reiniciar = true;
        
        while(reiniciar) {
        	
        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = leitor.nextLine();

        if (validarData(data)) {
            System.out.println("A data " + data + " é válida.");
        } else {
            System.out.println("A data " + data + " é inválida.");
        }

    }
        leitor.close();
    }

    public static boolean validarData(String data) {
        String[] partes = data.split("/");
        if (partes.length != 3) {
            return false;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else {
            return dia <= 31;
        }
    }
}
