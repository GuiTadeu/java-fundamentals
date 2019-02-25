package br.com.caelum.bytebank.tests;

import br.com.caelum.bytebank.models.CalculadorDeImposto;
import br.com.caelum.bytebank.models.ContaCorrente;
import br.com.caelum.bytebank.models.SeguroDeVida;

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
