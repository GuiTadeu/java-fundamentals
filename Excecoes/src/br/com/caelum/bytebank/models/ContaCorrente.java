package br.com.caelum.bytebank.models;

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
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }
}
