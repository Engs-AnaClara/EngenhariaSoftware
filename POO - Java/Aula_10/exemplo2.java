public class exemplo2 {
    int idadeMinima = 18;

    public void invalida(int idade) throws IdadeInvalidaException {
        if (idade < idadeMinima) {
            throw new IdadeInvalidaException("Não são permitidos menores de 18");
        }
    }
}
