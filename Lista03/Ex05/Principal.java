package Ex05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tabuada c = new Tabuada();

        System.out.print("Digite a tabuada para qual numero deseja: ");
        int valor = entrada.nextInt();
        c.setValor(valor);
        c.tabuada();

        entrada.close();
    }
}