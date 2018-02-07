/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.dao;

import com.backendmadrid.nutricion.modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public interface UsuarioDAO {
    
    public Usuario autenticar(String username,String password);
}
