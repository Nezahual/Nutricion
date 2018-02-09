/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String nombre;
    private String nombreCompleto;
    private String password;

    
    
    public Usuario(String nombre, String nombreCompleto) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return "";
    }

    public void setPassword(String password) {
        
    }
    
    
    
}
