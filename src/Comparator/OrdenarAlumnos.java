package Comparator;

import java.util.*;

class Alumno {
	
	String nombre;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return nombre;
		}
}

public class OrdenarAlumnos {
	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(new Alumno("Ana"), new Alumno("Francisco"), new Alumno("Maria"), new Alumno("Elena"));

		alumnos.sort(Comparator.comparingInt(a -> a.nombre.length()));

		alumnos.forEach(System.out::println);
	}
}
