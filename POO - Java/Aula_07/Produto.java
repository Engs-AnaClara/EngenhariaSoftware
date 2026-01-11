package Aula07;

public class Produto {
    public String Nome;
    public int Preço;
    public String Quantidade;

    public Forma(String Nome, int Preço, String Quantidade){
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

    public int getNome(){
            return this.Nome;
        }
        
        public int getPreço(){
            return this.Preço;
        }

        public int getPreço{
            return this.Preço;
        }
}