/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        String fecha2;
        String fecha3;
        String fecha4;
        

        //Se pide por teclado el dia, mes y año
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();

        
        FFecha fecha = new FFecha(d,m,a);

        fecha2 = fecha.Fecha();
        System.out.println("Fecha introducida: " + fecha2);
        
        fecha3 = fecha.Fecha1();
           
            System.out.println("Fecha introducida: " + fecha3);
            fecha4 = fecha.Fecha2();
           
            System.out.println("Fecha introducida: " + fecha4);

           
    }
}