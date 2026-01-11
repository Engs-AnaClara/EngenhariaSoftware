package Conta;

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
        this.Status = true;
        if (t == "ContaCorente"){
            this.Saldo = 20;
        } else if (t == "ContaP") {
            this.Saldo = 120;
        }
    }

    void fecharConta (){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois ainda possui débito");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fcehada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
    }

    void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() +  v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Não foi possivel efetuar, pois a conta está fechada");
        }

    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente");

}
    }}
    void pagarMensal(){
        int v;
        if (this.getTipo() == "ContaCorrente"){
            v = 12;
        } else if (this.getTipo() == "Conta P"){
            v = 20;
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
    public void setSaldo (float saldo){
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
        public void mostrarDados(){
        System.out.println("Número: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada"));
        System.out.println("--------------------");
    }
}

