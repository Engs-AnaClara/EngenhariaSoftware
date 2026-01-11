public class lista_main {
     public static void main(String[] args) {
        Lista sorteio = new Lista();
        
        sorteio.adicionarNome("Ana");
        sorteio.adicionarNome("Carlos");
        sorteio.adicionarNome("Maria");
        sorteio.adicionarNome("João");
        sorteio.adicionarNome("Fernanda");

        String nomeSorteado = sorteio.Lista();
        if (nomeSorteado != null) {
            System.out.println("Nome sorteado: " + nomeSorteado);
        } else {
            System.out.println("A lista de nomes está vazia!");
        }
    }
}
