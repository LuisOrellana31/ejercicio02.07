/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author Monik
 */

import java.sql.*;

public class Conexion {

    public void conectar() {
        Connection conexion1 = null;
        String user = "root";
        String password = "";
        try {
            // una sola cadena de conexión, en un sólo parámetro se concatena el
            // usuario y el password
            String url1 = "jdbc:mysql://localhost:3306/medico?user=" + user + "&pasword=" + password;
            conexion1 = DriverManager.getConnection(url1);
            if (conexion1 != null) {
                System.out.println("Conexión 1: Conexión a mibase satisfacoria");
            }
        } catch (SQLException e) {
            System.out.println(
                    "Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
            e.printStackTrace();
        }
    }

}
