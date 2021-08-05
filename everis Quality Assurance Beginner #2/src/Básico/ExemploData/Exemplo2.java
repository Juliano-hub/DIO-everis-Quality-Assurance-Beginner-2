package Básico.Encapsulamento.ExemploData;
import java.util.Calendar;

public class Exemplo2 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        System.out.println("Data atual: " + agora.getTime());

        agora.add(Calendar.DATE, -10);
        System.out.println("10 dias atrás: " + agora.getTime());

        agora.getInstance();
        //para pegar a data atual novamente e não a desatualizada
        agora.add(Calendar.MONTH, -10);
        System.out.println("10 mesês atrás: " + agora.getTime());

        agora.getInstance();
        //para pegar a data atual novamente e não a desatualizada
        agora.add(Calendar.YEAR, -10);
        System.out.println("10 anos atrás: " + agora.getTime());
    }
}
