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
public final class PezPiedra extends Acuatico implements Acciones{
    
    private boolean camuflaje;
    private boolean neurotoxina;
    private boolean resisteFueraAgua;
    private boolean exotico;

    public PezPiedra() {
        
    }
    
    public PezPiedra(boolean camuflaje, boolean neurotoxina) {
        this.camuflaje = camuflaje;
        this.neurotoxina = neurotoxina;
    }

    public PezPiedra(boolean camuflaje, boolean neurotoxina, boolean resisteFueraAgua, boolean exotico) {
        this.camuflaje = camuflaje;
        this.neurotoxina = neurotoxina;
        this.resisteFueraAgua = resisteFueraAgua;
        this.exotico = exotico;
    }

    public boolean isCamuflaje() {
        return camuflaje;
    }

    public void setCamuflaje(boolean camuflaje) {
        this.camuflaje = camuflaje;
    }

    public boolean isNeurotoxina() {
        return neurotoxina;
    }

    public void setNeurotoxina(boolean neurotoxina) {
        this.neurotoxina = neurotoxina;
    }

    public boolean isResisteFueraAgua() {
        return resisteFueraAgua;
    }

    public void setResisteFueraAgua(boolean resisteFueraAgua) {
        this.resisteFueraAgua = resisteFueraAgua;
    }

    public boolean isExotico() {
        return exotico;
    }

    public void setExotico(boolean exotico) {
        this.exotico = exotico;
    }
    
    public void controlarNeurotoxina(){
        
    }
    
    public void modificarCamuflaje(){
        
    }
    
    public void cambiarAgua(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"PezPiedra{" + "camuflaje=" + camuflaje + ", neurotoxina=" + neurotoxina + ", resisteFueraAgua=" + resisteFueraAgua + ", exotico=" + exotico + '}';
    }

    @Override
    public void sangreFria() {
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
