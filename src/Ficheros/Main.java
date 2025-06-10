package Ficheros;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "fichero.txt";

        BufferReader.contarPalabras(nombreArchivo);

        ModificarTexto.modificarArchivo(nombreArchivo);

        EliminarPalabra.eliminarPalabra(nombreArchivo, "ejemplo");
    }
}
