public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Bilbo", 57, "M");
        l[0] = new Livro("O Hobbit", "JRR Tolkien", 263, p[0]);

        p[1] = new Pessoa("Gandalf", 100, "M");
        l[1] = new Livro("A Ordem da Fenix", "JK", 706, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
    
}
