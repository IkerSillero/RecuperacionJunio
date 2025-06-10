package Comparator;

public class Alumnos {

	String nombre;
    double nota;

    public Alumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return nombre + " - " + nota;
    }
}
