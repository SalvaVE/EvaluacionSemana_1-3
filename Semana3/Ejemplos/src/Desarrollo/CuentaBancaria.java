
package Desarrollo;

import Desarrollo.Cliente;

public class CuentaBancaria {
    //public static void main(String[] args) {
     long numeroCuenta;
   Cliente propietarioCuenta;
   double saldoCuenta; 
   
   public void abonar(double cantidad){
    saldoCuenta += cantidad;     
   }
   
  public void retirar(double cantidad){
   if(cantidad > saldoCuenta){
       System.out.println("¡Saldo insuficiente!");
       }
   saldoCuenta -= cantidad; // logica del negocio
   }
  public String datosPropietariosCuenta(){
     String informacion = "";
     informacion += "DUI" + propietarioCuenta.duiCliente +"/n";
     informacion += "Nombre" + propietarioCuenta.nombreCliente +"/n";
     informacion += "Telefono" + propietarioCuenta.telefonoCliente +"/n";
       
      return informacion;
   }
  }
   

