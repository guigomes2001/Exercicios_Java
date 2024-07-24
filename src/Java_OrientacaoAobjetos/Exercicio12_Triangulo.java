package Java_OrientacaoAobjetos;

public class Exercicio12_Triangulo extends Exercicio12_Figura2D implements Exercicio12_DimensaoSuperficial {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;

	}

	@Override
	public double calcularVolume() {
		return 0.0; // Triângulo não é aplicável esse método
	}

}
