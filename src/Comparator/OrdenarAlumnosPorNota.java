package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenarAlumnosPorNota {

	public static void main(String[] args) {
        List<Alumnos> alumnos = Arrays.asList(new Alumnos("Ana", 8.5), new Alumnos("Francisco", 9.2), new Alumnos("Maria", 8.5), new Alumnos("Elena", 7.9));

        alumnos.sort(Comparator.comparingDouble((Alumnos a) -> a.nota).reversed().thenComparing(a -> a.nombre));

        alumnos.forEach(System.out::println);
    }
}
