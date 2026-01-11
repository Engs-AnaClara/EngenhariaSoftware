package trabalhopoo.model;

import trabalhopoo.exceptions.EmailInvalidoException;
import java.util.regex.Pattern;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        this.nome = nome.trim();
    }

    public void setEmail(String email) {
        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
            throw new EmailInvalidoException(email);
        }
        this.email = email.trim();
    }

    @Override
    public String toString() {
        return nome + " (" + email + ")";
    }
}
