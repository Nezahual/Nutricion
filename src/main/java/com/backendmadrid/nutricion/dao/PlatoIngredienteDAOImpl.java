/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.dao.PlatoIngredienteDAO;
import com.backendmadrid.nutricion.modelo.Ingrediente;
import com.backendmadrid.nutricion.modelo.PlatoIngrediente;
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
public class PlatoIngredienteDAOImpl implements PlatoIngredienteDAO{
    
    private class PlatoIngredienteRowMapper implements RowMapper<PlatoIngrediente>{
        
        @Override
        public PlatoIngrediente mapRow(ResultSet rs, int numRow) throws SQLException{
            return new PlatoIngrediente(
                    new IngredienteRowMapper().mapRow(rs, numRow),
                    rs.getInt("p.id"),
                    rs.getInt("pi.cantidad"));
                        
        }    
    }
    
    @Autowired
    JdbcTemplate jdbc;

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    public List<PlatoIngrediente> obtenerIngredientesPorPlato(int idPlato){
    
        List<PlatoIngrediente> listadoIngredientesEnPlato = null;
        

        String sql = "select p.id,in.*,pi.cantidad "
                + "from platos as p "
                + "join plato_ingrediente as pi "
                + "on(p.id=pi.id_plato) "
                + "join ingredientes as in "
                + "on(pi.idingrediente=in.id) "
                + "where p.id=?";
        
        return listadoIngredientesEnPlato = jdbc.query(sql, new PlatoIngredienteRowMapper());
    }
    
    public void borrarIngredienteDePlato(int idPlato, int idIngrediente){
        
        String sql = "delete from plato_ingrediente where id_plato = ? and id_ingrediente = ?";
        
        jdbc.update(sql, new Object[]{idPlato, idIngrediente});
    }
    
    public void agregarIngredienteAPlato(int idPlato, int idIngrediente, int cantidad){
        
        String sql = "insert into plato_ingrediente (id_plato, id_ingrediente, cantidad) "
                + "values (?, ?, ?)";
    }
}
