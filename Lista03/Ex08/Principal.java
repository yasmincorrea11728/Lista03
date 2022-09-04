package Ex08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        e.setNome(nome);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = entrada.nextDouble();
        e.setSalarioBruto(salarioBruto);

        System.out.print("Digite qual é o imposto: ");
        double imposto = entrada.nextDouble();
        e.setImposto(imposto);

        e.buscasSalarioLiquido();

        System.out.println("Informe qual a porcentagem para aumentar o salario? ");
        double porcentagem = entrada.nextDouble();
        e.aumentarSalario(porcentagem);
        entrada.close();
    }
}