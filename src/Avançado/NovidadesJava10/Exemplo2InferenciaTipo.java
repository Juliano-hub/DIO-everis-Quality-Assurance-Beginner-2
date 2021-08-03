// var não pode ser usado a nível de classe
// var não pode ser usado como parâmetro nos métodos e funções, assinatura
// var não pode ser usado em variáveis locais não inicializadar

// pode ser usado var iniciadas
// pode ser usado try catch
// pode ser usado for
// só pode ser usado em variáveis locais

package Avançado.NovidadesJava10;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.URL;
        import java.net.URLConnection;
        import java.util.stream.Collectors;

public class Exemplo2InferenciaTipo {
    public static void main(String[] args) throws IOException {

        juntarNome("AB", "aa");
        somar(5,5,5);
        conectarPrintarHTMl();

    }

    public static void juntarNome(String nome, String sobrenome){
        var nomeCompleto =  new StringBuilder();
        nomeCompleto.append(nome);
        nomeCompleto.append(" ");
        nomeCompleto.append(sobrenome);
        System.out.println("Olá " + nomeCompleto);
    }

    public static void somar(int... Valores) {
        //var somaAtual; não funciona, precisa ser iniciado, pois o var n permite
        var somaAtual = 0;

        for (var posicaoATUAL: Valores) {
            somaAtual += posicaoATUAL;
        }
        System.out.println("A soma é: " + somaAtual);
    }

    private static void conectarPrintarHTMl(){

        try{
            var url = new URL("https://docs.oracle.com/javase/10/language/toc.htm");
            var urlConnection = url.openConnection();
            // abrir a conexão com a URL

            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {

                // com o InputStream pega os dados(bytes) da página, pega o fluxo de dados e coloca no InputStream
                // InputStreamReader converte para poder usar BufferedReader
                // BufferedReader separa em linhas a Stream que foi pega pelo Input

                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", "\n"));
                // collectors join pega todas as linhas e transforma em um única string
                // usa o replace para quebrara a linha

            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}

