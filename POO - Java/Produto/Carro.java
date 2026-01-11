
public class Carro extends Veiculo {
    
    public Carro(String marca, int velocidade) {
        super(marca, velocidade);
    }
    
    @Override
    public void mover() {
        System.out.println("Carro dirigindo na estrada");
    }
    
    @Override
    public String toString() {
        return "Carro - Marca: " + marca + ", Velocidade: " + velocidade + "km/h";
    }
}