/*
3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de tener definidos dos métodos que 
reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012. 
a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
 */
package practica3;

public class FFecha {

    private int dia;
    private int mes;
    private int año;

   
    public FFecha() {
    }

    
    public FFecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    
    public void setDia(int d) {
        dia = d;
    }
    public void setMes(int m) {
        mes = m;
    }
    public void setAño(int a) {
        año = a;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }

    
    public String Fecha() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("");
        sb.append(año);
        return sb.toString();
    }
    public String Fecha1() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(año);
        return sb.toString();
    }
    
    public String Fecha2() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("/");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("/");
        sb.append(año);
        return sb.toString();
    }
} //Fin de la clase Fecha



