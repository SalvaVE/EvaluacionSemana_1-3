
package practica3;

import java.util.Scanner;


public class MainCasaN {
    public static void main(String[] args) {
        String NumeroC = "";
        CasaN CasaNum = new CasaN();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca el numero de casa :");
        CasaNum.setCasanN(Integer.parseInt(leer.nextLine()));
        System.out.println("Introdusca el numero de Pasaje :");
        CasaNum.setPasajeN(Integer.parseInt(leer.nextLine()));
        System.out.println("Introdusca el nombre de la calle :");
        CasaNum.setCalleN(leer.nextLine());
        System.out.println("--------------------------------------");
        
        NumeroC = CasaNum.infoCasaN();
        
        System.out.println(""+NumeroC);
    }
}
