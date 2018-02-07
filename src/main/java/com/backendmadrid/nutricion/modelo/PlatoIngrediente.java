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
public class PlatoIngrediente extends Ingrediente{
    
    private int idPlato;
    private int idIgrediente;
    private int cantidad;
    
    public PlatoIngrediente(){}
    
    public PlatoIngrediente(Ingrediente ingredienteAux, int idPlato, int idIngrediente, int cantidad){
    
        super(ingredienteAux);
        this.idPlato = idPlato;
        this.idIgrediente = idIngrediente;
        this.cantidad = cantidad;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public int getIdIgrediente() {
        return idIgrediente;
    }

    public void setIdIgrediente(int idIgrediente) {
        this.idIgrediente = idIgrediente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
