public class Produto2 {
    private String Nome;
    private double Preco;

    public Produto2(){
        this.Nome = "nome";
        this.Preco = 0;
    }

    public Produto2 (String Nome, double Preco){
        this.Nome = "";
        this.Preco = 0.0;
    }

    public double getPreco(){
        return this.Preco;
    }

    public void setPreco (double Preco){
    {if (this.Preco >=0){
        System.out.println("Preço positivo");
        this.Preco = 0; 
    }else{
        System.out.println("Preço inválido");
    }

    }
}}
