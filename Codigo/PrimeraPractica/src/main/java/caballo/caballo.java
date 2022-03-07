/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballo;

/**
 *
 * @author baquiax
 */
public class caballo {

    private String nombre;
    private int noCaballo;

    /**
     * Contructor con nombre y no del cabal
     *
     * @param nombre
     * @param noCaballo
     */
    public caballo(String nombre, int noCaballo) {
        this.nombre = nombre;
        this.noCaballo = noCaballo;
    }

    /**
     * Contructor y no del cabal
     *
     * @param noCaballo
     */
    public caballo(int noCaballo) {
        this.noCaballo = noCaballo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the noCaballo
     */
    public int getNoCaballo() {
        return noCaballo;
    }

    /**
     * @param noCaballo the noCaballo to set
     */
    public void setNoCaballo(int noCaballo) {
        this.noCaballo = noCaballo;
    }

}
