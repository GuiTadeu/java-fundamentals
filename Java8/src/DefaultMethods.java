import java.util.*;
import java.util.function.Consumer;

public class DefaultMethods {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura");
        palavras.add("Casa do Código");
        palavras.add("Caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        //Collections.sort(palavras, comparador);
        palavras.sort(comparador);

        System.out.println(palavras);

        //for(String p : palavras){
        //    System.out.println(p);
        //}
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String o1, String o2){
        if(o1.length() < o2.length())
            return -1;
        if(o1.length() > o2.length())
            return 1;
        return 0;
    }
}
