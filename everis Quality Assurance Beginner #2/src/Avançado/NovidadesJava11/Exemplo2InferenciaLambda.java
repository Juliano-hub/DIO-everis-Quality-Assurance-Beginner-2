package Avançado.NovidadesJava11;

import java.util.function.Function;

public class Exemplo2InferenciaLambda {
    public static void main(String[] args) {

        Function<Integer, Integer> MultPor2 = (var numero) -> numero * 2;

        System.out.println( MultPor2.apply(5) );

    }
}
