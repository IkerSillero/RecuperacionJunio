package EjemploInterfaceComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        lista.add(new Alumno("Carlos", "001", 20));
        lista.add(new Alumno("Ana", "002", 22));
        lista.add(new Docente("Miguel", 10, 2500.0));
        lista.add(new Docente("Beatriz", 5, 2200.0));

        System.out.println("Lista antes de ordenar:");
        for (Object obj : lista) {
            if (obj instanceof Alumno) {
                System.out.println("Alumno: " + ((Alumno) obj).getNombre());
            } else if (obj instanceof Docente) {
                System.out.println("Docente: " + ((Docente) obj).getNombre());
            }
        }

        Collections.sort(lista, new NombreComparator());

        System.out.println("Lista después de ordenar:");
        for (Object obj : lista) {
            if (obj instanceof Alumno) {
                System.out.println("Alumno: " + ((Alumno) obj).getNombre());
            } else if (obj instanceof Docente) {
                System.out.println("Docente: " + ((Docente) obj).getNombre());
            }
        }
    }
}
