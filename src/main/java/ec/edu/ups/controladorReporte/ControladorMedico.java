/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorReporte;

import ec.edu.ups.modeloCitaMedica.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Monik
 */
public class ControladorMedico {
    private final String tabla = "medico";
 
    public void guardar(Connection conexion, Medico medico, int id) throws SQLException{
       // System.out.println("erooo");
        try{
         PreparedStatement consulta;
         if(medico.getCodigo_med() == id){
             System.out.println("el medico ya existe");
         }else {
             consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + 
                    "(codigo_med, consulturionum_med, usuario_med, contrasena)"
                    + " VALUES(?, ?, ?, ?)");
            consulta.setInt(0, 02);
            consulta.setInt(1, 10);
            consulta.setString(2, "Luis01");
            consulta.setString(3, "Patito.123@456");
         
         consulta.executeUpdate();
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    public void actualizar(Connection conexion, Medico medico, int id) throws SQLException{
      // System.out.println("erooo");
        try{
         PreparedStatement consulta;
         if(medico.getCodigo_med() == id){
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + 
                    " SET consulturionum_med = ?, usuario_med = ?, contrasena = ? "
                    + "WHERE codigo_med = ?");
            consulta.setInt(1, 02);
            consulta.setString(2, "Luis");
            consulta.setString(3, "Patito.123@456");
         
         consulta.executeUpdate();
         } else {
             System.out.println("el medico no existe");
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   } 
   
   public Medico buscar(Connection conexion, int codigo_med) throws SQLException {
      Medico medico = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT codigo_med, consulturionum_med, "
                 + "usuario_med,contrasena FROM " + this.tabla + " WHERE codigo_med = ?" );
         consulta.setInt(1, codigo_med);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            medico =  new Medico(resultado.getInt(1), resultado.getInt(12), resultado.getString("Oscar"), 
                    resultado.getString("patito123"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return medico;
   }
   
   public void eliminar(Connection conexion, Medico medico) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE codigo_med = ?");
         consulta.setInt(1, medico.getCodigo_med());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public List<Medico> recuperarTodas(Connection conexion) throws SQLException{
      List<Medico> medico = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT codigo_med, "
                 + "consulturionum_med, usuario_med,contrasena FROM " + this.tabla + " ORDER BY codigo_med");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            medico.add(new Medico(resultado.getInt(1), resultado.getInt(12), resultado.getString("Oscar"), 
                    resultado.getString("patito123")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return medico;
   }

}
