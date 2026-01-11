package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int ID;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private double valorTotal;
    private String dataCriacao;
    
    public Pedido(int ID, Cliente cliente){
        
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
        return itens;
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
        if (quantidade <= 0){
            System.out.println("A quantidade adicionada deve ser maior que zero");
            return;
        }

        if (produto == null) {
            System.out.println("Produto não pode ser nulo");
            return;
        }

        ItemPedido novoItem = new ItemPedido(produto, quantidade);
        itens.add(novoItem);  
        this.recalcularTotal();
        System.out.println(quantidade + " x " + produto.getNome() + " adicionado(s) ao Pedido!");
    }

    public void listarItens() {
        System.out.println("Itens do Pedido:");
        
        for (ItemPedido item : itens) {
            System.out.println(item); 
        }
    }

    private void recalcularTotal(){
        this.valorTotal = 0.0;

        for (ItemPedido item : itens) {
            valorTotal += item.getSubtotal()  ; 
        }

    }

    public void removerItem( Produto produto){
        for (ItemPedido item : itens) {
        if (item.getProduto().equals(produto)) {
            itens.remove(item);
            System.out.println("Produto removido do Pedido");
            recalcularTotal();
            return; 
        }
    } 
        System.out.println("O prduto escolhido não foi encontrado no Pedido");    
    }

    public void mudarStatus(StatusPedido novoStatus) {
        System.out.println("Pedido " + ID + " mudou de " + this.status + " para " + novoStatus);
        this.status = novoStatus;
    }

    public void enviarFila(){
        if (itens.isEmpty()) {
            System.out.println("Erro: O Pedido precisa ter pelo menos 1 item para ter acesso a fila");
            return;
    }
        if (this.status != StatusPedido.ABERTO) {
            System.out.println("! Pedido já enviado para processamento !");
            return;
        } 
        mudarStatus(StatusPedido.FILA);
    }

    public void iniciarProcessando(){
        if (this.status != StatusPedido.FILA) {
            System.out.println("! Pedido não está na fila de processamento !");
            return;
        }
        mudarStatus(StatusPedido.PROCESSANDO);
    }


    public void finalizar(){
        if (this.status != StatusPedido.PROCESSANDO) {
            System.out.println("! Pedido não está sendo processado !");
            return;
        }
        mudarStatus(StatusPedido.FINALIZADO);
    }
    
    public void iniciarProcessamento() {
        mudarStatus(StatusPedido.PROCESSANDO);
    }

}