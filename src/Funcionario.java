class Funcionario {
    protected String nome;
    protected double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    double calcularBonus() {
        return salario * 0.10;
    }
}