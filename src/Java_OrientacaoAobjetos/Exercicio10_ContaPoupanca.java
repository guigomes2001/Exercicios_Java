package Java_OrientaçãoAobjetos;

import java.util.Calendar;

public class Exercicio10_ContaPoupanca extends Exercicio10_ContaBancaria {
    
    private int diaRendimento;
    
    public Exercicio10_ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public int getDiaRendimento() {
        return diaRendimento;
    }
    
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        if (diaRendimento == diaAtual) {
            double novoSaldo = getSaldo() + (getSaldo() * taxaRendimento / 100);
            setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String s = "Conta Poupança\n";
        s += "Dia de rendimento: " + diaRendimento + "\n";
        s += super.toString();
        return s;
    }
}
