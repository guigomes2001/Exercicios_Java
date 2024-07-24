package Java_Eclipse_Exercicios;

public class Exercicio08_Agenda {

	private String nome;
	private Exercicio08_Contato[] contatos;
	
	public Exercicio08_Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Exercicio08_Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String obterInfo() {
		String info = "Nome: " + nome + "\n";
		
		if(contatos != null) {
			for(Exercicio08_Contato c : contatos) {
				info  = c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
}