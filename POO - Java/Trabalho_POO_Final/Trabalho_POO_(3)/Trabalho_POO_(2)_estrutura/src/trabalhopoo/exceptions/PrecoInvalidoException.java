package trabalhopoo.exceptions;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException(double preco) {
        super("Preço inválido: " + preco);
    }

    public PrecoInvalidoException() {
        super("Preço inválido!");
    }
}
