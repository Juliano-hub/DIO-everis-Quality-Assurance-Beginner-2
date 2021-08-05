package Avançado.Paradigma;

public class Exemplo4 {
    public static void main(String[] args){
        Funcao1 funcao1 = valor ->{
            return valor;
        };
        funcao1.gerar("Al");
    }
}

interface Funcao1{
    String gerar(String valor);
}