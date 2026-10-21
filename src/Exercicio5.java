// Atividade 5 - Criando a classe "Funcionário" (Herança e Polimorfismo)

public class Exercicio5 {
    public static void main(String[] args) {
        // Polimorfismo: as duas variáveis são do tipo Funcionario,
        // mas cada uma executa a versão de calcularBonus() do seu objeto real.
        Funcionario funcionario = new Funcionario("Ana", 3000.0);
        Funcionario gerente = new Gerente("Carlos", 3000.0);

        System.out.println(funcionario.nome + " (Funcionário) - Bônus: R$ " + funcionario.calcularBonus());
        System.out.println(gerente.nome + " (Gerente) - Bônus: R$ " + gerente.calcularBonus());
    }
}