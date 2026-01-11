package trabalhopoo.repositories;

import trabalhopoo.model.Cliente;
import java.util.*;

public class ClienteRepository {

    private final List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Optional<Cliente> buscarPorNome(String nome) {
        return clientes.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }
}
