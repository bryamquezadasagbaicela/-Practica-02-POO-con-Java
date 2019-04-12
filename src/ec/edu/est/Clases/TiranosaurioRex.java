/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

/**
 *
 * @author 59398
 */
public class TiranosaurioRex extends Terrestre{
    
    private boolean extinto;
    private boolean alimentoCarroño;
    private boolean capacidadSensorial;
    private boolean canibal;

    
    public TiranosaurioRex() {
        
    }
   
    public TiranosaurioRex(boolean extinto, boolean alimentoCarroño) {
        this.extinto = extinto;
        this.alimentoCarroño = alimentoCarroño;
    }

    public TiranosaurioRex(boolean extinto, boolean alimentoCarroño, boolean capacidadSensorial, boolean canibal) {
        this.extinto = extinto;
        this.alimentoCarroño = alimentoCarroño;
        this.capacidadSensorial = capacidadSensorial;
        this.canibal = canibal;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }

    public boolean isAlimentoCarroño() {
        return alimentoCarroño;
    }

    public void setAlimentoCarroño(boolean alimentoCarroño) {
        this.alimentoCarroño = alimentoCarroño;
    }

    public boolean isCapacidadSensorial() {
        return capacidadSensorial;
    }

    public void setCapacidadSensorial(boolean capacidadSensorial) {
        this.capacidadSensorial = capacidadSensorial;
    }

    public boolean isCanibal() {
        return canibal;
    }

    public void setCanibal(boolean canibal) {
        this.canibal = canibal;
    }

    public void cambiarAlimento(){
        
    }
    
    public void modificarExtincion(){
        
    }
    
    public void modificarCapacidadSensorial(){
        
    }
    
    @Override
    public String toString() {
        return "TiranosaurioRex{" + "extinto=" + extinto + ", alimentoCarro\u00f1o=" + alimentoCarroño + ", capacidadSensorial=" + capacidadSensorial + ", canibal=" + canibal + '}';
    }

    @Override
    public void hambre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
