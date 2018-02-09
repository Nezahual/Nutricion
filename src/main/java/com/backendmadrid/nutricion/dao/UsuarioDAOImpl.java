/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author USUARIO
 */
public class UsuarioDAOImpl implements UsuarioDAO{
    
    private  class UsuarioRowMapper implements RowMapper<Usuario>{
        
        @Override
        public  Usuario mapRow(ResultSet rs, int numRow) throws SQLException{
            return new Usuario(
                        rs.getString("username"),
                        rs.getString("nombreCompleto"),
                        rs.getString("password")
                        );
        }    
    }
    
    
    @Autowired
    JdbcTemplate jdbc;


    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    public Boolean autenticar(Usuario u,String password){
        
        String sql="select nombre_completo from usuarios where username=? and password=?";
        boolean r=false;
        
        Usuario v=jdbc.queryForObject(sql, new Object[]{u.getUsername(),password}, new UsuarioRowMapper());
        if(v!=null){
            u.setUsername(v.getUsername());
            r=true;
        }
        
        return r;
   
    }
    
}
