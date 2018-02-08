/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Plato;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface PlatoDAO {
    
    public void crearPlato(Plato p);
    
    public List<Plato> listar();
    
    public Plato buscarPorNombre(String nombre);
    
    public void editar(Plato p);
    
    public void borrar(int id);
    public List<Plato> listarPlatoPorAutor(String autor);
    
}
