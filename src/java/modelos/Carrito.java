/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author USUARIO
 */
public class Carrito {
    private HashMap<Integer,ProductoCarrito> productos=new HashMap<Integer,ProductoCarrito>();
    
    public Carrito(){
        
    }
    
    public void add(ProductoCarrito p){
       
        if(productos.containsKey(p.getId())){
            ProductoCarrito productoEnCarrito=productos.get(p.getId());
            productoEnCarrito.setUnidades(productoEnCarrito.getUnidades()+p.getUnidades());
        }
        else{
            productos.put(p.getId(), p);
        }
    }
    
    public void remove(int id){
        productos.remove(id);
    }
    
    public Collection<ProductoCarrito> getListado(){
       return productos.values();
    }
    
    public double getTotal(){
        Collection<ProductoCarrito> ps=productos.values();
        double total=0;
        /*en construccion*/

        return total;
    }
}
