package Comparator;

public class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return nombre + " - " + nota;
    }
}
