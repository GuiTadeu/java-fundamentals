package br.com.bytebank.models;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    public ContaCorrente(int agencia, int numero){
        // Chamar o construtor da classe mae
        // Heranca nao traz o construtor
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }
}
