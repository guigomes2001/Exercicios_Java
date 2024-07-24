package Java_OrientacaoAobjetos;

public abstract class Exercicio12_FiguraGeometrica {

	private String nome;
	private String cor;
	
	 public abstract double calcularArea();
	 public abstract double calcularVolume();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
