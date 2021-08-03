package Básico.Encapsulamento.ExemploData;
import java.time.LocalDate;
public class Exemplo4Java8 {
    public static void main(String[] args){
        LocalDate agora = LocalDate.now();

        LocalDate ontem = agora.minusDays(1);
        // ontem é agora - 1 dia

        System.out.println("Hoje: " + agora);
        System.out.println("Ontem: " + ontem);
    }
}
