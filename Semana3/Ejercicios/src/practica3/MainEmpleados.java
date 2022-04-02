
package practica3;

import java.util.Scanner;


public class MainEmpleados {
    public static void main(String[] args) {
        
        String info = "";
        double descuento = 0.0;
        double Bandera;
        Empleados empleado = new Empleados();
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de NIT :");
        empleado.setNNit(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingresa el nombre :");
        empleado.setN(leer.nextLine());
        System.out.println("Ingrese el Apellido :");
        empleado.setApellido(leer.nextLine());
        System.out.println("Direccion del Empleado :");
        empleado.setDireccion(leer.nextLine());
        System.out.println("Salario devengado : ");
        empleado.setSalarioD(leer.nextDouble());
        
        info = empleado.informacion(empleado);
        descuento = empleado.DRenta(empleado);
        
        System.out.println("Escriba si el empleado esta activo o inactivo :");
        System.out.println("------------------------------------");
        empleado.setBEmpleado(leer.nextDouble());
        
        
        Bandera = empleado.TE();
        
        
        
        System.out.println(""+info);
        System.out.println("El salario con descuento de renta es : $"+ descuento);
        System.out.println(Bandera);
        
       
    }
}

