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
public class Megalodon extends Acuatico {
    
    private boolean depredadorSolitario;
    private int numeroIlerasDientes;
    private boolean canibal;
    private boolean extinto;

    public Megalodon(){
        
    }
    
    public Megalodon(boolean depredadorSolitario, int numeroIlerasDientes) {
        this.depredadorSolitario = depredadorSolitario;
        this.numeroIlerasDientes = numeroIlerasDientes;
    }

    public Megalodon(boolean depredadorSolitario, int numeroIlerasDientes, boolean canibal, boolean extinto) {
        this.depredadorSolitario = depredadorSolitario;
        this.numeroIlerasDientes = numeroIlerasDientes;
        this.canibal = canibal;
        this.extinto = extinto;
    }

    public boolean isDepredadorSolitario() {
        return depredadorSolitario;
    }

    public void setDepredadorSolitario(boolean depredadorSolitario) {
        this.depredadorSolitario = depredadorSolitario;
    }

    public int getNumeroIlerasDientes() {
        return numeroIlerasDientes;
    }

    public void setNumeroIlerasDientes(int numeroIlerasDientes) {
        this.numeroIlerasDientes = numeroIlerasDientes;
    }

    public boolean isCanibal() {
        return canibal;
    }

    public void setCanibal(boolean canibal) {
        this.canibal = canibal;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }

    public void agregarManada(){
        
    }
    
    public void cambiarDientes(){
        
    }
    
    public void modificarExtincion(){
        
    }
    
    @Override
    public String toString() {
        return "Megalodon{" + "depredadorSolitario=" + depredadorSolitario + ", numeroIlerasDientes=" + numeroIlerasDientes + ", canibal=" + canibal + ", extinto=" + extinto + '}';
    }

    @Override
    public void sangreFria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
