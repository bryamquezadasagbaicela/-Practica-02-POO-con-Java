/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

/**
 *
 * @author Quezada Bryam
 */
public class Carnivoro {

    /**
     * declaro las variables de Carnivoro
     */
    private String nombre;
    private String tipoReproduccion;
    private String sexo;
    private String termino;

    /**
     * creacion de los constructores
     */
    public Carnivoro() {

    }

    public Carnivoro(String nombre, String tipoReproduccion) {
        this.nombre = nombre;
        this.tipoReproduccion = tipoReproduccion;
    }

    public Carnivoro(String nombre, String tipoReproduccion, String sexo, String termino) {
        this.nombre = nombre;
        this.tipoReproduccion = tipoReproduccion;
        this.sexo = sexo;
        this.termino = termino;
    }

    /**
     * creacion de los getters y setters
     *
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    /**
     *
     *
     */
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

}
