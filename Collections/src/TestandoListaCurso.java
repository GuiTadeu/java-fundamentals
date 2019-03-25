import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));


        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasMutaveis);

        System.out.println(aulasMutaveis);
        System.out.println(javaColecoes.getTempoTotal());


    }
}
