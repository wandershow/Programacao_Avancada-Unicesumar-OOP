package exercicio3;

// Atividade 3 - Conta Bancária (Construtor e Métodos)

public class Exercicio3 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Wanderson Silva", 100.0);
        conta.exibirSaldo();

        conta.depositar(50.0);
        conta.exibirSaldo();

        conta.sacar(30.0);
        conta.exibirSaldo();

        conta.sacar(500.0); // testa saldo insuficiente
        conta.exibirSaldo();
    }
}