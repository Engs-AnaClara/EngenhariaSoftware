package Caneta;

public class Caneta2 {
    public static void main (String [] rags) {
        Caneta c1 = new Caneta();
        c1.cor = "rosa";
        c1.modelo = "faber";
        c1.tampada = false; 
        c1.status();
        c1.rabiscar();
    }
}
