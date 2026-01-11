public class atv1 {
    public static void main(String[] args){
        // Criando um array com 5 elementos (índices 0 a 4)
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Array criado: " + java.util.Arrays.toString(array));
        System.out.println("Tamanho do array: " + array.length);
        System.out.println();
        
        // Tentando acessar um índice válido
        try {
            System.out.println("Acessando índice 2 (válido): " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        // Tentando acessar um índice inválido (fora dos limites)
        try {
            System.out.println("Tentando acessar índice 10 (inválido): " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException capturada!");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("O índice 10 está fora dos limites do array (0 a " + (array.length - 1) + ")");
        }
        
        System.out.println();
        System.out.println("Programa continuou executando normalmente após capturar a exceção!");
    }
}
