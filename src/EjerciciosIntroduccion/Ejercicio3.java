package EjerciciosIntroduccion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<String> nombre = new ArrayList<>();
		nombre.add("Ana");
		nombre.add("Carlos");
		nombre.add("Iker");
		
		System.out.println("For:");
		for (int i = 0; i < nombre.size(); i++) {
			System.out.println(nombre.get(i));
		}
		
		System.out.println("Foreach:");
		for (String nombres : nombre) {
			System.out.println(nombres);
		}
	}
}
