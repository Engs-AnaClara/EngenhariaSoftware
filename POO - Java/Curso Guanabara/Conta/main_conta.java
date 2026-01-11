package Conta;

public class main_conta {
        public static void main (String [] args) {
        Conta p1 = new Conta();
        p1.setnumConta(12);
        p1.setTipo("Conta Corrente");
        p1.setDono("Ana Clara");
        p1.mostrarDados();
        p1.setSaldo(120);
        
        Conta p2 = new Conta();
        p2.setnumConta(22);
        p2.setTipo("Conta Corrente");
        p2.setDono("Luiz Lindo");
        p2.mostrarDados();
    }
}
