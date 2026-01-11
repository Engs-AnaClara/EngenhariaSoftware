public class Escola_main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Kau");
        p2.setNome("Samara");
        p3.setNome("Ana");
        p4.setNome("Luiz");
        
        p1.setSexo("F");
        p1.setIdade(12);

        p2.setIdade(20);
        p2.CancelarMatricula();

        p3.setEspecialidade("Computaria");
        p3.setSalario(10000);

        p4.setSexo("sim");
        p4.setSetor("Desenvolvimento Projetos");


     



        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        
    }
    
}
