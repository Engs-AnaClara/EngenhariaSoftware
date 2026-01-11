package model;

import exceptions.EmailInvalidoException;
import java.util.UUID;
import java.util.regex.Pattern;

public class Cliente {
    private final String id;
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.id = UUID.randomUUID().toString();
        setNome(nome);
        setEmail(email);
    }

    public String getId() { return id; }
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
