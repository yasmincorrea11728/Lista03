package Ex04;

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean funcionando = true;

        do {
            System.out.println("Informe 2 números: ");
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            String sentido = "";

            if (x > y) {
                sentido = "DECRESCENTE!";
            } else if (x < y) {
                sentido = "CRESCENTE!";
            } else if (x == y) {
                sentido = "IGUAIS!";
            }

            System.out.println(sentido);
        } while (funcionando);

        entrada.close();
    }
}