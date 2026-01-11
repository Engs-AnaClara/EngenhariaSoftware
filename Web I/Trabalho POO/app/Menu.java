package app;

import model.*;
import java.util.*;

public class Menu {
    private static final List<Cliente> clientes = new ArrayList<>();
    private static final List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== Sistema de Gestão de Pedidos ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            switch (sc.nextLine()) {
                case "1": cadastrarCliente(sc); break;
                case "2": listarClientes(); break;
                case "3": cadastrarProduto(sc); break;
                case "4": listarProdutos(); break;
                case "0": rodando = false; break;
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    private static void cadastrarCliente(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();

        try {
            clientes.add(new Cliente(nome, email));
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- Clientes ---");
        clientes.forEach(System.out::println);
    }

    private static void cadastrarProduto(Scanner sc) {
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(sc.nextLine());

        System.out.println("Categoria (ALIMENTOS, ELETRONICOS, LIVROS, VESTUARIO, OUTROS): ");
        Categoria categoria = Categoria.valueOf(sc.nextLine().toUpperCase());

        try {
            produtos.add(new Produto(nome, preco, categoria));
            System.out.println("Produto cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarProdutos() {
        System.out.println("\n--- Produtos ---");
        produtos.forEach(System.out::println);
    }
}
