package BaseDatos.Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBaseDeDatos {
        public void obtenerEstudiantes() {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea", "root", "admin");

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");
                while (rs.next()) {
                    System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
                }
                con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void obtenerEstudiantesNombres() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");
            while (rs.next()) {
                System.out.println(rs.getString("nombres"));
            }
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void obtenerEstudiantesApellidos() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");
            while (rs.next()) {
                System.out.println(rs.getString("apellidos"));
            }
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void obtenerEstudiantesPorApellido (String apellido){
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea", "root", "admin");

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes WHERE apellidos = '" + apellido + "'");
                while (rs.next()) {
                    System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
                }
                con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void obtenerEstudiantesPorNombre (String nombre){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tarea", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes WHERE nombres = '" + nombre + "'");
            while (rs.next()) {
                System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }


