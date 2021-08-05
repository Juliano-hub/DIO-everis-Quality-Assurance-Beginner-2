package Avançado.InterfaceFuncional;

public class Exemplo2 {
    public static void main(String[] args){
        Calc soma = (a, b) -> a + b;
        Calc sub = (a, b) -> a - b;
        Calc div = (a, b) -> a / b;
        Calc mult = (a, b) -> a * b;

        System.out.println(executarOperacao(soma,1,4));
        System.out.println(executarOperacao(sub,1,4));
        System.out.println(executarOperacao(div,1,4));
        System.out.println(executarOperacao(mult,1,4));
    }

    // função de alta ordem, recebe outra função como parâmetro
    public static int executarOperacao(Calc FuncSoma, int a, int b){
        return FuncSoma.Funcao(a,b);
    }
}

interface Calc{
    public int Funcao(int a, int b);
}
