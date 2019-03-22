import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasDoRio = LocalDate.of(2039, Month.JUNE, 5);
        int anos = olimpiadasDoRio.getYear() - hoje.getYear();

        Period periodo = Period.between(hoje, olimpiadasDoRio);
        System.out.println(periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadasDoRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorHoras));

        LocalTime intervalo = LocalTime.of(15,30);
    }
}
