package Java_OrientacaoAobjetos;

public class Exercicio04_Aplicando {
	
	// Método estático para imprimir o valor atual do contador
	
	static void imprimirValor() {
		System.out.println(Exercicio04_Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
	
		Exercicio04_Contador.incrementar();
		imprimirValor();

		// Aqui, zera o contador
		Exercicio04_Contador.zerar();
		imprimirValor();
		
		Exercicio04_Contador.incrementar();
		Exercicio04_Contador.incrementar();
		Exercicio04_Contador.incrementar();
		Exercicio04_Contador.incrementar();
		Exercicio04_Contador.incrementar();
		imprimirValor();
	}
}
