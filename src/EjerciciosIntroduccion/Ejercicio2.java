package EjerciciosIntroduccion;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		Set<String> nombre = new HashSet<>();
		nombre.add("Ana");
		nombre.add("Iker");
		nombre.add("Ana");
		
		System.out.println(nombre.size());
	}
}
