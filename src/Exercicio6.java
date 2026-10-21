// Atividade 6 - Sistema de Veículos (Herança e Polimorfismo)

public class Exercicio6 {
    public static void main(String[] args) {
        // Polimorfismo: um array do tipo Veiculo guardando objetos de subclasses
        // diferentes
        Veiculo[] veiculos = { new Carro(), new Bicicleta() };

        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}
