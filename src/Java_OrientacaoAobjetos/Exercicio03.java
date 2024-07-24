package Java_OrientacaoAobjetos;

public class Exercicio03 {
	
	//Programa com utilização de atribuições privadas, encapsulamentos e construtor

	//Atribuições declaradas como "private" 
	private String tipo;
	private String cor;
	private String marca;
	private boolean ligada;
	private byte valor;
	
	//Construtor 
	public Exercicio03(String tipo, String cor, String marca, boolean ligada, byte valor) {
		this.tipo = tipo;
		this.cor = cor;
		this.marca = marca;
		this.ligada = ligada;
		this.valor = valor;

	}

	//Encapsulamentos
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public byte getValor() {
		return valor;
	}
	public void setValor(byte valor) {
		this.valor = valor;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void estadoLampada() {

		if (ligada) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lâmpada está desligada");
		}
	}
}








































