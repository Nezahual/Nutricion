/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Producto implements Serializable{
    public static final long serialVersionUID=1L;
    
    private int id;
    private String nombre;
    private String director;
    private int anyoproduccion;
    //private boolean oferta;

    public Producto(){
        
    }
    
    public Producto(Producto p){ // Constructor de copia
        id = p.id;
        nombre = p.nombre;
        director = p.director;
        anyoproduccion = p.anyoproduccion;
    }
    
    public Producto(int id, String nombre, String director, int anyoproduccion) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.anyoproduccion = anyoproduccion;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyoProduccion() {
        return anyoproduccion;
    }

    public void setAnyoProduccion(int anyoproduccion) {
        this.anyoproduccion = anyoproduccion;
    }

    

    
}
