/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author kevin
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try{
           String ValorNumerico = "16s";
           int numero = Utilitario.convertir(ValorNumerico);
           System.out.println("El numero es: "+numero);
           
       }catch (MiExcepcionNumerica ex) {
            System.err.println(ex.getMessage());
            
       }catch(MiExcepcionGenerica ex){
           System.err.println(ex.getMessage());
       }
          
    }
    
}
