package trabalhopoo.model;

public class ItemPedido {
    private final Produto produto;
    private final int quantidade;
    private final double subtotal;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo!");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida: " + quantidade);
        }
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = calcularSubtotal();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    private double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " - R$ " + String.format("%.2f", subtotal);
    }
}
