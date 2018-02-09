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
import java.util.ArrayList;
import modelos.Producto;

/**
 *
 * @author USUARIO
 */
public class ProductoDAO {
    
    
    
    public void insertar(Producto p){
        Connection con=Db.getConexion();
        String sql="insert into pelicula (titulo,director,anyoproduccion) values (?,?,?)";
        try(PreparedStatement ps=con.prepareStatement(sql);){
            ps.setString(1,p.getNombre());
            ps.setString(2,p.getDirector());
            ps.setInt(3,p.getAnyoProduccion());
            ps.execute(); 
        }
        catch(SQLException sqle){
                sqle.printStackTrace();
        }
    }
    
    public Producto cargar(int id){
        Connection con=Db.getConexion();
        Producto p=null;
        
        String sql="select * from pelicula where id=?";
        try(PreparedStatement ps=con.prepareStatement(sql);){
            ps.setInt(1,id);
            
            ps.execute();
            ResultSet rs=ps.getResultSet();
            if(rs.next()){
                p=new Producto(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("director"),
                        rs.getInt("anyoproduccion")
                       
                );
            }
        }
        catch(SQLException sqle){
                sqle.printStackTrace();
        }
        
        return p;
    }
    
    
    public ArrayList<Producto> buscar(String texto){
        Connection con=Db.getConexion();
        ArrayList<Producto> l=new ArrayList<Producto>();
        
        String sql="select * from pelicula where nombre like ?";
        try(PreparedStatement ps=con.prepareStatement(sql);){
            ps.setString(1,"%"+texto+"%");
            ps.execute();
            ResultSet rs=ps.getResultSet();
            while(rs.next()){
                Producto p=new Producto(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("director"),
                        rs.getInt("anyoproduccion")
                        
                );
                l.add(p);
            }
            
        }
         catch(SQLException sqle){
                sqle.printStackTrace();
        }
        return l;
    }
}
