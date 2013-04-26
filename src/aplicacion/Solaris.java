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
public class Solaris extends ClasePadre{
    Random r= new Random();

public Solaris(String version,String ram,String bits){
    
    super(version,ram,bits);               
    }
     @Override
    public String pantallazoAzul() {
    String pantallazo = "";
    int num=r.nextInt(0-100)+1;
    if (num < 10){
        pantallazo="Pantallazo azul";
    }
    else {
        pantallazo = "No hay pantallazo azul";
    }
    return pantallazo;
   }
    @Override
    public String buscarVirus() {
    String buscarVirus = "";
    int num=r.nextInt(0-100)+1;
    if (num < 30){
        buscarVirus="Virus detectado";
    }
    else {
        buscarVirus = "Sistema limpio de virus";
    }
    return buscarVirus;
    }   
}
