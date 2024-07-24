package Java_Arrays;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Obtendo a cotação do dólar em relação ao real
        System.out.print("Digite a cotação do dólar em relação ao real (ex: 5.50): ");
        double cotacaoDolar = leitor.nextDouble();

        // Criando o vetor para armazenar as conversões
        double[] vetorConversoes = new double[20];

        // Calculando e armazenando as conversões
        for (int i = 0; i < vetorConversoes.length; i++) {
            vetorConversoes[i] = cotacaoDolar * (i + 1);
        }

        // Exibindo as conversões
        System.out.println("Conversões de dólar para real:");
        for (int i = 0; i < vetorConversoes.length; i++) {
            System.out.printf("Conversão %d: %.2f\n", i + 1, vetorConversoes[i]);
        }

        leitor.close();
    }
}
