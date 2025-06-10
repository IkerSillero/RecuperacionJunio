package Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("Pelota");
		palabras.add("Mañana");
		palabras.add("Persona");
		palabras.add("Java");
		palabras.add("Iterator");
		palabras.add("Ejemplo");
		
		Iterator<String> PalabrasIterator = palabras.iterator();
		while (PalabrasIterator.hasNext()) {
			String palabra = PalabrasIterator.next();
			char primeraLetra = Character.toLowerCase(palabra.charAt(0));
			if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u') {
                PalabrasIterator.remove();
            }
		}
		
		System.out.println("Lista de palabras después de eliminar las que empiezan por vocal: "+palabras);
	}
}
