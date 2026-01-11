package Atividades2;

import java.util.ArrayList;

public class Departamento {
    private String Nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
}
    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
}

    public void listarFuncionario(){
        ArrayList<Forma> formas = new ArrayList<>();

        System.out.println("Departamento: " + nome);
        System.out.println(funcionarios);
        }


}
