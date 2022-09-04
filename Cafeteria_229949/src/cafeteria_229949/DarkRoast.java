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
public class DarkRoast extends Beverage{
    
    /**
     * Método que regresa la descripción de la bebida base
     * @return el costo del decorador
     */
    @Override
    public String getDescription(){
        return descripcion = "Dark Roast";
    }
    
    /**
     * Método que regresa el costo de la bebida base
     * @return el costo del decorador
     */
    @Override
    public double Costo(){
        return 40.00;
    }

}