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
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author USUARIO
 */
public class PlatoDAOImpl implements PlatoDAO {
    
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbc;

    public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
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
    
    public void create(Plato p){
        
        String sql="insert into plato("
                + "nombre,"
                + "descripcion,"
                + "autor)"
                + "values "
                + "(?,?,?)";
        
        jdbc=new JdbcTemplate(dataSource);
        int n=jdbc.update(sql,new Object[]{
            p.getNombre(),
            p.getDescripcion(),
            p.getAutor()
        });    
    }
    
    public List<Plato> listar() {

        String sql = "select * from plato order by nombre asc";

        jdbc = new JdbcTemplate(dataSource);
        List<Plato> l = jdbc.query(sql, new PlatoRowMapper());

        return l;
    }

    public Plato buscar(String nombre) {
        String sql = "select * from plato where nombre=?";
        jdbc = new JdbcTemplate(dataSource);
        Plato p = jdbc.queryForObject(sql, new Object[]{nombre}, new PlatoRowMapper());
        return p;
    }
    
    public void editar(Plato p) {
        String sql = "update plato set nombre=?,descripcion=?,autor=? where id=?";
        jdbc = new JdbcTemplate(dataSource);
        jdbc.update(sql, new Object[]{p.getNombre(),p.getDescripcion(),p.getAutor(),p.getId()});
  
    }
    
}
