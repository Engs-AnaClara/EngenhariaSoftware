
public class Veiculo {
    protected String marca;
    protected int velocidade;
    
    public Veiculo(String marca, int velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }
    
    public void mover() {
        System.out.println("Veículo genérico se movendo");
    }
    
    @Override
    public String toString() {
        return "Marca: " + marca + ", Velocidade: " + velocidade;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public int getVelocidade() {
        return this.velocidade;
    }
}

