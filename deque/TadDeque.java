// TAD DEQUE USANDO ARRAY CIRCULAR

public class TadDeque {
    public  Object[] deque;
    public  int inicio;
    private int fim;
    private int tamanho;
    public  int capacidade;

    public TadDeque(int capacidade) {
        this.deque = new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public boolean vazia() {
        return tamanho == 0; // Retorna true se a deque estiver vazia, caso contrário, retorna false
    }

    public int tamanho() {
        return tamanho; // Retorna o número de elementos na deque
    }

    public void enfileirarInicio(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Deque cheia");
        }
        inicio = (inicio - 1 + capacidade) % capacidade; // Move o índice do início para a posição anterior usando arrar circular
        System.out.println("O que é inicio antes de usar o array circular: " + inicio);
        deque[inicio] = elemento; // Adiciona o elemento na posição do início
        tamanho++; // Incrementa o tamanho da deque
    }

    public void enfileirarFim(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Deque cheia");
        }
        deque[fim] = elemento; // aiciona o elemento na posição do fim
        fim = (fim + 1) % capacidade; // Move o índice do fim para a próxima posição usando array circular
        tamanho++; // Incrementa o tamnanho da deque
    }

    public Object desenfileirarInicio() {
        if (vazia()) {
            throw new IllegalStateException("Deque vazia");
        }
        Object elemento = deque[inicio]; // Obtém o elemento na posição do início
        deque[inicio] = null; // Limpa a posição do início para evitar vazamento
        inicio = (inicio + 1) % capacidade; // Move o índice do início para a próxima posição usando array circular
        tamanho--; // Decrementa o tamanho da deque
        return elemento; // Retorna o elemento desenfileirado
    }

    public Object desenfileirarFim() {
        if (vazia()) {
            throw new IllegalStateException("Deque vazia");
        }
        fim = (fim - 1 + capacidade) % capacidade; // Move o índice do fim para a posição anterior usando o array circular
        Object elemento = deque[fim]; // Obtém o elemento na posição do fim
        deque[fim] = null; // Limpa a posição do fim para evitar vazamento
        tamanho--; // Decrementa o tamanho da deque
        return elemento; // Retorna o elemento desenfileirado
    }
}