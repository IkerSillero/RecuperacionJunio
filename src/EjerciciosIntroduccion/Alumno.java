package EjerciciosIntroduccion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Alumno {
	private String nombre;
    private String nia;
    private int edad;

    public Alumno(String nombre, String nia, int edad) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return Objects.equals(nia, alumno.nia);
    }
    
    public int hashCode() {
    	return Objects.hash(nia);
    }
    
    public String toString() {
        return "Alumno{nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "}";
    }

    public static void main(String[] args) {
    	Set<Alumno> dam = new HashSet<>();
    	Alumno a1 = new Alumno("Pep", "222A", 25);
    	Alumno a2 = new Alumno("Sam", "666A", 18);
    	Alumno a3 = new Alumno("Sam", "666A", 18);
    	Alumno a4 = new Alumno("Kal", "666A", 20);
    	
    	dam.add(a1);
    	dam.add(a2);
    	dam.add(a3);
    	dam.add(a4); 
    	
    	dam.add(a1); 
    	dam.add(new Alumno("Sam", "777A", 18)); 
    	
    	System.out.println("Lista de alumnos únicos:");
        for (Alumno alumno : dam) {
            System.out.println(alumno);
        }
    }
}
