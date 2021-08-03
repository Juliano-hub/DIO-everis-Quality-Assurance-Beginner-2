package Básico.Encapsulamento.Vetor;

public class Exemplo1 {
    public static void main(String[] args){
        // declaração básica do java
        //int vetor = new in[7];
        int[] vetor = {1,2,3,4,5,6,7,8,9};

        vetor[0] = 0;

        for(int i=0; i< vetor.length; i++){
            System.out.println("posição " + i + " :" + vetor[i]);
        }
        System.out.println("Tamanho: " + vetor.length);
    }
}
