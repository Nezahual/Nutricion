/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Ingrediente;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface IngredienteDAO {
    
    public List<Ingrediente> listar();
    
    public Ingrediente buscarId(int id);
}
