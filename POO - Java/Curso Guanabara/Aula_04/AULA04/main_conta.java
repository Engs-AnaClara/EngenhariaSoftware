package AULA04;

public class main_conta {
    public static void main(String[] args) {  
        // Criando primeira conta
        Conta p1 = new Conta();
        p1.setnumConta(12);
        p1.setDono("Ana Clara");
        p1.abrirConta("ContaCorrente");  
        
        // Criando segunda conta
        Conta p2 = new Conta();
        p2.setnumConta(22);
        p2.setDono("Luiz Lindo");
        p2.abrirConta("ContaPoupanca");  
        
        System.out.println("Dados das contas");
        p1.mostrarDados();
        p2.mostrarDados();

                System.out.println("=== TESTANDO OPERAÇÕES ===");
        p1.depositar(100);
        p1.sacar(50);
        p1.mostrarDados();
        
        p2.depositar(200);
        p2.pagarMensal();
        p2.mostrarDados();
    }
}