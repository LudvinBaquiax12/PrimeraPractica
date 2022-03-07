package persona;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baquiax
 */
public class Persona {

    private String nombre;
    private int puntaje;
    private int monto;
    private int[] apuestas;

    /**
     * Constructor de una persona con sus datos
     *
     * @param nombre
     * @param puntaje
     * @param monto
     * @param apuestas
     */
    public Persona(String nombre, int puntaje, int monto, int[] apuestas) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.monto = monto;
        this.apuestas = apuestas;
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
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the apuestas
     */
    public int[] getApuestas() {
        return apuestas;
    }

    /**
     * @param apuestas the apuestas to set
     */
    public void setApuestas(int[] apuestas) {
        this.apuestas = apuestas;
    }

    @Override
    public String toString() {
        return nombre + "," + monto + "," + Arrays.toString(apuestas);
    }

}
