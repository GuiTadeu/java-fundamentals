package br.com.caelum.test;

import java.io.*;

public class TestEscrita {
    public static void main(String[] args) throws IOException{
        OutputStream fos = new FileOutputStream("../lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Lorem teste Caelum");
        bw.newLine();
        bw.newLine();
        bw.write("TESTE LINHA 5");
        bw.close();
    }
}
