package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f;
        String nome, cargo;
        double salario, porcentagem;

        System.out.print("Nome do funcionário: ");
        nome = sc.next();
        System.out.print("Cargo do funcionário: ");
        cargo = sc.next();
        System.out.print("Salário do funcionário: ");
        salario = sc.nextDouble();

        f = new Funcionario(nome, cargo, salario);

        // aumentar o salario de acordo com uma porcentagem
        System.out.println("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = sc.nextDouble();
        f.aumentarSalario(porcentagem);
        System.out.println("Novo salário R$ " + f.salario);

        // aumentar o salário de acordo com o cargo e uma porcentagem
        System.out.println();
        System.out.println("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = sc.nextDouble();
        System.out.println("Digite o cargo que terá aumento: ");
        cargo = sc.next();
        f.aumentarSalario(cargo, porcentagem);
        System.out.println("Novo salário R$ " + f.salario);
    }
}
