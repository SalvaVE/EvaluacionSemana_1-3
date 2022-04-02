/*2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que 
calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA 
a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el 
precio del artículo sin IVA.
 */
package practica3;

public class CIva {
    private double precArt;
    private double ArticuloP;
    private double IVA;

    public CIva(){
        
    }
   

    public CIva(double ArticuloP, double IVA) {
        this.ArticuloP = ArticuloP;
        this.IVA = IVA;
    }
    
    public double getArticuloP() {
        return ArticuloP;
    }

    public void setArticuloP(double ArticuloP) {
        this.ArticuloP = ArticuloP;
    }

    public double getIva() {
        return IVA;
    }

    public void setIva(double IVA) {
        this.IVA = IVA;
    }

    public double getprecArt() {
        return precArt;
    }

    public void setprecArt(double precArt) {
        this.precArt = precArt;
    }
    
    
    
    double calculoIva(double precArticulo, double iva1){
        double precio = precArticulo+(precArticulo * iva1);
        return precio;
    }
    
    double calculoIva2(CIva preiva, double iva){
        double precio1 = preiva.getArticuloP();
        iva = this.ArticuloP * this.IVA;
      double precio =  preiva.calculoIva(precio1, preiva.getIva()) - iva;
        return precio;
    }
    
}
