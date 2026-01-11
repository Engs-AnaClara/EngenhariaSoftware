package trabalhopoo.model;

public class ProcessadorPedidos implements Runnable, IProcessador {

    private final FilaPedidos fila;
    private volatile boolean executando; // garante visibilidade entre threads

    public ProcessadorPedidos(FilaPedidos fila) {
        if (fila == null) {
            throw new IllegalArgumentException("Fila não pode ser nula!");
        }
        this.fila = fila;
        this.executando = true;
    }

    @Override
    public void run() {
        System.out.println("📦 Processador de pedidos iniciado!");

        while (executando) {
            try {
                Pedido pedido = fila.remover(); // método não lança InterruptedException

                if (pedido != null) {
                    processarPedido(pedido);
                }

                // pequena pausa para evitar uso excessivo da CPU
                Thread.sleep(100);

            } catch (Exception e) {
                System.out.println("⚠️ Erro no processamento: " + e.getMessage());
            }
        }

        System.out.println("✅ Processador de pedidos finalizado.");
    }

    @Override
    public void processarPedido(Pedido pedido) {
        try {
            pedido.iniciarProcessando();
            System.out.println("🔄 Processando pedido #" + pedido.getID() + "...");

            Thread.sleep(3000); // simula tempo de processamento

            pedido.finalizar();
            System.out.println("✅ Pedido #" + pedido.getID() + " finalizado com sucesso!");

        } catch (InterruptedException e) {
            System.out.println("⚠️ Processamento do pedido #" + pedido.getID() + " interrompido.");
            Thread.currentThread().interrupt();
        }
    }

    public void parar() {
        executando = false;
        System.out.println("🛑 Encerrando processador de pedidos...");
    }
}
