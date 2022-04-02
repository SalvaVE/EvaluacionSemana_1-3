/*
Un estudiante  del ITCA tiene 5 evaluaciones en cada ciclo de estudio. La primera evaluación tiene una ponderación
del 25% de la nota final, la segunda evaluación tiene un 15% de la nota final, la tercera evaluación tiene un 15% de la nota
final, la cuarta evaluación tiene un 20% del valor de la nota final y la quinta evaluación tiene un 25% del valor de la nota final.
Si el estudiante obtuvo las siguientes calificaciones:
Parcial 1: 8.0 Parcial 2: 7.5 Parcial 3: 9.0 Parcial 4: 8.0 Parcial 5: 9.0
¿Cuál sería el promedio final del estudiante al final del ciclo?
*/
public class Evaluaciones {
    public static void main (String[] args){
        double E1, E2, E3, E4, E5, PF;
        E1 = 8.0 * 0.25;
        E2 = 7.5 * 0.15;
        E3 = 9.0 * 0.15;
        E4 = 8.0 *0.20;
        E5 = 9.0*.25;
        PF = E1+ E2 + E3 +E4 + E5;
        
       System.out.println("El promedio final del ciclo es: " + PF);
        
        
        
                
               
    }
}
