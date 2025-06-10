package Mapas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio2 {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<>();
		productos.put("Manzana", 1.20);
		productos.put("Sandía", 2.30);
		productos.put("Platano", 2.00);

		List<Map.Entry<String, Double>> lista = new ArrayList<>(productos.entrySet());

		lista.sort(Comparator.comparing(Map.Entry::getValue));

		Map<String, Double> ordenado = new LinkedHashMap<>();
		for (Map.Entry<String, Double> entry : lista) {
			ordenado.put(entry.getKey(), entry.getValue());
		}

		ordenado.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
