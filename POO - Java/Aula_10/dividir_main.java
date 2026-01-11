public class dividir_main {

    public static void main(String[] args){
        int A = 12;
        int B = 0;

        dividir calculadora = new dividir();

    try{
        int resultado = calculadora.dividindo(12,2);
        System.out.println("O resultado foi " + resultado);
    }catch (IdadeInvalidaException e){
        System.out.println("A equação não pode ser dividida por 0");

    }
    }
}