package exercicio4;

class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        // O encapsulamento permite validar o dado antes de aceitá-lo
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo.");
            return;
        }
        this.preco = preco;
    }
}
