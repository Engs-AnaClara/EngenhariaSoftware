package trabalhopoo.app;

import trabalhopoo.model.*;
import trabalhopoo.repositories.*;
import trabalhopoo.service.PedidoService;
import java.util.Scanner;

public class Menu {

    private static final ClienteRepository clienteRepo = new ClienteRepository();
    private static final ProdutoRepository produtoRepo = new ProdutoRepository();
    private static final PedidoRepository pedidoRepo = new PedidoRepository();
    private static final PedidoService pedidoService = new PedidoService(pedidoRepo);
    private static final Scanner sc = new Scanner(System.in);
    private static int pedidoCounter = 1;

    public static void exibirMenu() {
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== Sistema de Gestão de Pedidos ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Criar Pedido");
            System.out.println("6 - Adicionar Item ao Pedido");
            System.out.println("7 - Listar Pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarCliente();
                    break;
                case "2":
                    listarClientes();
                    break;
                case "3":
                    cadastrarProduto();
                    break;
                case "4":
                    listarProdutos();
                    break;
                case "5":
                    criarPedido();
                    break;
                case "6":
                    adicionarItemPedido();
                    break;
                case "7":
                    pedidoService.listarPedidos();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        System.out.println("Sistema encerrado!");
        sc.close();
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();

        try {
            Cliente c = new Cliente(nome, email);
            clienteRepo.salvar(c);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- Clientes ---");
        clienteRepo.listar().forEach(System.out::println);
    }

    private static void cadastrarProduto() {
        try {
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = Double.parseDouble(sc.nextLine());
            System.out.println("Categoria (ALIMENTOS, ELETRONICOS, LIVROS, VESTUARIO, OUTROS): ");
            Categoria categoria = Categoria.valueOf(sc.nextLine().toUpperCase());

            Produto p = new Produto(nome, preco, categoria);
            produtoRepo.salvar(p);
            System.out.println("Produto cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarProdutos() {
        System.out.println("\n--- Produtos ---");
        produtoRepo.listar().forEach(System.out::println);
    }

    private static void criarPedido() {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente c = clienteRepo.buscarPorNome(nomeCliente).orElse(null);

        if (c == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        Pedido pedido = pedidoService.criarPedido(pedidoCounter++, c);
        System.out.println("Pedido criado com sucesso! ID: " + pedido.getID());
    }

    private static void adicionarItemPedido() {
        System.out.print("Digite o ID do pedido: ");
        int pedidoId = Integer.parseInt(sc.nextLine());
        Pedido pedido = pedidoRepo.buscarPorId(pedidoId).orElse(null);

        if (pedido == null) {
            System.out.println("Pedido não encontrado!");
            return;
        }

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        Produto produto = produtoRepo.buscarPorNome(nomeProduto).orElse(null);

        if (produto == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        pedido.adicionarItem(produto, quantidade);
        System.out.println("Item adicionado ao pedido com sucesso!");
    }
}
