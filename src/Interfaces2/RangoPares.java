package Interfaces2;

import java.util.Iterator;

public class RangoPares implements Iterable<Integer> {
    private int inicio;
    private int fin;

    public RangoPares(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Iterator<Integer> iterator() {
        return new IteradorPares(inicio, fin);
    }
}
