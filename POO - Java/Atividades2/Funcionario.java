package Atividades2;

public class Funcionario {
    private String Nome;
    private double Salario;
    public Departamento departamento;

    public Funcionario(String nome, double salario, Departamento departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String setnome(String n){
        this.nome = n;
    }
    public String getnome(){
        return this.nome;
    }
    public void setSalario (String s){
        this.Salario = s;
    }
    public double getSalario(){
        return this.Salario;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }

    @Override
    public String toString() {
        return getnome() + " - " + getSalario();
    }
    
    
}
