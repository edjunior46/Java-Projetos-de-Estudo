
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {

        //Instanciação
        //Data local (sem horas)
        LocalDate data01 = LocalDate.now();
        
        //Data-hora local (com horas)
        LocalDateTime data02 = LocalDateTime.now();

        //Data-hora global (Z Time)
        Instant data03 = Instant.now();

        //Transformar Texto ISO 8601 em objeto Data-hora (sem horas)
        LocalDate data04 = LocalDate.parse("2003-12-02");

        //Transformar Texto ISO 8601 em objeto Data-hora (com horas)
        LocalDateTime data05 = LocalDateTime.parse("2018-02-22T10:13:52");

        //Transformar Texto ISO 8601 em objeto Data-hora Z Time
        Instant data06 = Instant.parse("2023-02-22T13:52:07Z");

        //Transformar Data-hora local em Z Time
        Instant data07 = Instant.parse("2023-02-22T23:52:07-03:00");

        //Texto customizado em Data-hora (DateTimeFormater)
        LocalDate data08 = LocalDate.parse("02/12/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        //Texto customizado em Data-hora (DateTimeFormater) com horas
        LocalDateTime data09 = LocalDateTime.parse("22/02/2023 10:13", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        //Ano, mes, dia [hora opcional] em objeto Data-Hora
        LocalDate data10 = LocalDate.of(2003, 12, 02);
        LocalDateTime data11 = LocalDateTime.of(2023, 02, 22, 10, 30);


        //Formatação
        //Obj Data-Hora  em formato customizado
        LocalDate data12 = LocalDate.parse("2003-12-02");

        //Obj Data-Hora global em formato customizado
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant data13 = Instant.parse("2023-12-25T13:25:23Z");

        //Convertendo Data-Hora global para local
        LocalDate data14 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
        LocalDate data15 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));

        //Obtendo dados de uma Data-Hora
        int data16 = data02.getDayOfMonth();
        int data18 = data02.getDayOfYear();
        int data19 = data02.getYear();
        //etc

        //Calculos com data e hora
        //Objetos Data-Hora sao imutaveis, portanto tenho que gerar um novo obj
        //Funciona tambem com LocalDateTime
        LocalDate semanaPassada = data01.minusWeeks(1);
        LocalDate proximaSemana = data01.plusWeeks(1);
        LocalDate tresMesesAtras = data01.minusMonths(3);
        LocalDate daquiCincoDias = data01.plusDays(5);

        //com Instant
        Instant duasSemanasAtras = data03.minus(14, ChronoUnit.DAYS);
        Instant daquiTresDias = data03.plus(3, ChronoUnit.DAYS);

        //Duracao
        Duration data20 = Duration.between(data05, data02);
        //nao é possivel calcular a duracao de tempo entre dois LocalDate ou Instant, 
        //apenas com LocalDateTime. Para isso, devo converter ou usar Period
        Period data21 = Period.between(data04, data01);

        //ou seja = Diferenca de tempo entre segundos, horas, minutos ou dias => Duration
        // medidas maiores que essas => Period

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println(data10);
        System.out.println(data11);
        System.out.println(data12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(formato01.format(data13));
        System.out.println(data14);
        System.out.println(data15);
        System.out.println(data16 + " " + data18 + " " + data19);
        System.out.println(proximaSemana);
        System.out.println(semanaPassada);
        System.out.println(daquiCincoDias);
        System.out.println(tresMesesAtras);
        System.out.println(duasSemanasAtras);
        System.out.println(daquiTresDias);
        System.out.println(data20.toDays());
        System.out.println(data21.getYears());

    }
}
