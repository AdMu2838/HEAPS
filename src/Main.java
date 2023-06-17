// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PriorityQueueHeap<String> lista = new PriorityQueueHeap<>();
        lista.enqueue("Agustin", 2);
        lista.enqueue("Jorge", 1);
        lista.enqueue("Joel", 3);
        System.out.println("El elemento de mas alta prioridad es: "+ lista.front());
        System.out.println("El elemento de mas baja prioridad es: "+ lista.back());

        // Eliminar elementos de la cola de prioridad y mostrarlos
        System.out.println("Elementos eliminados de la cola de prioridad:");
        while (!lista.isEmpty()) {
            String item = lista.dequeue();
            System.out.println(item);
        }
    }
}