package Avançado.InterfaceFuncional;
import java.util.function.Predicate;

public class Exemplo4 {
    public static void main(String[] args){
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test("") );
        System.out.println(estaVazio.test("AA") );
    }
}
