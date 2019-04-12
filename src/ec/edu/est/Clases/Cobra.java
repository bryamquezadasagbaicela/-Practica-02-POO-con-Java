/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

import ec.edu.est.Interfaz.Acciones;

/**
 *
 * @author 59398
 */
public final class Cobra extends Terrestre implements Acciones {
    
    private boolean invertebrado;
    private boolean venenoso;
    private boolean mudarPiel;
    private boolean sensorInfrarrojo;

   public Cobra(){
       
   }
    
    public Cobra(boolean invertebrado, boolean venenoso) {
        this.invertebrado = invertebrado;
        this.venenoso = venenoso;
    }

    public Cobra(boolean invertebrado, boolean venenoso, boolean mudarPiel, boolean sensorInfrarrojo) {
        this.invertebrado = invertebrado;
        this.venenoso = venenoso;
        this.mudarPiel = mudarPiel;
        this.sensorInfrarrojo = sensorInfrarrojo;
    }

    public boolean isInvertebrado() {
        return invertebrado;
    }

    public void setInvertebrado(boolean invertebrado) {
        this.invertebrado = invertebrado;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isMudarPiel() {
        return mudarPiel;
    }

    public void setMudarPiel(boolean mudarPiel) {
        this.mudarPiel = mudarPiel;
    }

    public boolean isSensorInfrarrojo() {
        return sensorInfrarrojo;
    }

    public void setSensorInfrarrojo(boolean sensorInfrarrojo) {
        this.sensorInfrarrojo = sensorInfrarrojo;
    }
    
    public void envenenar(){
        
    }

    public void mudarPiel(){
        
    }
    
    public void modificarSensorInfrarrojo(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()+"Cobra{" + "invertebrado=" + invertebrado + ", venenoso=" + venenoso + ", mudarPiel=" + mudarPiel + ", sensorInfrarrojo=" + sensorInfrarrojo + '}';
    }

    @Override
    public void hambre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
