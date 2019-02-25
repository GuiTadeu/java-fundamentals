package br.com.caelum.bytebank.models;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
