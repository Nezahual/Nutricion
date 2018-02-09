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
public class ProductoCarrito extends Producto{
    private int unidades;

    public ProductoCarrito(){
        
    }
    
    public ProductoCarrito(Producto p,int unidades){
        super(p);
        this.unidades=unidades;
    }
    
    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
}
