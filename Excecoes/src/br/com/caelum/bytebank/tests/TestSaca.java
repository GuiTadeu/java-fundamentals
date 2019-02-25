package br.com.caelum.bytebank.tests;

import br.com.caelum.bytebank.models.Conta;
import br.com.caelum.bytebank.models.ContaCorrente;
import br.com.caelum.bytebank.models.SaldoInsuficienteException;

public class TestSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200);

        try {
            conta.saca(210);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(conta.getSaldo());

    }
}
