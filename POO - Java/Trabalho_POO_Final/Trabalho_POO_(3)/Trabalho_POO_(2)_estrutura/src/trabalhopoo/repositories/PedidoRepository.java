package trabalhopoo.repositories;

import trabalhopoo.model.Pedido;
import java.util.*;

public class PedidoRepository implements Repository<Pedido, Integer> {

    private final Map<Integer, Pedido> pedidos = new HashMap<>();

    @Override
    public void salvar(Pedido pedido) {
        pedidos.put(pedido.getID(), pedido);
    }

    @Override
    public Optional<Pedido> buscarPorId(Integer id) {
        return Optional.ofNullable(pedidos.get(id));
    }

    @Override
    public List<Pedido> listar() {
        return new ArrayList<>(pedidos.values());
    }
}
