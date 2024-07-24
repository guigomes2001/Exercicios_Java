package Java_OrientaçãoAobjetos;

import java.util.Scanner;

public class Exercicio10_Teste {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
                
        System.out.println("===== Teste conta bancária =====\n");
        System.out.println("Informe seu nome completo: ");
        String nome = leitor.nextLine();
        System.out.println("Informe o número da conta: ");
        String conta = leitor.nextLine();
        
        Exercicio10_ContaBancaria contaSimples = new Exercicio10_ContaBancaria(nome, conta, 1500);
                
        System.out.println("- Sacar (Digite 1)\n- Depositar (Digite 2)");
        int escolha = leitor.nextInt();
        
        if (escolha == 1) {
            System.out.println("Informe o valor de saque: ");
            double valorSaque = leitor.nextDouble();
            
            if (contaSimples.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso! Saldo atualizado: " + contaSimples.getSaldo() + "\n");
            } else {
                System.out.println("Saldo insuficiente para o saque.\n");
            }
        } else if (escolha == 2) {
            System.out.println("Informe o valor do depósito: ");
            double deposito = leitor.nextDouble();
            contaSimples.depositar(deposito);
            
            System.out.println("Depósito realizado com sucesso! Saldo atualizado: " + contaSimples.getSaldo() + "\n");
        }

        System.out.println("Informe o dia do mês para rendimento: ");
        int diaRendimento = leitor.nextInt();
        
        Exercicio10_ContaPoupanca contaPoupanca = new Exercicio10_ContaPoupanca(nome, conta, 1500, diaRendimento);
        
        System.out.println("Informe a taxa de rendimento (%): ");
        double taxaRendimento = leitor.nextDouble();
        
        if (contaPoupanca.calcularNovoSaldo(taxaRendimento)) {
            System.out.println("Rendimento aplicado! Saldo atualizado: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Rendimento não aplicado. Hoje não é o dia de rendimento.");
        }
        
        leitor.close();
    }
}
