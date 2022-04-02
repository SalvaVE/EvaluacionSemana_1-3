/*
 2-. Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Cuenta, Lectura actual del medidor, Lectura anterior del medidor, Multiplicador, Consumo Mensual, Consumo 
Diario, Valor Factura)
Métodos:
a) Crear un método para calcular el Consumo en el mes
b) Crear un método para calcular el Consumo Diario
c) Crear un método para calcular el Valor Factura
d) Imprimir Todos los Atributos
Ejemplo del cálculo:
Lectura Anterior: 2010 Lectura Actual: 3025
Multiplicador: 10 Días de facturación: 30
Consumo: (lectura actual - lectura anterior) x el multiplicador
Consumo = (3025kWh 2010kWh) * 10 = 10150kWh
Valor factura = Consumo * 0.20
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package practica3;

public class FacturaE {
    double NC;
    double lecActual_kwh;
    double lecAnterior_kwh;
    double multiplicador;
    double consumoMen;
    double consumoDia;
    double valorFactura;

    public FacturaE() {
    }

    public FacturaE(double NC, double lecActual_kwh, double lecAnterior_kwh, double multiplicador, double consumoMen, double consumoDia, double valorFactura) {
        this.NC = NC;
        this.lecActual_kwh = lecActual_kwh;
        this.lecAnterior_kwh = lecAnterior_kwh;
        this.multiplicador = multiplicador;
        this.consumoMen = consumoMen;
        this.consumoDia = consumoDia;
        this.valorFactura = valorFactura;
    }

    public double getNC() {
        return NC;
    }

    public void setNC(double NC) {
        this.NC = NC;
    }

    public double getLecActual_kwh() {
        return lecActual_kwh;
    }

    public void setLecActual_kwh(double lecActual_kwh) {
        this.lecActual_kwh = lecActual_kwh;
    }

    public double getLecAnterior_kwh() {
        return lecAnterior_kwh;
    }

    public void setLecAnterior_kwh(double lecAnterior_kwh) {
        this.lecAnterior_kwh = lecAnterior_kwh;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMen() {
        return consumoMen;
    }

    public void setConsumoMen(double consumoMen) {
        this.consumoMen = consumoMen;
    }

    public double getConsumoDia() {
        return consumoDia;
    }

    public void setConsumoDia(double consumoDia) {
        this.consumoDia = consumoDia;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

  public String DatosF (FacturaE a){
    String  info = "";
      System.out.println("Lectura actual del medidor:" + a.getLecActual_kwh() );
      System.out.println("Lectura anterior del medidor:" + a.getLecAnterior_kwh());
      System.out.println("Multiplicador:" + a.getMultiplicador());
      System.out.println("Consumo mensual:" + a.getConsumoMen());
      System.out.println("Consumo diario:" + a.valFact(a));
      System.out.println("Valor de la factura" + a.consuMens(a) );
     
      return info;
   }
    
    public double valFact(FacturaE a){
        double consumo = (this.lecActual_kwh - this.lecAnterior_kwh)*this.multiplicador;
        double valorFactura;
        valorFactura = consumo * 0.20;
        return valorFactura;
    }
    
     public double consuMens( FacturaE a){
        double consumo = (this.lecActual_kwh - this.lecAnterior_kwh)* this.multiplicador;
        double valorDeFactura = consumo * 0.20;
        double consumoMen = valorDeFactura * this.consumoMen;
        return consumoMen;
    }
}

