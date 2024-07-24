package Java_OrientacaoAobjetos;

public class Exercicio07_01_Teste {

	public static void main(String[] args) {
		
		//Programa básico - Relacionamento tem um
		
		Exercicio07_01 Ex07_01 = new Exercicio07_01();

		Ex07_01.setNome("Guilherme");
	//	Ex07_01.setPaís("Brasil");
	//	Ex07_01.setNumero("61 99999-9999");

		Exercicio07_01_País Ex07_01_País = new Exercicio07_01_País();
		
		Ex07_01_País.setRegiao("Centro-Oeste");
		Ex07_01_País.setEstado("Distrito Federal");
		Ex07_01_País.setCep("11111111");
		Ex07_01_País.setRua("Rua Laugh Tale");
		
		System.out.println("Nome: " + Ex07_01.getNome() + "\n");
		System.out.println("Endereço: " + "\n");
		System.out.println(Ex07_01_País.getRegiao());
		System.out.println(Ex07_01_País.getEstado());
		System.out.println(Ex07_01_País.getCep());
		System.out.println(Ex07_01_País.getRua() + "\n");
		
		if(Ex07_01_País != null && Ex07_01.getPaís() != null) {
			System.out.println(Ex07_01.getPaís().getRegiao());
			System.out.println(Ex07_01.getPaís().getEstado());
			System.out.println(Ex07_01.getPaís().getCep());
			System.out.println(Ex07_01.getPaís().getRua());
		}
		
		Exercicio07_01_Telefone Ex07_01_Telefone = new Exercicio07_01_Telefone();
		
		Ex07_01_Telefone.setDdd("61");
		Ex07_01_Telefone.setOperadora("Operator");
		Ex07_01_Telefone.setTipo("Celular");
		
		System.out.println("Seu DDD: " + Ex07_01_Telefone.getDdd());
		System.out.println("Sua operadora: " + Ex07_01_Telefone.getOperadora());
		System.out.println("Tipo: " + Ex07_01_Telefone.getTipo());
		
		if(Ex07_01_Telefone != null && Ex07_01.getNumero() != null) {
			System.out.println(Ex07_01.getNumero().getDdd());
			System.out.println(Ex07_01.getNumero().getOperadora());
			System.out.println(Ex07_01.getNumero().getTipo());
		}

	}
}











