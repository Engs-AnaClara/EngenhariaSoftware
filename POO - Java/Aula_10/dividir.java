public class dividir {

    public int A;
    public int B;

    public int dividindo(int A, int B) throws IdadeInvalidaException{
        if (B ==0 ) {
            throw new IdadeInvalidaException("A equação não pode ser dividida por 0");
        }
    return A/B;
    }
}

/*Implemente um método dividir(int a, int b) que:
• Retorne a divisão normalmente.
• Lance uma exceção customizada DivisaoPorZeroException
(também extende de Exception) quando b == 0./* */