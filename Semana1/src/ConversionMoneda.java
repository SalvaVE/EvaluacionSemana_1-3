/*
Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: Europa, Reino Unido,
Australia y Canadá. El programa tiene declarada una variable con el valor $100.00 de tipo double y tenemos que
realizar la conversión de dólares a las monedas solicitadas. A continuación se muestra los valores de conversión:
1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá
*/
public class ConversionMoneda {
    public static void main (String[] args){
        
       double Europa, ReinoUnido, Australia, Canada, ValorM;
       
       ValorM =  100;
       Europa = 0.70 * ValorM;
       ReinoUnido = 0.61 * ValorM; 
       Australia = 0.95 * ValorM;
       Canada = 0.97 * ValorM;
       
       System.out.println("La conversion de la moneda de Europa es: " + Europa);
       System.out.println("La conversion de la moneda de Reino Unido es: " + ReinoUnido);
       System.out.println("La conversion de la moneda de Australia es: " + Australia);
       System.out.println("La conversion de la moneda de Canada es: " + Canada);
      
       
      
        
    }
}
