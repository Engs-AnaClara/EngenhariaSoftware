public class idade {
    public static void main(String[] args) {
        validador validator = new validador();
        int idadeInformada = 18;
        try {
            validator.Invalida(idadeInformada);
            System.out.println("A minha idade é " + idadeInformada);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bem vindos ao Campo Bar! ");
        }
    }
}
