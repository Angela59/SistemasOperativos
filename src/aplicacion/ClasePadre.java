/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author DAM
 */
public abstract class ClasePadre {
    String version, ram, bits;

    public ClasePadre(String version, String ram, String bits) {
        this.version = version;
        this.ram = ram;
        this.bits = bits;
    }
    public ClasePadre(){
        this.version = "Sin version";
        this.ram = "Sin RAM";
        this.bits = "Sin bits";
    }
    public String copiar (String copiar){
        return "Se ha copiado el sistema operativo";        
    }
    public String pegar (String pegar){
        return "Se ha pegado el sistema operativo";
    }
    public abstract String buscarVirus();
}
