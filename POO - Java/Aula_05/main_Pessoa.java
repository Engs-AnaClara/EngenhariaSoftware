import java.util.Scanner;

public class main_Pessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade);


        System.out.println("\nDados cadastrados:");
        System.out.println("Nome: " + pessoa.getnome());
        System.out.println("Idade: " + pessoa.getidade() + " anos");

        scanner.close(); 
    }
}