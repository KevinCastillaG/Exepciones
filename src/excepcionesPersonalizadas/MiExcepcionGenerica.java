/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author kevin
 */
public class MiExcepcionGenerica extends Exception{

    private final static String MESSAGE= ""+
            "Estes es una excepcion genera y no sabemos la causa";
    
    public MiExcepcionGenerica() {
        super(MESSAGE);
    }
    
    
    
}
