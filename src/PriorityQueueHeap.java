public class PriorityQueueHeap<T extends Comparable<T>>{
    private Heap<PrioridadItem<T>> heap;
    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

    public void enqueue(T item, int prioridad) {
        PrioridadItem<T> itemPriority = new PrioridadItem<>(item, prioridad);
        heap.insertar(itemPriority);
    }
}
