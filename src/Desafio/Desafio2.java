package Desafio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2{
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in); // Lê a linha de entrada

        String cpf = ler.next();

        cpf = cpf.replace(".","\n").replace("-", "\n");

        System.out.println(cpf);


    }
}
