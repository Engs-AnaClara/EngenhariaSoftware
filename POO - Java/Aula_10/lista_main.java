public class lista_main {
    
    public static void main(String[] args) {
        int[] array = {0, 10, 15, 20, 25, 30, 35};
    try{

        System.out.println("A lista é: " + java.util.Arrays.toString(array));
        System.out.println("Acessando a posição escolhida:" + array [0]) ;

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Selecione outro número, essa opção não estão disponivel");
    }}

}
