package Comparator;

import java.util.Comparator;

public class EstudianteComparator implements Comparator<Estudiante> {
    public int compare(Estudiante e1, Estudiante e2) {
        int resultado = Double.compare(e2.nota, e1.nota);
        return (resultado != 0) ? resultado : e1.nombre.compareTo(e2.nombre);
    }
}
