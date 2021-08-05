package Básico.Herança;
import Básico.Herança.Veiculo;

public class Carro extends Veiculo{
    private int quantPortas;

    protected Carro(String cor, String marca, float valor, int quantPortas) {
        super(cor, marca, valor);
        this.quantPortas = quantPortas;
    }


    public String toString() {
        return super.toString() + '\n' + "Quantidades de Portas:" + this.quantPortas;
    }
}
