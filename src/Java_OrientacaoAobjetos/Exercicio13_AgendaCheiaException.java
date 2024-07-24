package Java_OrientacaoAobjeto;

public class Exercicio13_AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Agenda está cheia";
	}
}
