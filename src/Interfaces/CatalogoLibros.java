package Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLibros implements Iterable<Libro> {

	private List<Libro> libros;

    public CatalogoLibros() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Iterator<Libro> iterator() {
        return libros.iterator();
    }
}

class CatalogoFiltrado implements Iterable<Libro> {
    private List<Libro> libros;

    public CatalogoFiltrado(List<Libro> libros) {
        this.libros = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAñoPublicacion() > 2000) {
                this.libros.add(libro);
            }
        }
    }

    public Iterator<Libro> iterator() {
        return libros.iterator();
    }
}
