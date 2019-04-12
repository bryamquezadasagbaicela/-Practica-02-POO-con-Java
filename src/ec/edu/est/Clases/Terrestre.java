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
public class Terrestre extends Carnivoro {
    
    private int numeroGarras;
    private int numeroPatas;
    private int numeroDientesCaninos;
    private boolean depredadorSolitario;

    public Terrestre(){
        
    }

    public Terrestre(int numeroGarras, int numeroPatas) {
        this.numeroGarras = numeroGarras;
        this.numeroPatas = numeroPatas;
    }
    
    public Terrestre(int numeroGarras, int numeroPatas, int numeroDientesCaninos, boolean depredadorSolitario) {
        this.numeroGarras = numeroGarras;
        this.numeroPatas = numeroPatas;
        this.numeroDientesCaninos = numeroDientesCaninos;
        this.depredadorSolitario = depredadorSolitario;
    }

    public int getNumeroGarras() {
        return numeroGarras;
    }

    public void setNumeroGarras(int numeroGarras) {
        this.numeroGarras = numeroGarras;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroDientesCaninos() {
        return numeroDientesCaninos;
    }

    public void setNumeroDientesCaninos(int numeroDientesCaninos) {
        this.numeroDientesCaninos = numeroDientesCaninos;
    }

    public boolean isDepredadorSolitario() {
        return depredadorSolitario;
    }

    public void setDepredadorSolitario(boolean depredadorSolitario) {
        this.depredadorSolitario = depredadorSolitario;
    }

    public void cambiarGarra(){
        
    }
    
    public void cambiarDientes() {
        
    }
    
    public void cambiarManada(){
        
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Terrestre{" + "numeroGarras=" + numeroGarras + ", numeroPatas=" + numeroPatas + ", numeroDientesCaninos=" + numeroDientesCaninos + ", depredadorSolitario=" + depredadorSolitario + '}';
    }
    
    
    
}
