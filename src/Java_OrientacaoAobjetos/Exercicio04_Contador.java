package Java_OrientacaoAobjetos;

public class Exercicio04_Contador {
	
	private static int cont;

	public static void incrementar() {
		cont++;
	}

	public static void zerar() {
		cont = 0;
	}

	public static int obterValor() {
		return cont;
	}
}

