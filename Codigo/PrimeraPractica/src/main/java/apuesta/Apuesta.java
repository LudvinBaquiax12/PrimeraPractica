/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuesta;

/**
 *
 * @author baquiax
 */
public class Apuesta {

    private String nombreApostador;
    private double monto;

    /**
     * @return the nombreApostador
     */
    public String getNombreApostador() {
        return nombreApostador;
    }

    /**
     * @param nombreApostador the nombreApostador to set
     */
    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

}
