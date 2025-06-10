package Interfaces2;

import java.util.Iterator;

public class IteradorPares implements Iterator<Integer> {
    private int actual;
    private int fin;

    public IteradorPares(int inicio, int fin) {
        this.actual = (inicio % 2 == 0) ? inicio : inicio + 1; 
        this.fin = fin;
    }

    public boolean hasNext() {
        return actual <= fin;
    }

    public Integer next() {
        int valor = actual;
        actual += 2; 
        return valor;
    }
}
