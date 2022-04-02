/*Si un trabajador de la empresa privada está afiliado a las AFP y los porcentajes que se paga a las AFP es de 6% por parte del
trabajador y 6.5% por parte del empleador, si el empleado gana $500 al mes, ¿Cuánto está pagando a la AFP el trabajador en
concepto de empleado y de empleador?*/
public class AFPt {
    public static void main (String[] args){
        double AFP = 0.06;
        double emp = 0.065;
        double empleadoP, empleadorP, pagoF;
        
        empleadoP = 500 * AFP;
        empleadorP = 500 * emp;
        pagoF = empleadoP + empleadorP;
        
        
        System.out.println("El trabajador en concepto de empleado y empleador paga: $" + pagoF);
        
    }
}
