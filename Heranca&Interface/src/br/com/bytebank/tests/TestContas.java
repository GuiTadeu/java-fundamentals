package br.com.bytebank.tests;

import br.com.bytebank.models.ContaCorrente;
import br.com.bytebank.models.ContaPoupanca;

public class TestContas {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 987);
        cc.deposita(20);

        ContaPoupanca cp = new ContaPoupanca(234, 456);
        cp.deposita(400);

        cc.transfere(10, cp);

        System.out.println();

    }
}
