package Mapas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {

	public static void main(String[] args) {
        Map<String, List<String>> asignaturas = new HashMap<>();
        asignaturas.put("Matemáticas", Arrays.asList("Ana", "Carlos", "Luis"));
        asignaturas.put("Historia", Arrays.asList("Carlos", "Marta", "Luis"));
        asignaturas.put("Lengua", Arrays.asList("Ana", "Luis", "Pedro"));

        Map<String, Integer> contadorNombres = new HashMap<>();
        for (List<String> nombres : asignaturas.values()) {
            for (String nombre : nombres) {
                contadorNombres.put(nombre, contadorNombres.getOrDefault(nombre, 0) + 1);
            }
        }

        System.out.println("Nombres en varias asignaturas:");
        contadorNombres.forEach((nombre, cantidad) -> {
            if (cantidad > 1) {
                System.out.println(nombre);
            }
        });
    }
}
