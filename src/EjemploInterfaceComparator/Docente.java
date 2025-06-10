package EjemploInterfaceComparator;

public class Docente {

    private String nombre;
    private int permanencia;
    private double salario;

    public Docente(String nombre, int permanencia, double salario) {
        this.nombre = nombre;
        this.permanencia = permanencia;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
