package trabalhopoo.model;

import trabalhopoo.exceptions.PrecoInvalidoException;
import java.util.UUID;

public class Produto {
    private final String id;
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(String nome, double preco, Categoria categoria) {
        this.id = UUID.randomUUID().toString();
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio!");
        }
        this.nome = nome.trim();
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new PrecoInvalidoException(preco);
        }
        this.preco = preco;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Categoria inválida!");
        }
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", preco) + " [" + categoria + "]";
    }
}
