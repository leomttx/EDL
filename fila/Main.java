public class Main {
    public static void main(String[] args) {
        TadFila fila = new TadFila(4); // Cria uma fila com capacidade para 5 elementos

        fila.enfileirar("Elemento 1");
        System.out.println("Desenfileirando: " + fila.desenfileirar()); 
        fila.enfileirar("Elemento 2");
        fila.enfileirar("Elemento 3");
        fila.enfileirar("Elemento 4"); 

        System.out.println("Tamanho da fila: " + fila.tamanho()); 
        System.out.println("Tamanho da fila após desenfileirar: " + fila.tamanho()); 
    }
}