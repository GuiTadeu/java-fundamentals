package br.com.bytebank.tests;

import br.com.bytebank.models.CalculadorDeImposto;
import br.com.bytebank.models.ContaCorrente;
import br.com.bytebank.models.SeguroDeVida;

public class TestTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }

}
