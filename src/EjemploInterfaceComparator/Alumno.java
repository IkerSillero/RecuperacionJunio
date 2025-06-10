package EjemploInterfaceComparator;

public class Alumno {

    private String nombre;
    private String nia;
    private int edad;

    public Alumno(String nombre, String nia, int edad) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNia() {
        return nia;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
