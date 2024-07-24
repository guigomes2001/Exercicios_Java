package Java_OrientacaoAobjeto;

public class Exercicio13_Agenda {

    private Exercicio13_Contato[] contatos;

    public Exercicio13_Agenda() {
        contatos = new Exercicio13_Contato[5];
    }

    public void adicionarContato(Exercicio13_Contato c) throws Exercicio13_AgendaCheiaException {

        boolean cheia = true;

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break; 
            }
        }

        if (cheia) {
            throw new Exercicio13_AgendaCheiaException();
        }
    }

    public int consultaContatoPorNome(String nome) throws Exercicio13_ContatoNaoExiste {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }

        throw new Exercicio13_ContatoNaoExiste(nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Exercicio13_Contato c : contatos) {
            if (c != null) {
                sb.append(c.toString()).append("\n");
            }
        }

        return sb.toString();
    }

    public Exercicio13_Contato[] getContatos() {
        return contatos;
    }
}
