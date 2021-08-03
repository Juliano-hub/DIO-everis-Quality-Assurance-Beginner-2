package Avançado.Paradigma;

import java.util.function.UnaryOperator;

public class Exemplo1Imutabilidade {
    public static void main(String[] args){
        UnaryOperator<Integer> calcularValorVezesdez = valor -> valor * 10;
        // paradigma funcional
        // declara como o código deve se comportar antes de executar

        int valor = 2;
        System.out.println("Valor original: " + valor);
        System.out.println("O resultado passando pela lambda é: " + calcularValorVezesdez.apply(valor) ); // 20
        System.out.println("O valor ORIGINAL deve permanecer o mesmo após a aplicação: " + valor); // 2
    }
}
