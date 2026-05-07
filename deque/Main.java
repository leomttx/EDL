public class Main {
    public static void main(String[] args) {
        TadDeque deque = new TadDeque(4);
        deque.enfileirarInicio("A");
        deque.enfileirarInicio("B");
        deque.enfileirarInicio("C");

        System.out.println("Tamanho da deque: " + deque.tamanho());
        System.out.println("A deque está vazia? " + deque.vazia());

        // //Mostrando como está a deque após as operações
        // for(int i = 0; i < deque.tamanho(); i++) {
        //     System.out.println("Elemento na posição " + i + ": " + deque.deque[(deque.inicio + i) % deque.capacidade]);
        // }
    }
}