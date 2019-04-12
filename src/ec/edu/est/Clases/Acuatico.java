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
public class Acuatico extends Carnivoro {
    
    private int numeroAletas;
    private boolean aguaSalada;
    private int numeroEspinas;
    private boolean venenoso;

    public Acuatico(){
        
    }
    
    public Acuatico(int numeroAletas, boolean aguaSalada) {
        this.numeroAletas = numeroAletas;
        this.aguaSalada = aguaSalada;
    }

    public Acuatico(int numeroAletas, boolean aguaSalada, int numeroEspinas, boolean venenoso) {
        this.numeroAletas = numeroAletas;
        this.aguaSalada = aguaSalada;
        this.numeroEspinas = numeroEspinas;
        this.venenoso = venenoso;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public boolean isAguaSalada() {
        return aguaSalada;
    }

    public void setAguaSalada(boolean aguaSalada) {
        this.aguaSalada = aguaSalada;
    }

    public int getNumeroEspinas() {
        return numeroEspinas;
    }

    public void setNumeroEspinas(int numeroEspinas) {
        this.numeroEspinas = numeroEspinas;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void cambiarAgua(){
        
    }
    
    public void perderEspina(){
        
    }
    
    public void envenenar(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Acuatico{" + "numeroAletas=" + numeroAletas + ", aguaSalada=" + aguaSalada + ", numeroEspinas=" + numeroEspinas + ", venenoso=" + venenoso + '}';
    }
    
    
}
