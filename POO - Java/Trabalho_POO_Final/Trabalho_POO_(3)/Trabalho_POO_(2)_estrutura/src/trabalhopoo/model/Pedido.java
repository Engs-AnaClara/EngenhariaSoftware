package trabalhopoo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int ID;
    private final Cliente cliente;
    private final List<ItemPedido> itens;
    private StatusPedido status;
    private double valorTotal;
    private final String dataCriacao;

    public Pedido(int ID, Cliente cliente) {
        this.ID = ID;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.ABERTO;
        this.dataCriacao = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public int getID() {
        return ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens); 
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto == null) {
            System.out.println("Produto não pode ser nulo!");
            return;
        }
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero!");
            return;
        }

        ItemPedido novoItem = new ItemPedido(produto, quantidade);
        itens.add(novoItem);
        recalcularTotal();
        System.out.println(quantidade + "x " + produto.getNome() + " adicionado(s) ao pedido!");
    }

    public void listarItens() {
        System.out.println("\nItens do Pedido " + ID + ":");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
    }

    private void recalcularTotal() {
        valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.getSubtotal();
        }
    }

    public void removerItem(Produto produto) {
        for (ItemPedido item : new ArrayList<>(itens)) { // evita erro de modificação da lista
            if (item.getProduto().equals(produto)) {
                itens.remove(item);
                recalcularTotal();
                System.out.println("Produto removido do pedido!");
                return;
            }
        }
        System.out.println("Produto não encontrado no pedido!");
    }

    public void mudarStatus(StatusPedido novoStatus) {
        System.out.println("Pedido " + ID + " mudou de " + status + " para " + novoStatus);
        this.status = novoStatus;
    }

    public void enviarFila() {
        if (itens.isEmpty()) {
            System.out.println("Erro: o pedido precisa ter pelo menos 1 item para ser enviado à fila!");
            return;
        }
        if (status != StatusPedido.ABERTO) {
            System.out.println("Pedido já foi enviado para processamento!");
            return;
        }
        mudarStatus(StatusPedido.FILA);
    }

    public void iniciarProcessando() {
        if (status != StatusPedido.FILA) {
            System.out.println("Pedido não está na fila de processamento!");
            return;
        }
        mudarStatus(StatusPedido.PROCESSANDO);
    }

    public void finalizar() {
        if (status != StatusPedido.PROCESSANDO) {
            System.out.println("Pedido não está sendo processado!");
            return;
        }
        mudarStatus(StatusPedido.FINALIZADO);
    }

    public void iniciarProcessamento() {
        mudarStatus(StatusPedido.PROCESSANDO);
    }

    @Override
    public String toString() {
        return "Pedido #" + ID + " - Cliente: " + cliente.getNome() +
                " | Status: " + status +
                " | Total: R$ " + String.format("%.2f", valorTotal) +
                " | Criado em: " + dataCriacao;
    }
}
