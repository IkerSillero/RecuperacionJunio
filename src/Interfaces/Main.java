package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoLibros catalogo = new CatalogoLibros();

        catalogo.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        catalogo.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", 2003));
        catalogo.agregarLibro(new Libro("Sapiens", "Yuval Noah Harari", 2011));
        catalogo.agregarLibro(new Libro("El nombre del viento", "Patrick Rothfuss", 2007));

        System.out.println("Todos los libros del catálogo:");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }

        List<Libro> listaLibros = new ArrayList<>();
        for (Libro libro : catalogo) {
            listaLibros.add(libro);
        }

        CatalogoFiltrado catalogoFiltrado = new CatalogoFiltrado(listaLibros);
        System.out.println("\nLibros publicados después del año 2000:");
        for (Libro libro : catalogoFiltrado) {
            System.out.println(libro);
        }
    }
}
