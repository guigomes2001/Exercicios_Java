package Java_OrientacaoAobjetos;

public class Exercicio12_Circulo extends Exercicio12_Figura2D implements Exercicio12_DimensaoSuperficial {

	private double raio;

	public Exercicio12_Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {

		return 4 * Math.PI * raio * raio;
	}

	@Override
	public double calcularVolume() {
		return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
	}

}
