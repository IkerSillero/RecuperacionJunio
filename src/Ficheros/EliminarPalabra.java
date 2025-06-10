package Ficheros;

import java.io.*;

public class EliminarPalabra {
    public static void eliminarPalabra(String nombreArchivo, String palabraEliminar) {
        try {
            File archivo = new File(nombreArchivo);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            StringBuilder contenidoModificado = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                linea = linea.replaceAll("\\b" + palabraEliminar + "\\b", "");
                contenidoModificado.append(linea).append("\n");
            }
            br.close();

            String nuevoNombreArchivo = nombreArchivo.replace(".txt", "_2.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoNombreArchivo));
            bw.write(contenidoModificado.toString());
            bw.close();

            System.out.println("El archivo ha sido modificado y guardado como: " + nuevoNombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
        }
    }
}
