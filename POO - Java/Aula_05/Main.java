public class Main {
    public static void main(String[] args) {
        // Testando o construtor vazio
        Produto produto1 = new Produto();
        System.out.println("Produto 1: " + produto1.getnome() + " - R$" + produto1.getpreco());

        // Testando o construtor com parâmetros (valor válido)
        Produto produto2 = new Produto("Notebook", 2500);
        System.out.println("Produto 2: " + produto2.getnome() + " - R$" + produto2.getpreco());

        // Testando o construtor com preço inválido
        Produto produto3 = new Produto("Mouse", -50);
        System.out.println("Produto 3: " + produto3.getnome() + " - R$" + produto3.getpreco());
    }
}