import java.util.ArrayList;

class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    public String getProduto() {
        return produto;
    }
    
    @Override
    public String toString() {
        return produto + " Quantidade: " + quantidade + " - R$ " + precoUnitario;
    }
}

public class Pedido {
    private ArrayList<ItemPedido> itens;
    
    public Pedido() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String produto, int quantidade, double preco) {
        ItemPedido item = new ItemPedido(produto, quantidade, preco);
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }
    
    public void removerItem(String produto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().equals(produto)) {
                ItemPedido itemRemovido = itens.get(i);
                itens.remove(i);
                System.out.println("Item removido: " + itemRemovido);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + produto);
    }
    
    public void listarItens() {
        System.out.println("Itens do pedido:");
        System.out.println(itens);
    }
}