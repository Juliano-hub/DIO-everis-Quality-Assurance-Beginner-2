package Avançado.NovidadesJava11;

public class Exemplo3StringVazia {
    public static void main(String[] args) {
        var vazio = "";
        var espaco = " ";

        System.out.println("É vazio?:" + vazio.isBlank() );
        System.out.println("É vazio?:" + espaco.isBlank() );
    }
}
