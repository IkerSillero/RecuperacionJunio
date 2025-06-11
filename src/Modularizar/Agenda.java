package Modularizar;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class Agenda {
	private static final String URL = "jdbc:mysql://localhost:3306/modularizar?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "Ikersm_8";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa.");

            Citas citas = new Citas(conn);

            citas.insertarCitas("Maria Gonzalez", "Dentista", LocalDateTime.of(2025, 6, 14, 16, 0));

            List<String> listaCitas = citas.consultarCitas(LocalDateTime.of(2025, 6, 12, 0, 0));

            for (String cita : listaCitas) {
                System.out.println(cita);
            }

        } catch (SQLException e) {
            System.err.println("Error de conexión con la base de datos.");
            e.printStackTrace();
        }
    }
}
