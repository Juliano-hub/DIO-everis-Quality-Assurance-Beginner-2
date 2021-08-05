package Avançado.InterfaceFuncional;

public class Exemplo1FuncaoAltaOrdem {
    public static void main(String[] args){
        Calcular soma = (a, b) -> a + b;

        System.out.println(executarOperacao(soma,1,4));
    }

    // função de alta ordem, recebe outra função como parâmetro
    public static int executarOperacao(Calcular FuncSoma, int a, int b){
        return FuncSoma.somar(a,b);
    }
}

interface Calcular{
    public int somar(int a, int b);
}
