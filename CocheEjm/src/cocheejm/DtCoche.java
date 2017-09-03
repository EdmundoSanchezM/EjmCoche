/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocheejm;

/**
 * <h1>DtCoche</h1>
 * 
 * <p>Clase abstracta que sirve para cualquier tipo de coche</p>
 * 
 * @author Sanchez Mendez Edmundo Josue
 * @version 1.0.0
 * @since 02-09-2017
 */
public abstract class DtCoche {
    /**
    * <h3>propietario<h3>
    * 
    * Método abstracto para implementar la venta de un coche
    */
    private String Nombrep;

    public abstract void comprar(String Nombrep);

    public String getNombrep() {
        return Nombrep;
    }

    public void setNombrep(String Nombrep) {
        this.Nombrep = Nombrep;
    }
}
