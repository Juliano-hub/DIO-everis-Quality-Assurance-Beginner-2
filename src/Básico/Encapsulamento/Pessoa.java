package Básico.Encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    protected Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    protected String printar() {
        return "nome=" + nome + ", idade=" + idade;
    }

}
