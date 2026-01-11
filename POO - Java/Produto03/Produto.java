package Produto03;

public class Produto {
    public String Nome;
    public int Preço;
    public String Quantidade;

    public Produto(String Nome, int Preço, String Quantidade) {
        this.Nome = Nome;
        this.Preço = Preço;
        this.Quantidade = Quantidade;
    }


    public int area(){
        return 0;
    }

    public String toString() {
        return "Produto: " + Nome + "Quantidade: " + Quantidade + " - Preço:"  + Preço;
    }
}
