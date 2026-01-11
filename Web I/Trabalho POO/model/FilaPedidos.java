package model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FilaPedidos {
    private BlockingQueue<Pedido> fila;
    
    public FilaPedidos() {
        this.fila = new LinkedBlockingQueue<>();
    }
    
    public void adicionar(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Produto não pode ser nulo");
            return;
        }
        
        if (pedido.getStatus() != StatusPedido.FILA) {
            System.out.println("Pedido precisa estar com status fila!");
            return;
        }
        
        try {
            fila.put(pedido);
            System.out.println("O pedido: " + pedido.getID() + " foi adicionado à fila de processamento");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar pedido na fila");
        }
    }
    
    public Pedido remover() {
        try {
            Pedido pedido = fila.take(); 
            return pedido;
        } catch (Exception e) {
            System.out.println("Erro ao remover pedido da fila");
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