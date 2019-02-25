package br.com.caelum.bytebank.models;

import br.com.caelum.pilha.MinhaExcecao;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // Atributo da Classe, não do objeto
    private static int total;

    public Conta(){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
    }

    public Conta(int agencia, int numero){

    }

    public void deposita (double valor) throws MinhaExcecao {

    };

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("" +
                    "Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("DEU RUIM");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("DEU RUIM!");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}

