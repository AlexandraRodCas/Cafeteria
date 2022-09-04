/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria_229949;

/**
 *
 * @author Ale
 */
public abstract class Beverage {
    String descripcion = "La bebida contiene: ";
    
    public String getDescription(){
        return descripcion;
    }
    public abstract double Costo();
}
