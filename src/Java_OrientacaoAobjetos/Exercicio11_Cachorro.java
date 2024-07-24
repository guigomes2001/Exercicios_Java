package Java_OrientacaoAobjetos;

public class Exercicio11_Cachorro extends Exercicio11_Mamifero
		implements Exercicio11_AnimalDomesticado, Exercicio11_AnimalEstimacao {

	private String raça;
	private String tamanho;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void brincar() {
		// implementação específica para cachorro
	}

	@Override
	public void levarPassear() {
		// implementação específica para cachorro
	}
}
