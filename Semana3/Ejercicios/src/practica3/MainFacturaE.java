/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

public class MainFacturaE {
    public static void main(String[] args) {
            String factura1;
             double factura2 = 0.0;
        double factura3 = 0.0;
        
        FacturaE factura = new FacturaE();
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca la cantidad de dias a facturar :");
        factura.setConsumoMen(leer.nextDouble());
        System.out.println("Introdusaca el consumo actual en kwh :");
        factura.setLecActual_kwh(leer.nextDouble());
        System.out.println("Introdusca el consumo anterior en kwh :");
        factura.setLecAnterior_kwh(leer.nextDouble());
        System.out.println("La cantidad del multiplicador es :");
        factura.setMultiplicador(leer.nextDouble());
        
        System.out.println("-------------------------------------------");
        factura1 = factura.DatosF(factura);
        factura2 = factura.valFact(factura);
        factura3 = factura.consuMens(factura);
        System.out.println(""+factura1);
        System.out.println(""+factura2);
        
    }
}
