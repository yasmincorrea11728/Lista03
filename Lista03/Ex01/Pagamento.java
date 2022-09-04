package Ex01;

import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        f.setNome(nome);

        System.out.println("Digite o valor por hora: ");
        float valor = entrada.nextFloat();
        f.setValor(valor);

        System.out.println("Digite quantas horas foram trabalhadas: ");
        int horasTrab = entrada.nextInt();
        f.pagamento(horasTrab);

        entrada.close();
    }
}