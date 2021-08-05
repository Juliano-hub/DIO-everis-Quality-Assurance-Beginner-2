package Avançado.NovidadesJava10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class Exemplo1 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://docs.oracle.com/javase/10/language/toc.htm");
        URLConnection urlConnection = url.openConnection();
        // abrir a conexão com a URL

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        // com o InputStream pega os dados(bytes) da página, pega o fluxo de dados e coloca no InputStream
        // InputStreamReader converte para poder usar BufferedReader
        // BufferedReader separa em linhas a Stream que foi pega pelo Input

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", "\n"));
        // collectors join pega todas as linhas e transforma em um única string
        // usa o replace para quebrara a linha
    }

}
