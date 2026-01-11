public class Funcionario_main {
    public static void main (String[] args) {
        Funcionario F1 = new Funcionario("Julia", 10000);
       
        Gerente G1 = new Gerente();

        System.out.println("O funcionário " );
                
        System.out.println("Nome: " + G1.this.nome());
        System.out.println("Salário: " + G1.this.salario()); 
        System.out.println("Setor: " + G1.this.setor());
    }

}
