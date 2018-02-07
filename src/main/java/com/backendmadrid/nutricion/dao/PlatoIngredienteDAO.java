/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.PlatoIngrediente;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface PlatoIngredienteDAO {
    public List<PlatoIngrediente> obtenerIngredientesPorPlato(int idPlato);
    public void borrarIngredienteDePlato(int idPlato, int idIngrediente);
    public void agregarIngredienteAPlato(int idPlato, int idIngrediente, int cantidad);
}
