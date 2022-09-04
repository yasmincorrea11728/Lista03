package Ex09;

import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qual o valor do dólar? ");
        float dolar = entrada.nextFloat();

        System.out.println("Informe quantos dólares serão comprados? ");
        float qt = entrada.nextFloat();

        Cambio.converter(dolar, qt);

        entrada.close();
    }

    public static void converter(float dolar, float qt) {
        float porcentagem = (dolar * qt) * 0.06f;
        float total = (dolar * qt) + porcentagem;

        System.out.println("Funcionário: Valor a ser pago em reais = " + total);
    }
}