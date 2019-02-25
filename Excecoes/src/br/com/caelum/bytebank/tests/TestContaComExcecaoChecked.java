package br.com.caelum.bytebank.tests;

import br.com.caelum.bytebank.models.ContaCorrente;
import br.com.caelum.pilha.MinhaExcecao;

public class TestContaComExcecaoChecked {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);

        try{
            cc.deposita(100);
        } catch(MinhaExcecao ex){
            System.out.println("Tratamento ...");
        }
    }

}
