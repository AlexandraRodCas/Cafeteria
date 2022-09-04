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
public class Mocha extends CondimentDecorator{
    Beverage bebida;
            
    /**
     * Constructor del decorador
     * @param bebida
     */
    public Mocha(Beverage bebida){
        this.bebida = bebida;
    }
    
    /**
     * Método que regresa la descripción del decorador
     * @return el nombre del decorador
     */
    @Override
    public String getDescription(){
        return bebida.getDescription()+ ", Mocha";
    }
    
    /**
     * Método que regresa el costo del decorador
     * @return el costo del decorador
     */
    @Override
    public double Costo(){
        return bebida.Costo() + 10.00;
    }
}