/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo.encapsulamiento.herencia;

import Desarrollo.encapsulamiento.herencia.ClienteBanco1;

public class CuentaBancaria1 extends ClienteBanco1 {   
    private long numCuenta;
     private double cargoCuenta;
    private double abonoCuenta;
    private double saldoCuenta;
    private char estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return cargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.cargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta() {
        this.saldoCuenta = saldoCuenta + this.abonoCuenta - this.cargoCuenta;
    }

    public char getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(char estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
   
}
