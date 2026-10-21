package exercicio2;

// Atividade 2 - Classe "Retângulo" com métodos

public class Exercicio2 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 5.0;
        retangulo.altura = 3.0;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
        System.out.println("Área: " + retangulo.calcularArea());
    }
}
