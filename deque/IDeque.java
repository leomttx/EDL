public interface IDeque {
    boolean vazia(); // Verifica se a deque está vazia

    int tamanho(); // Retorna o número de elementos na deque

    void enfileirarInicio(Object elemento); // Adciona um elemento no início da deque

    void enfileirarFim(Object elemento); // Adciona um elemento no fim da deque

    Object desenfileirarInicio(); // Remove e retorna o elemento do início da deque

    Object desenfileirarFim(); // Remove e retorna o elemento do fim da deque
}