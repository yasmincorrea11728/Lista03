package Ex02;

import java.util.Scanner;

public class Mercearia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço unitário do produto: ");
        float preco = entrada.nextFloat();

        System.out.println("Digite qual foi a quantidade comprada: ");
        float qt = entrada.nextFloat();

        System.out.println("Digite qual foi o dinheiro recebido: ");
        float dinheiro = entrada.nextFloat();

        Mercearia.troco(preco, qt, dinheiro);

        entrada.close();
    }

    public static void troco(float preco, float qt, float dinheiro) {
        float total = qt * preco;
        float troco = dinheiro - total;
        System.out.println("TROCO = " + troco);
    }
}