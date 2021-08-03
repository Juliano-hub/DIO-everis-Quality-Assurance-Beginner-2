package Avançado.ProcessAssincParalelo;
import java.util.Set;

public class Exemplo1Thread {
    public static void main(String[] args){
        GerarPDF iniciarPDF = new GerarPDF();
        BarraCarregamento barra = new BarraCarregamento(iniciarPDF);

        iniciarPDF.start();
        barra.start();
    }
}
class GerarPDF extends Thread{
    public void run() {
        try {
            System.out.println("Iniciando a geração do PDF:");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado!");
    }
}
class BarraCarregamento extends Thread{
    private Thread iniciadorGeradorPDF;
    // usa para controlar a outra Thread

    public BarraCarregamento(Thread iniciarPDF) {
        // passa a outra Thread para fazer o controle dela
        this.iniciadorGeradorPDF = iniciarPDF;
    }

    public void run(){
        while(true) {
        // enquanto não estiver carregado a outra Thread
        try{
            Thread.sleep(500);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        if(!iniciadorGeradorPDF.isAlive()) {
            // para quebrar o while quando acabar a outra Thread
            break;
        }
            System.out.println("Loading...");
        }
    }
}