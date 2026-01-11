package trabalhopoo.exceptions;

public class EmailInvalidoException extends RuntimeException {
    public EmailInvalidoException(String email) {
        super("E-mail inválido: " + email);
    }

    public EmailInvalidoException() {
        super("E-mail inválido!");
    }
}
