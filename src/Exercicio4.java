// Atividade 4 - Classe "Produto" (Encapsulamento)

public class Exercicio4 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(149.90);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        produto.setPreco(-10); // tentativa inválida, o valor não muda
        System.out.println("Preço após tentativa inválida: R$ " + produto.getPreco());
    }
}