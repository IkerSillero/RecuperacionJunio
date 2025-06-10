package EjercicioInventarioMap;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

	private Map<String, Integer> inventario;

	public Inventario() {
		this.inventario = new HashMap<>();
	}

	public void agregarProducto(String nombre, int cantidad) {
		inventario.put(nombre, cantidad);
	}

	public void actualizarStock(String nombre, int cantidad) {
		if (inventario.containsKey(nombre)) {
			inventario.put(nombre, inventario.get(nombre) + cantidad);
		} else {
			System.out.println("El producto no existe en el inventario.");
		}
	}

	public int obtenerCantidad(String nombre) {
		return inventario.getOrDefault(nombre, 0);
	}

	public void mostrarStockTotal() {
		System.out.println("Inventario total:");
		for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
		}
	}

	public void eliminarProducto(String nombre) {
		inventario.remove(nombre);
	}

	public String productoMayorStock() {
		String productoMax = null;
		int maxCantidad = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
			if (entry.getValue() > maxCantidad) {
				maxCantidad = entry.getValue();
				productoMax = entry.getKey();
			}
		}
		return productoMax != null ? productoMax + " con " + maxCantidad + " unidades" : "Inventario vacío";
	}

	public static void main(String[] args) {
		Inventario inventario = new Inventario();

		inventario.agregarProducto("Portatil", 10);
		inventario.agregarProducto("Teléfono", 20);
		inventario.actualizarStock("Portatil", -2);
		System.out.println("Cantidad de Portatiles: " + inventario.obtenerCantidad("Portatil"));
		inventario.mostrarStockTotal();
		System.out.println("Producto con mayor stock: " + inventario.productoMayorStock());
		inventario.eliminarProducto("Teléfono");
		inventario.mostrarStockTotal();
	}
}
