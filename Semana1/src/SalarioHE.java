/*
Un trabajador de la industria de la construcción gana $10 diarios en su jornada normal de trabajo. En ciertas ocasiones
el empleado tiene que trabajar horas extras para cumplir con su trabajo. En el mes a acumulado 50 horas extras que se la
pagan al 10% del valor del pago diario. ¿Cuánto ganara el trabajador al final de un mes de trabajo? 
*/
public class SalarioHE {
    public static void main (String[] args){
        
        double salario, horasEx,renta , ExAc, salarioM,SalarioF;
        
        salario = 10;
        horasEx = 50;
        renta = 0.1;
        salarioM = salario * 30;
        ExAc = horasEx * salario * (renta);
        SalarioF = salarioM + ExAc;
        System.out.println("Salario mensual sin H/E: $" + salarioM);
        System.out.println("Total de H/E: $" + ExAc);
        System.out.println("Salario mensual con H/E: $" + SalarioF);
        
}
}