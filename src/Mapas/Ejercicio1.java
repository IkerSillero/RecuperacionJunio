package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<>();
		productos.put("Manzana", 1.20);
		productos.put("Sandía", 2.30);
		productos.put("Platano", 2.00);
		
		System.out.println("Lista de productos y precios:");
		for (Map.Entry<String, Double> entry : productos.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue()+"€");
		}
	}
}
