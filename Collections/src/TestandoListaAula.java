import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 16);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas);

        // Forma 01
        Collections.sort(aulas, Comparator.comparing(
                Aula::getTempo
        ));


        // Forma 02
        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);


    }
}
