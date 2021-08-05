package Avançado.InterfaceFuncional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo5 {
    public static void main(String[] args){
        String[] nomeVet = {"Silva", "Joao", "All", "Ami"};
        Integer[] numVet = {1,2,3,4,5};

        // busca pelo nome dado e coloca na var nova
        String nomeBusca = Stream.of(nomeVet).filter(nome -> nome.equals("Ami"))
                .collect(Collectors.joining());

        System.out.println(nomeBusca);

        System.out.println("Printando todo o vetor: ");
        Stream.of(nomeVet)
                .forEach(System.out::println);
                //o de cima é mais simples, mas ambos funcionam para imprimir
                //.forEach(nomeVet -> System.out.println(nomeVet));


                              // para realizar a mult precisou de outro nome
                              // p simbolizar a var
        Stream.of(numVet).map(numero -> numero * 2)
                .forEach(System.out::println);

    }
}
