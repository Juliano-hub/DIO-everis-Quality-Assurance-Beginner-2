package Avançado.InterfaceFuncional;
import java.util.function.Consumer;

public class Exemplo3 {
    public static void main(String[] args){

        //Consumer<String> imprimirUmaFrase = System.out::println;
        //ambas funcionam
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);


        imprimirUmaFrase.accept("Hello World");
    }
}
