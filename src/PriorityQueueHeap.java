import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PriorityQueueHeap<T extends Comparable<T>>{
    private Heap<PrioridadItem<T>> heap;
    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

    public void enqueue(T item, int prioridad) {
        PrioridadItem<T> pItem = new PrioridadItem<>(item, prioridad);
        heap.insertar(pItem);
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public T front() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola de prioridad está vacía");
        }
        return heap.raiz().getItem();
    }

    public T back() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola de prioridad está vacía");
        }
        ArrayList<PrioridadItem<T>> items = heap.getHeap();
        return items.get(items.size() - 1).getItem();
    }
}
