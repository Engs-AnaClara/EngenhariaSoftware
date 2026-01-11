package trabalhopoo.repositories;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    void salvar(T obj);
    Optional<T> buscarPorId(ID id);
    List<T> listar();
}
