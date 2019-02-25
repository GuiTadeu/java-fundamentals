package br.com.caelum.bytebank.models;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
