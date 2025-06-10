package Ficheros;

import java.io.*;

public class ModificarTexto {
    public static void modificarArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            StringBuilder contenidoModificado = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].isEmpty()) {
                        palabras[i] = Character.toUpperCase(palabras[i].charAt(0)) + palabras[i].substring(1);
                    }
                }
                contenidoModificado.append(String.join(" ", palabras)).append("\n");
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            bw.write(contenidoModificado.toString());
            bw.close();

            System.out.println("El archivo ha sido modificado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
        }
    }
}
