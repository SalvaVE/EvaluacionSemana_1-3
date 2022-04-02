/*3-. Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan 
son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los 
datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase 
Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de 
tener un método para imprimir los datos de cada uno de los estudiantes.
 */
package practica3;

import java.util.Hashtable;
import java.util.Scanner;


public class ClaseHashTable {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Hashtable<String,String> estudiante= new Hashtable<String,String>();
        String nombre1;
        double Carrera1;
        
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingrese el numero de carnet : ");
            double carnet = (Double.parseDouble(leer.nextLine()));
            estudiante.put("a" +i,String.valueOf(carnet));
            System.out.println("Ingrese el nombre del estudiante : ");
             String nombre = leer.nextLine();
              System.out.println("Ingrese el codigo de la carrera: ");
            double CCarrera = (Double.parseDouble(leer.nextLine()));
            estudiante.put("a" +i,String.valueOf(CCarrera)); 
             
        }
       
        //System.out.println(estudiante.put("a" +i,String.valueOf(carnet));
        System.out.println(estudiante);
        
    }
}