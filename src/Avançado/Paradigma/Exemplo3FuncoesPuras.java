package Avançado.Paradigma;

import java.util.function.BiPredicate;

public class Exemplo3FuncoesPuras {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificarSeEhMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEhMaior.test(2, 1));
        System.out.println(verificarSeEhMaior.test(1, 2));
        System.out.println(verificarSeEhMaior.test(2, 1));
    }
}
