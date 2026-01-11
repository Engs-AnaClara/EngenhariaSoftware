package trabalhopoo.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FilaPedidos {
    private final BlockingQueue<Pedido> fila;

    public FilaPedidos() {
        this.fila = new LinkedBlockingQueue<>();
    }

    public void adicionar(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Pedido não pode ser nulo!");
            return;
        }

        if (pedido.getStatus() != StatusPedido.FILA) {
            System.out.println("Pedido precisa estar com status FILA!");
            return;
        }

        try {
            fila.put(pedido);
            System.out.println("O pedido " + pedido.getID() + " foi adicionado à fila de processamento.");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar pedido na fila: " + e.getMessage());
        }
    }

    public Pedido remover() {
        try {
            Pedido pedido = fila.take();
            System.out.println("Pedido " + pedido.getID() + " removido da fila para processamento.");
            return pedido;
        } catch (Exception e) {
            System.out.println("Erro ao remover pedido da fila: " + e.getMessage());
            return null;
        }
    }

    public int tamanho() {
        return fila.size();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }
}
