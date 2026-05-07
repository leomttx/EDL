public class EFilaVazia extends RuntimeException {
    public EFilaVazia(String err) {
        super(err); // Chama o construtor da classe RuntimeException para definir a mensagem de erro
    }
}