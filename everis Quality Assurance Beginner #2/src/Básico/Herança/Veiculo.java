package Básico.Herança;

public abstract class Veiculo {
    private String cor;
    private String marca;
    private float valor;

    public Veiculo(String cor, String marca, float valor){
        this.cor = cor;
        this.marca = marca;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "cor=" + this.cor + '\n' + "marca=" + this.marca + '\n' + "valor=" + this.valor;
    }
}
