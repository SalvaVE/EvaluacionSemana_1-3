/*1-. Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario Con Descuento, Bandera de Empleado Activo o 
Inactivo)
Métodos:
a) Crear un método para calcular el Salario con Descuento que es Salario Devengado –
b) Descuento del 10% de Renta
c) Crear un método para Imprimir el Nombre Completo del Contribuyente
d) Imprimir Todos los Atributos
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package practica3;

public class Empleados {

    private double NNit;
    private String apellido;
    private String N;
    private String Direccion;
    private double salarioD;
    private double BEmpleado;

    public Empleados() {
    }

    public Empleados(double NNit, String apellido, String N, String Direccion, double salarioD, double BEmpleado) {
        this.NNit = NNit;
        this.apellido = apellido;
        this.N = N;
        this.Direccion = Direccion;
        this.salarioD = salarioD;
        this.BEmpleado = BEmpleado;
    }

    public double getNNit() {
        return NNit;
    }

    public void setNNit(double NNit) {
        this.NNit = NNit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getN() {
        return N;
    }

    public void setN(String N) {
        this.N = N;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getSalarioD() {
        return salarioD;
    }

    public void setSalarioD(double salarioD) {
        this.salarioD = salarioD;
    }

    public double getBEmpleado() {
        return BEmpleado;
    }

    public void setBEmpleado(double BEmpleado) {
        this.BEmpleado = BEmpleado;
    }

    
    public String informacion(Empleados A) {
        String informacion = "";

        informacion += "El numero de NIT es :" + A.getNNit() + "\n";
        informacion += "El nombre del Empleado es : " + A.getN() + "\n";
        informacion += "El apellido del Empleado es : " + A.getApellido() + "\n";
        informacion += "La direccion es : " + A.getDireccion() + "\n";
        informacion += "El salario Devengado es : $" + A.getSalarioD() + "\n";
        informacion += "El empleado es : $" + A.B(A)+ "\n";
        return informacion;
    }
    
    public double DRenta(Empleados A){
        double renta=0;
        renta =A.getSalarioD()- (A.getSalarioD() * 0.10);
        return renta;
    }
    public double B(Empleados A){
        if (A.getBEmpleado() == 1) {
            System.out.println("El empleado es activo");
            return A.getBEmpleado();
        } else if (A.getBEmpleado() == 2) {
            System.out.println("El empleado es inactivo");

            
        }
        return A.getBEmpleado();
    }
    
    public double TE() {
         double b = this.BEmpleado;

        if (b == 1) {
            
            System.out.println("El empleado es activo");
            
            return b;

        }else if(b == 2){
            System.out.println("El empleado es inactivo");
            
        }
        return b;
    } 
}
