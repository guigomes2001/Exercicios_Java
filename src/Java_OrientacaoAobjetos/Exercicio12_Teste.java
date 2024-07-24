package Java_OrientacaoAobjetos;

public class Exercicio12_Teste {

    public static void main(String[] args) {

        Exercicio12_FiguraGeometrica[] figuras = new Exercicio12_FiguraGeometrica[3];

        figuras[0] = new Exercicio12_Circulo(2.0);
        figuras[1] = new Exercicio12_Quadrado(3.0);
        figuras[2] = new Exercicio12_Triangulo();

        for (Exercicio12_FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());

            if (figura instanceof Exercicio12_DimensaoSuperficial) {
                Exercicio12_DimensaoSuperficial figura2D = (Exercicio12_DimensaoSuperficial) figura;
                double volume = figura2D.calcularVolume();
                if (volume != 0.0) {
                    System.out.println("Volume: " + volume);
                } else {
                    System.out.println("Volume: Não aplicável");
                }
            } else {
                System.out.println("Volume: Não aplicável");
            }

            System.out.println();
        }
    }

}

