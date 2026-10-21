package exercicio3;

class ContaBancaria {
    String titular;
    double saldo;

    // Construtor: obriga a informar titular e saldo inicial ao criar a conta
    ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para sacar R$ " + valor + ".");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}