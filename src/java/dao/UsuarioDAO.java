/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Usuario;

/**
 *
 * @author USUARIO
 */
public class UsuarioDAO {
    
    public Usuario cargar(String nombre,String password){
        Usuario u=null;
        
         Connection con=Db.getConexion();
         
         String sql="select nombrecompleto from usuario where nombre=? and password=?";
         
         try(PreparedStatement ps=con.prepareStatement(sql)){
             ps.setString(1,nombre);
             ps.setString(2, password);
             
             ps.execute();
             
             ResultSet rs=ps.getResultSet();
             if(rs.next()){
                 System.out.println("Iniciado_sesion");
                 u=new Usuario(nombre,rs.getString("nombrecompleto"));
             }
             rs.close();
         }
        catch(SQLException sqle){
                sqle.printStackTrace();
        }
        
        return u;
    }
}
