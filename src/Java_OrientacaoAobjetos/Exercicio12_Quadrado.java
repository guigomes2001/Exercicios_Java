package Java_OrientacaoAobjetos;

public class Exercicio12_Quadrado extends Exercicio12_Figura2D implements Exercicio12_DimensaoSuperficial {

	private double lado;

	public Exercicio12_Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularVolume() {
		return 0.0; // Quadrado não é aplicável esse método
	}

}
