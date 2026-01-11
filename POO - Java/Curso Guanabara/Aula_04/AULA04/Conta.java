package AULA04;

public class Conta {
    public int numConta;
    protected String Tipo;
    private String Dono;
    private int Saldo;
    private boolean Status;

    public Conta(){
        this.Saldo = 0;
        this.Status = false; 
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("ContaCorrente")){  // Corrigido: == para .equals() e nome unificado
            this.Saldo = 20;
        } else if (t.equals("ContaPoupanca")) {  // Corrigido: nome unificado
            this.Saldo = 120;
        }
    }

    void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois ainda possui saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
    }

    void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Não foi possivel efetuar, pois a conta está fechada");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){  // Corrigido: removido ; extra e adicionado bloco
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta está fechada");
        }
    }

    void pagarMensal(){
        int v = 0;  // Corrigido: inicializada a variável
        if (this.getTipo().equals("ContaCorrente")){  // Corrigido: == para .equals()
            v = 12;
        } else if (this.getTipo().equals("ContaPoupanca")){  // Corrigido: == para .equals()
            v = 20;
        }
        
        if (this.getStatus() && v > 0){  // Adicionado: lógica para debitar
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade de " + v + " debitada");
        }
    }

    public void setnumConta(int n){
        this.numConta = n;
    }

    public int getnumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.Tipo = t;
    }

    public String getTipo(){
        return this.Tipo;
    }
    
    public void setDono(String dono){
        this.Dono = dono;
    }

    public String getDono(){
        return this.Dono;
    }

    public void setSaldo(float saldo){
        this.Saldo = (int) saldo;
    }

    public int getSaldo(){
        return this.Saldo;
    }

    public void setStatus(boolean status){ 
        this.Status = status;
    }

    public boolean getStatus(){  
        return this.Status;
    }

    // Método para mostrar dados da conta
    public void mostrarDados(){
        System.out.println("Número: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada"));
        System.out.println("--------------------");
    }
}

