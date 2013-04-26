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
public class Windows extends ClasePadre{
    Random r= new Random();
    
    public Windows (String version,String ram,String bits){
        super(version,ram,bits);               
    }
     @Override
    public String pantallazoAzul() {
    String pantallazo = "";
    int num=r.nextInt(0-100)+1;
    if (num < 80){
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
    if (num < 80){
        buscarVirus="Virus detectado";
    }
    else {
        buscarVirus = "Sistema limpio de virus";
    }
    return buscarVirus;
    }
   
   
    public String limpiarVirus() {
    String limpiarVirus = "";
    int num=r.nextInt(0-100)+1;
    if (num < 60){
        limpiarVirus="Sistema limpiado";
    }
    else {
        limpiarVirus = "No se ha podido destruir el virus";
    }
    return limpiarVirus;
    }
    
}
