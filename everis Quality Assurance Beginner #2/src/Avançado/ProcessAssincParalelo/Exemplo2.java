package Avançado.ProcessAssincParalelo;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args){

    long inicio = System.currentTimeMillis();
    IntStream.range(1, 100).forEach(num -> fatorial(num) );
    long fim = System.currentTimeMillis();
    System.out.println("Tempo Serial: " + (fim - inicio) );

    inicio = System.currentTimeMillis();
    IntStream.range(1, 100).parallel().forEach(num -> fatorial(num) );
    fim = System.currentTimeMillis();
    System.out.println("Tempo Parallel: " + (fim - inicio) );

    // printar os nomes em paralelo(acaba printando em ordem diferentes)/
        // Assinc
    List<String> nomes = Arrays.asList("Joao", "Paulo", "Max", "Migue");

    }

    public static long fatorial(long num){
        long fat = 0;

        for(long i = 2; i<= num; i++){
            fat *= i;
        }
        return fat;
    }
}
