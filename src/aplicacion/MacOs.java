/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Random;

/**
 *
 * @author DAM
 */
public class MacOs extends ClasePadre{

    public MacOs(String version, String ram, String bits) {
        super(version, ram, bits);
    }
    @Override
    public String buscarVirus() {
        Random r = new Random ();
        int random = r.nextInt(100)+1;
        if (random<=15){
            return "Se han encontrado virus";
        }
        return "No se han encontrado virus";
    }

    @Override
    public String pantallazoAzul() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
