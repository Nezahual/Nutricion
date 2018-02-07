/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Ingrediente;
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
public class IngredienteDAOImpl {
    
    
    
    @Autowired
    private JdbcTemplate jdbc;

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    private  class IngredienteRowMapper implements RowMapper<Ingrediente>{
        
        @Override
        public  Ingrediente mapRow(ResultSet rs, int numRow) throws SQLException{
            return new Ingrediente(
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        rs.getDouble("agua"),
                        rs.getInt("energia"),
                        rs.getDouble("proteinas"),
                        rs.getDouble("grasas"),
                        rs.getDouble("carbohidratos"),
                        rs.getDouble("fibra"),
                        rs.getDouble("azucar"),
                        rs.getInt("calcio"),
                        rs.getDouble("hierro"),
                        rs.getDouble("magnesio"),
                        rs.getInt("fosforo"),
                        rs.getInt("potasio"),
                        rs.getInt("sodio"),
                        rs.getDouble("vitamina_c"),
                        rs.getDouble("vitamina_b12"),
                        rs.getInt("vitamina_a"),
                        rs.getDouble("vitamina_e"),
                        rs.getDouble("vitamina_d"),
                        rs.getDouble("grasas_saturadas"),
                        rs.getDouble("grasas_mono"),
                        rs.getDouble("grasas_poli"),
                        rs.getInt("colesterol")
                        );
        }    
    }
    
    public List<Ingrediente> listar() {

        String sql = "select * from ingredientes order by id asc";

        List<Ingrediente> l = jdbc.query(sql, new IngredienteDAOImpl.IngredienteRowMapper());

        return l;
    }

    public Ingrediente buscarPorId(int id) {
        String sql = "select * from ingredientes where id=?";

        Ingrediente i = jdbc.queryForObject(sql, new Object[]{id}, new IngredienteDAOImpl.IngredienteRowMapper());
        return i;
    }
}
