package exercicio04;

public class Funcionario {
    // atributos ou variáveis de instância
    String nome;
    String cargo;
    double salario;

    // construtor para inicializar os atributos com valores recebidos por parâmetro
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // método para aplicar um aumento no salário
    public void aumentarSalario(double porcentagem) {
        salario = salario + (salario * porcentagem / 100);
    }

    public void aumentarSalario(String cargo, double porcentagem) {
        if(this.cargo.equalsIgnoreCase(cargo)) {
            salario = salario + (salario * porcentagem / 100);
        }
    }

    public void promover(String cargo) {
        this.cargo = cargo;
    }
}
