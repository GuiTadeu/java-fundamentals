import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura");
        palavras.add("Casa do Código");
        palavras.add("Caelum");

        // palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        palavras.sort(Comparator.comparing(s -> s.length()));

        // Outra forma
        palavras.sort(Comparator.comparing(String::length));

        // Com método estatico
        palavras.sort(comparing(String::length));

        palavras.forEach(System.out::println);
    }
}
