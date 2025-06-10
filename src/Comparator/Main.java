package Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Estudiante> estudiantes = new TreeSet<>(new EstudianteComparator());

        estudiantes.add(new Estudiante("Ana", 8.5));
        estudiantes.add(new Estudiante("Francisco", 9.2));
        estudiantes.add(new Estudiante("Maria", 8.5));
        estudiantes.add(new Estudiante("Elena", 7.9));

        estudiantes.forEach(System.out::println);
    }
}
