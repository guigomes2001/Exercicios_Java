package Java_OrientacaoAobjeto;

import java.util.Scanner;

public class Exercicio13_Teste {

    private static String nomeContato;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Exercicio13_Agenda agenda = new Exercicio13_Agenda();

        int opcao = obterOpcaoMenu(leitor);

        while (opcao != 3) {

            if (opcao == 1) {
                nomeContato = lerInformacao(leitor, "Informe o nome do contato para pesquisa: ");
                consultarContato(leitor, agenda);
            } else if (opcao == 2) {
                adicionarContato(leitor, agenda);
            }

            opcao = obterOpcaoMenu(leitor); 
        }

        leitor.close();
    }

    public static void adicionarContato(Scanner leitor, Exercicio13_Agenda agenda) {

        try {

            System.out.println("Informe os dados do contato:" + "\n");
            String nome = lerInformacao(leitor, "Informe o nome do contato:");
            String telefone = lerInformacao(leitor, "Informe o número de contato: ");
            String email = lerInformacao(leitor, "Informe o e-mail de contato: ");

            Exercicio13_Contato contato = new Exercicio13_Contato();

            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Dados do contato a ser criado: ");
            System.out.println(contato.toString());

            agenda.adicionarContato(contato);

        } catch (Exercicio13_AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda:");
            System.out.println(agenda.toString());
        }
    }

    public static void consultarContato(Scanner leitor, Exercicio13_Agenda agenda) {
        try {
            int indice = agenda.consultaContatoPorNome(nomeContato);
            System.out.println("Contato encontrado:");
            System.out.println(agenda.getContatos()[indice].toString());
        } catch (Exercicio13_ContatoNaoExiste e) {
            System.out.println(e.getMessage());
        }
    }


    public static String lerInformacao(Scanner leitor, String mensagem) {
        System.out.println(mensagem);
        String entrada = leitor.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner leitor) {

        boolean opcaoValida = false;
        int opcao = 0;

        while (!opcaoValida) {

            System.out.println("Digite a opção desejada: " + "\n");
            System.out.println("1 - Consultar contato da agenda ");
            System.out.println("2 - Adicionar contato na agenda ");
            System.out.println("3 - Sair");

            try {
                opcao = leitor.nextInt();
                leitor.nextLine(); 

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    opcaoValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Digite uma opção válida! Digite novamente:" + "\n");
                leitor.nextLine(); 
            }
        }
        return opcao;
    }
}
