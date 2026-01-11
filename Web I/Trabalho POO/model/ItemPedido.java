package model;

public class ItemPedido{
    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemPedido(Produto produto, int quantidade){
        if (produto == null) {
        throw new IllegalArgumentException("Produto não pode ser nulo");
    }
        if (quantidade <= 0){
            throw new IllegalArgumentException("Quantidade inválida " + quantidade);
        }
        this.quantidade = quantidade;
        this.produto = produto;
        this.subtotal = this.calcularSubtotal();
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

    public double calcularSubtotal(){
        return  getQuantidade() * produto.getPreco();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
    return quantidade + "x " + produto.getNome() + " - R$ " + String.format("%.2f", subtotal);
    }
    
}
