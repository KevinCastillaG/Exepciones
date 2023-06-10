/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionNumerica;
import excepcionesPersonalizadas.MiExcepcionGenerica;

/**
 *
 * @author kevin
 */
public class Utilitario {
    
    public static int convertir(String numeroEnTexto)
            throws
            MiExcepcionNumerica,
            MiExcepcionGenerica {
        try {
            return Integer.parseInt(numeroEnTexto);
            
        } catch (NumberFormatException e) {
            throw new MiExcepcionNumerica();
        }catch(Exception k){
            throw new MiExcepcionGenerica();
        }
        
    }
    
}
