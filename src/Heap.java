import java.util.ArrayList;
import java.util.NoSuchElementException;

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

    public T eliminar() {
        if (isEmpty()) {
            throw new NoSuchElementException("El heap está vacío");
        }

        T root = heap.get(0);
        T ultimoItem = heap.remove(heap.size() - 1); // Remueve el último elemento del ArrayList
        if (!isEmpty()) {
            heap.set(0, ultimoItem); // Reemplaza la raíz con el último elemento del heap
            eliminar(0);
        }
        return root; // Retorna el elemento raíz removido
    }

    private void eliminar(int index) {
        int leftHijo = 2 * index + 1;
        int rightHijo = 2 * index + 2;
        int mayor = index;
        // Actualiza el índice del mayor elemento si el hijo izquierdo es mayor
        if (leftHijo < heap.size() && heap.get(leftHijo).compareTo(heap.get(mayor)) > 0) {
            mayor = leftHijo;
        }

        if (rightHijo < heap.size() && heap.get(rightHijo).compareTo(heap.get(mayor)) > 0) {
            mayor = rightHijo; // Actualiza el índice del mayor elemento si el hijo derecho es mayor
        }

        if (mayor != index) {
            intercambio(index, mayor);
            eliminar(mayor); //
        }
    }

    private void intercambio(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    //retorna la raiz del heap
    public T raiz() {
        if (isEmpty()) {
            throw new NoSuchElementException("El heap está vacío");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
