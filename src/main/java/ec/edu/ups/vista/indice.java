package ec.edu.ups.vista;

import ec.edu.ups.controladorReporte.ControladorMedico;
import ec.edu.ups.modeloCitaMedica.Medico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class indice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //hola dome
        Connection conexion1 = null;
        Medico medico = new Medico(0, 0, null, null);
        ControladorMedico cont= new ControladorMedico();
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
