import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Streams{
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java", 800));

        cursos.sort(
                Comparator.comparing(Curso::getAlunos)
        );

        //cursos.forEach(c -> System.out.println(c.getNome()));
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(c -> c.getAlunos());

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny();

    }

}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}