package Atividades2;

public class Empresa_Main {

    public static void main(String[] args){

    Departamento TI = new Departamento();
    Departamento RH = new Departamento();

    Funcionario f1 = new Funcionario("João", 500, TI);
    Funcionario f2 = new Funcionario( "Beatriz", 1000, TI);
    Funcionario f3 = new Funcionario("Paulo", 650, RH);

    System.out.println("Funcionário 1: " + f1);
    System.out.println("Funcionário 2: " + f2);
    System.out.println("Funcionário 3: " + f3);

    TI.adicionarFuncionario(f1);
    RH.adicionarFuncionario(f2);
    TI.adicionarFuncionario(f3);
        
    
    TI.listarFuncionarios();
    RH.listarFuncionarios();
    
    System.out.println(listarFuncionario);
}

}
