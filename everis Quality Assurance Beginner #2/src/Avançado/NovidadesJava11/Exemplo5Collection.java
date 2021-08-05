package Avançado.NovidadesJava11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Exemplo5Collection {
    public static void main(String[] args) {

        //List<String> nomes = Arrays.asList("Joao", "Paulo", "Max");
        //Collection<String> nomes = List.of("Joao", "Paulo", "Max");
        Collection<String> nomes = Set.of("Joao", "Paulo", "Max");
        // set não pode repitir objeto na lista


        System.out.println(nomes);
    }
}
