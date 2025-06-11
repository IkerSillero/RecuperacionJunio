package Modularizar;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Citas {
    private Connection conn;

    public Citas(Connection conn) {
        this.conn = conn;
    }

    public void insertarCitas(String nombre, String descripcion, LocalDateTime fecha) throws SQLException {
        String sql = "INSERT INTO citas (nombre, descripcion, fecha) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setTimestamp(3, Timestamp.valueOf(fecha));
            stmt.executeUpdate();
            System.out.println("Cita insertada con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al insertar la cita: " + e.getMessage());
        }
    }

    public List<String> consultarCitas(LocalDateTime desdeFecha) throws SQLException {
        String sql = "SELECT * FROM citas WHERE fecha >= ? ORDER BY fecha";
        List<String> resultados = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(desdeFecha));
            ResultSet rs = stmt.executeQuery();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                Timestamp fecha = rs.getTimestamp("fecha");

                String cita = String.format("Nombre: %s, Descripción: %s, Fecha: %s",
                        nombre, descripcion, fecha.toLocalDateTime().format(formatter));
                resultados.add(cita);
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar citas: " + e.getMessage());
        }
        
        return resultados;
    }
}
