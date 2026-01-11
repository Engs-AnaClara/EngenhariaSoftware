package exceptions;

public class EmailInvalidoException extends RuntimeException {
    public EmailInvalidoException(String email) {
        super("E-mail inválido: " + email);
    }
}
