/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Plato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author USUARIO
 */
public class PlatoDAOImpl implements PlatoDAO {
    
    
    
    @Autowired
    JdbcTemplate jdbc;

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    

    private  class PlatoRowMapper implements RowMapper<Plato>{
        
        @Override
        public  Plato mapRow(ResultSet rs, int numRow) throws SQLException{
            return new Plato(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getString("autor")
                        );
        }    
    }
    
    public void crearPlato(Plato p){
        
        String sql="insert into plato("
                + "nombre,"
                + "descripcion,"
                + "autor)"
                + "values "
                + "(?,?,?)";
        
        
        int n=jdbc.update(sql,new Object[]{
            p.getNombre(),
            p.getDescripcion(),
            p.getAutor()
        });    
    }
    
    public List<Plato> listar() {

        String sql = "select * from plato order by nombre asc";

        
        List<Plato> listaDePlato = jdbc.query(sql, new PlatoRowMapper());

        return listaDePlato;
    }
    
     public List<Plato> listarPlatoPorAutor(String autor) {

        String sql = "select * from plato where autor=?";

        
        List<Plato> listaDePlatoAutor = jdbc.query(sql, new PlatoRowMapper());

        return listaDePlatoAutor;
    }

    public Plato buscarPorNombre(String nombre) {
        String sql = "select * from plato where nombre=?";
        
        Plato p = jdbc.queryForObject(sql, new Object[]{nombre}, new PlatoRowMapper());
        return p;
    }
    
    public void editar(Plato p) {
        String sql = "update plato set nombre=?,descripcion=?,autor=? where id=?";
        
        jdbc.update(sql, new Object[]{p.getNombre(),p.getDescripcion(),p.getAutor(),p.getId()});
  
    }
    
    public void borrar(int id){
        String sql="delete from plato where id=?";
        
        jdbc.execute(sql);
    }
    
}
