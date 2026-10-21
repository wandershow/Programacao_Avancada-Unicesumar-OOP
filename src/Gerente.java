
class Gerente extends Funcionario {

    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.20;
    }
}