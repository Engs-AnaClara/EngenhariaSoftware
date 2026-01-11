package model;

public class ProcessadorPedidos implements Runnable {
    private FilaPedidos fila;
    private boolean executando;
    
    public ProcessadorPedidos(FilaPedidos fila) {
        if (fila == null) {
            throw new IllegalArgumentException("Fila não pode ser nula");
        }
        this.fila = fila;
        this.executando = true;
    }
    
    @Override
    public void run() {
        System.out.println("Processador de pedidos INICIADO!");
        
        while (executando) {
            try {
                Pedido pedido = fila.remover();
                
                if (pedido != null) {
                    pedido.iniciarProcessamento();
                    System.out.println("Processando pedido #" + pedido.getID());
                    
                    Thread.sleep(3000);
                    
                    pedido.finalizar();
                    System.out.println("Pedido #" + pedido.getID() + " finalizado!");
                }
                
            } catch (InterruptedException e) {
                System.out.println("Processador interrompido");
                executando = false;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
    
    public void parar() {
        executando = false;
    }
}