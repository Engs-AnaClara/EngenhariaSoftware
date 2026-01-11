package Produto03;

import java.util.ArrayList;

public class Preco {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 2500.90, 5));
        produtos.add(new Produto("Mouse", 45.50, 20));
        produtos.add(new Produto("Teclado", 120.00, 10));
        produtos.add(new Produto("Monitor", 800.75, 3));

        System.out.println("=== LISTA DE PRODUTOS ===");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}