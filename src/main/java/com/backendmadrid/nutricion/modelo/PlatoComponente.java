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
public class PlatoComponente {
    
    private String idPlato;
    private String idComponente;

    public PlatoComponente() {
    }

    public PlatoComponente(String idPlato, String idComponente) {
        this.idPlato = idPlato;
        this.idComponente = idComponente;
    }

    public String getIdPlato() {
        return idPlato;
    }

    public String getIdComponente() {
        return idComponente;
    }

    public void setIdPlato(String idPlato) {
        this.idPlato = idPlato;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
    }
    
    
}
