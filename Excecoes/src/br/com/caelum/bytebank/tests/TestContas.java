package br.com.caelum.bytebank.tests;

import br.com.caelum.bytebank.models.ContaCorrente;
import br.com.caelum.bytebank.models.ContaPoupanca;
import br.com.caelum.bytebank.models.SaldoInsuficienteException;

public class TestContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 987);
        cc.deposita(20);

        ContaPoupanca cp = new ContaPoupanca(234, 456);
        cp.deposita(400);

        cc.transfere(10, cp);

        System.out.println();

    }
}
