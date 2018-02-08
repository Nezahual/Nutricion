/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.modelo;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    private String username;
    private String nombreCompleto;
    private String password;

    public Usuario() {
    }

    public Usuario(String username, String nombreCompleto, String password) {
        this.username = username;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }
    
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
