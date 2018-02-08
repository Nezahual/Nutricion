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
    
    public List<Ingrediente> listarIngredientes() {

        String sql = "select * from ingredientes order by id asc";

        List<Ingrediente> listaDeIngredientes = jdbc.query(sql, new IngredienteRowMapper());

        return listaDeIngredientes;
    }

    public Ingrediente buscarPorDescripcion(String descripcion) {
        String sql = "select * from ingredientes where descripcion=?";

        Ingrediente i = jdbc.queryForObject(sql, new Object[]{descripcion}, new IngredienteRowMapper());
        return i;
    }
}
