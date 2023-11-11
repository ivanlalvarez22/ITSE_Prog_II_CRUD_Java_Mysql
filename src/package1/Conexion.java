package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/alumnos_itse";
        String usuario = "root";
        String contrasenia = "220294";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            return conexion;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
