
public class Produto {
    public String Nome;
    public int Preço;
    public String Quantidade;

    public Produto(String Nome, int Preço, String Quantidade){
        this.Nome = Nome;
        this.Preço = Preço;
        this.Quantidade = Quantidade;
    }


    public int mover(){
        return 0;
    }

    @Override
    public String toString(){
        return "Nome: " + Nome + "Preço " + Preço + "Quantidade " + Quantidade;
    }

    public String getNome(){
            return this.Nome;
        }
        
    public int getPreco(){
        return this.Preço;
    }
    
    public String getQuantidade(){
        return this.Quantidade;
    }



}