package Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Pelota");
		palabras.add("Mañana");
		palabras.add("Persona");
		palabras.add("Java");
		palabras.add("Iterator");
		
		Iterator<String> PalabrasIterator = palabras.iterator();
		while (PalabrasIterator.hasNext()) {
			System.out.println(PalabrasIterator.next().toUpperCase());
		}
	}
}
