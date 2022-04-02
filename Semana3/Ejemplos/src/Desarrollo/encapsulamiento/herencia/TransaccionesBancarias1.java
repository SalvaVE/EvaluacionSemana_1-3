/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo.encapsulamiento.herencia;

import Desarrollo.encapsulamiento.herencia.CuentaBancaria1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class TransaccionesBancarias1 {
    public static void main(String[] args) {
        CuentaBancaria1 cuenta = new CuentaBancaria1();
       BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
       double abonoCuenta, cargoCuenta;
       try{
           System.out.println("Dui del cliente:");
           long numDui = Long.parseLong(leer.readLine());
           System.out.println("Nombre del cliente:");
           String nombres = leer.readLine();
            System.out.println("Telefono del cliente:");
           String telefono =leer.readLine();
           
           //Ingresar valores de prueba
           System.out.println("Ingresar el bono a la cuenta: ");
           abonoCuenta = Double.parseDouble(leer.readLine());
           System.out.println("Ingresar el cargo a la cuenta: ");
           cargoCuenta = Double.parseDouble(leer.readLine());
           
           //Asignar los valores de los atributos heredados
        cuenta.setNumDui(numDui);
         cuenta.setNomCliente(nombres);
         cuenta.setTelCliente(telefono);
           
           //Signar valores metodo set
           cuenta.setAbonoCuenta(abonoCuenta);
           cuenta.setCargoCuenta(cargoCuenta);
           cuenta.setSaldoCuenta();
           
           //Retornar valores del metodo get de la clase heredada
           System.out.println("Numero de DUI: " + cuenta.getNumDui());
           System.out.println("Nombre del cliente: " + cuenta.getNomCliente());
           System.out.println("Telefono del cliente: "+ cuenta.getTelCliente());
           
           //Retornar valores metodo get
           System.out.println("Abono: " + cuenta.getAbonoCuenta());
           System.out.println("Cargo: " + cuenta.getCargoCuenta());
           System.out.println("Saldo: " + cuenta.getSaldoCuenta());
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
