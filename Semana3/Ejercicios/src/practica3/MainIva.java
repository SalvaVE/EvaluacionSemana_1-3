/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

public class MainIva {
    public static void main(String[] args) {
        double CIVA = 0.0;
        double CIVA1 = 0.0;
        CIva CalcularIva = new CIva();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el Precio:$ ");
        CalcularIva.setArticuloP(leer.nextDouble());
        System.out.println("Introdusca el IVA : " + "%");
        CalcularIva.setIva(leer.nextDouble());
        System.out.println("--------------Datos Valor Iva-----------------");
        
        CIVA = CalcularIva.calculoIva(CalcularIva.getArticuloP(),CalcularIva.getIva());
        CIVA1 = CalcularIva.calculoIva2(CalcularIva, CalcularIva.getIva());
        
        System.out.println("Precio con IVA : $"+CIVA);
        System.out.println("Precio sin IVA : $"+CIVA1);
    }
}