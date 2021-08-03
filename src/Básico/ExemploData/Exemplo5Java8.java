package Básico.Encapsulamento.ExemploData;
import java.time.LocalDateTime;

public class Exemplo5Java8 {
    public static void main(String[] args){

    LocalDateTime agora = LocalDateTime.now();
    System.out.println(agora);

    LocalDateTime depois = agora.plusHours(1).plusDays(1).plusMonths(1).plusYears(1);
    System.out.println(depois);

    }
}
