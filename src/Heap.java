import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{
    private ArrayList<T> heap;
    public Heap() {
        heap = new ArrayList<>();
    }

    public ArrayList<T> getHeap() {
        return heap;
    }
    public void insertar(T item){
        heap.add(item);
        insertar(heap.size()-1);
    }
    private void insertar(int index) {
        int padre = (index - 1) / 2; // Calcula el índice del padre del elemento en la posición index
        // Intercambia el elemento en la posición index con su padre si es mayor
        while (index > 0 && heap.get(index).compareTo(heap.get(padre)) > 0) {
            intercambio(index, padre);
            index = padre;
            padre = (index - 1) / 2;
        }
    }
    private void intercambio(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
