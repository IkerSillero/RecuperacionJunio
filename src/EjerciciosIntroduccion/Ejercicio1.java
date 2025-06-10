package EjerciciosIntroduccion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			lista.add(i);
		}

		System.out.println("Lista de enteros: " + lista);
	}
}
