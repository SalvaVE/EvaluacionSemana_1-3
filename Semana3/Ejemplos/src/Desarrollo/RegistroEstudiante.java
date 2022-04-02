/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
         try{
             
         System.out.println("Carnet del estudiante: ");
         long carnet = Long.parseLong(leer.readLine());
          System.out.println("Nombres del estudiante: ");
         String nombres = leer.readLine();
         System.out.println("Apellidos del estudiante: ");
         String apellidos = leer.readLine();
         
         est.setCarnetEstudiante(carnet);
         est.setNombresEstudiante(nombres);
         est.setApellidosEstudiantes(apellidos);
         
         System.out.println("<<<Recuperando Valores>>>");
         System.out.println("Carnet: " + est.getCarnetEstudiante());
         System.out.println("Nombres: " + est.getNombresEstudiante());
         System.out.println("Apellidos: " + est.getApellidosEstudiantes());
         }catch(Exception e){
             System.out.println(e.getMessage());
         }                 
    }
}
