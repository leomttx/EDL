// TAD FILA USANDO ARRAY CIRCULAR


public class TadFila implements IFila {
    private Object[] fila;
    private int inicio;
    private int fim;
    private int tamanho;


    public TadFila(int capacidade) { // Construtor para inicializar a fila com uma capacidade específica
        this.fila = new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0; // Retorna true se a fila estiver vazia, caso contrário, retorna false
    }

    @Override
    public int tamanho() {
        return tamanho; // Retorna o número de elementos na fila
    }


    @Override // O override indica que este método está sobrescrevendo um método da interface Ifila
    public void enfileirar(Object elemento) {
        if (tamanho == fila.length) {
            throw new IllegalStateException("Fila cheia");
        }
        fila[fim] = elemento; // Adiciona o elemento na posição do fim
        // System.out.println("O que é fim antes de usar o array circular: " + fim);
        fim = (fim + 1) % fila.length; // Move o índice do fim para a próxima posição usando array circular
        // System.out.println("O que é fim após usar o array circular: " + fim);
        tamanho++; // Incrementa o tamanho da fila
        System.out.println(fim); // Imprime o valor do índice do fim para depuração
    }

    @Override
    public Object desenfileirar() {
        if (vazia()) {
            throw new EFilaVazia("Fila vazia");
        }
        Object elemento = fila[inicio]; // Obtém o elemento na posição do início
        fila[inicio] = null; // Limpa a posição do início para evitar vazamento
        inicio = (inicio + 1) % fila.length; // Move o índice do início para a próxima posição usando array circular
        tamanho--; // Decrementa o tamanho da fila
        return elemento; // Retorna o elemento desenfileirado   
    }
}