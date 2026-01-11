package trabalhopoo.service;

import trabalhopoo.model.Cliente;
import trabalhopoo.model.Pedido;
import trabalhopoo.model.Produto;
import trabalhopoo.repositories.PedidoRepository;

public class PedidoService {

    private final PedidoRepository pedidoRepo;

    public PedidoService(PedidoRepository pedidoRepo) {
        this.pedidoRepo = pedidoRepo;
    }

    public Pedido criarPedido(int id, Cliente cliente) {
        Pedido pedido = new Pedido(id, cliente);
        pedidoRepo.salvar(pedido);
        return pedido;
    }

    public void adicionarItem(Pedido pedido, Produto produto, int quantidade) {
        pedido.adicionarItem(produto, quantidade);
    }

    public void listarPedidos() {
        System.out.println("\n--- Pedidos ---");
        pedidoRepo.listar().forEach(p ->
            System.out.println("Pedido " + p.getID() +
                    " | Cliente: " + p.getCliente().getNome() +
                    " | Total: R$" + String.format("%.2f", p.getValorTotal()) +
                    " | Status: " + p.getStatus())
        );
    }
}
