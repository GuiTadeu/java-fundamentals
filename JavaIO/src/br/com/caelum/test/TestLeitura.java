package br.com.caelum.test;

import java.io.*;

public class TestLeitura {

    public static void main(String[] args) throws IOException {

        // Criando o fluxo completo com o arquivo - binario
        FileInputStream fis = new FileInputStream("../lorem.txt");

        // Melhorando os dados binarios para caracteres
        InputStreamReader isr = new InputStreamReader(fis);

        // Guarda os caracteres de uma linha
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }



        // Fecha o fluxo, tambem fecha o fis e isr
        br.close();
    }
}
