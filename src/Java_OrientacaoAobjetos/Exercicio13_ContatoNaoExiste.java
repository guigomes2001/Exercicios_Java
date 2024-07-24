package Java_OrientacaoAobjeto;

public class Exercicio13_ContatoNaoExiste extends Exception {

    private String nomeContato;

    public Exercicio13_ContatoNaoExiste(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato '" + nomeContato + "' não existe na agenda";
    }
}
