public class Produto {
    private String nome;
    private int preco;


    public Produto(){
        this.nome = "";
        this.preco = 0;
}

    public Produto(String nome, int preco) {
        this.nome = nome;

        if (preco < 0){
            this.preco = (int) 0;
            System.out.println("Preço inválido");
        }else{
            this.preco = (int) preco;
        }

        }

    public String getnome() {
        return nome;
    }

    public int getpreco() {
        return preco;
    }

    }