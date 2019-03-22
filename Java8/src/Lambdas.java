import java.util.ArrayList;
import java.util.List;


public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura");
        palavras.add("Casa do Código");
        palavras.add("Caelum");

        palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
