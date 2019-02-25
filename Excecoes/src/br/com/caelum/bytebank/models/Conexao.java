package br.com.caelum.bytebank.models;

public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo conexao");
    }

    public void leDados(){
        System.out.println("Recebendo dados");
    }

    @Override
    public void close(){
        System.out.println("Fechando conexao");
    }
}
