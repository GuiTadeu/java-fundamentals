package br.com.caelum.bytebank.tests;

import br.com.caelum.bytebank.models.Conexao;

public class TestConexao {

    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException e){
            System.out.println("Deu erro na conexao");
        }
    }

}
