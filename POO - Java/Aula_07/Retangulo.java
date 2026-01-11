package Aula07;

public class Retangulo extends Forma {
    public Retangulo(int altura, int largura) {
        super(altura, largura);
    }
    
    @Override
    public int area() {
        return altura * largura;
    }
    
    @Override
    public String toString() {
        return "Retângulo - Altura: " + altura + ", Largura: " + largura + ", Área: " + area();
    }
}

