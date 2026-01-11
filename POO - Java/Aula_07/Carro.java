package Aula07;

public class Carro extends Produto {
    
    public Carro(int altura, int largura) {
        super(altura, largura);
    }
    
    @Override
    public int area() {
        return 3 * altura * altura; 
    }
}
