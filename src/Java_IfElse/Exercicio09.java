package Java_IfElse;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
    	
    	//Leitor básico com retorno de saudação conforme período do dia
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu turno de trabalho para que o programa retorne a saudação de acordo ('M' para matutino - 'V' para vespertino - 'N' para noturno): ");
        String turno = leitor.nextLine();
        
        char m = 'M';
        char v = 'V';
        char n = 'N';
        
        if(turno.equalsIgnoreCase(String.valueOf(m))) {
            System.out.println("Bom dia");
        } else if(turno.equalsIgnoreCase(String.valueOf(v))) {
            System.out.println("Boa tarde");
        } else if(turno.equalsIgnoreCase(String.valueOf(n))){
            System.out.println("Boa noite");
        }
        
        leitor.close();

    }

}
