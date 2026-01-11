package trabalhopoo.repositories;

import trabalhopoo.model.Produto;
import java.util.*;

public class ProdutoRepository implements Repository<Produto, String> {

    private final Map<String, Produto> produtos = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    @Override
    public Optional<Produto> buscarPorId(String id) {
        return Optional.ofNullable(produtos.get(id));
    }

    @Override
    public List<Produto> listar() {
        return new ArrayList<>(produtos.values());
    }

    // Novo método para buscar pelo nome
    public Optional<Produto> buscarPorNome(String nome) {
        return produtos.values().stream()
                       .filter(p -> p.getNome().equalsIgnoreCase(nome))
                       .findFirst();
    }
}
