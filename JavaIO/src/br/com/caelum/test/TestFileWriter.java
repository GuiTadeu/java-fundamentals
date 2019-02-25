package br.com.caelum.test;

import java.io.*;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Lorem Teste");
        bw.newLine();
        bw.newLine();
        bw.write("Teste Lorem");
    }
}
