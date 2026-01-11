

public class Pedido_main {
        public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        
        pedido.adicionarItem("Batom", 1, 25);
        pedido.adicionarItem("Rímel", 2, 55);
        pedido.adicionarItem("Blush", 3, 30);
        
        System.out.println("\nPedido completo:");
        pedido.listarItens();
        
        System.out.println("\nRemovendo Batom:");
        pedido.removerItem("Batom");
        
        System.out.println("\nPedido final:");
        pedido.listarItens();
    }
}
    
