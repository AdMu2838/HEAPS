public class PrioridadItem <E extends Comparable<E>> implements Comparable<PrioridadItem<E>>{
    private E item;
    private int prioridad;

    public PrioridadItem(E item, int prioridad) {
        this.item = item;
        this.prioridad = prioridad;
    }

    public E getItem() {
        return item;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(PrioridadItem<E> pItem) {
        return Integer.compare(pItem.getPrioridad(), prioridad);
    }
}
