/*
Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de
calcular el salario del docente sabiendo que le van a descontar el 10% de la renta. ¿Cuánto ganara el docente al final de
un mes de clases menos el descuento de la renta?
*/
public class Renta {
    public static void main (String[] args){
        
        double salarioHora, tiempo, Stotal, renta, totalR, totalF;
        
       salarioHora = 8.00;
       tiempo = 36;
       Stotal = 8.00 * 36;
       renta = 0.1;
       totalR = Stotal * renta;
       totalF = Stotal - totalR;
       
       System.out.println("El salario sin descuento es: $" + Stotal);
       System.out.println("El descuento es: $" + totalR);  
       System.out.println("El salario con descuento es: $" + totalF);
}
}