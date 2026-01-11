public class validador {
    int Idademin = 17;
    public void Invalida(int idade) throws IdadeInvalidaException {
            if(idade <= Idademin){
                throw new IdadeInvalidaException("Não são permitidos menores de 18");
            }
        }
    }