package Avançado.Paradigma;
import java.util.Arrays;

public class Exemplo2ComposicaoDeFuncoes {
    public static void main(String[] args){
        int[] vetor = {1,2,3,4};

        // paradigma Funcional
        Arrays.stream(vetor)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        /* paradigma Imperativo
        for(int i = 0; i < vetor.length; i++){
            int valor = 0;
            if(vetor[i] % 2 == 0){
                valor = vetor[i] * 2;

                if(valor != 0){
                    System.out.println(valor);
                }
            }
        }
        */

    }
}
