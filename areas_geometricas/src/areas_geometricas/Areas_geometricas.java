/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areas_geometricas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class Areas_geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       

        System.out.println("escreva valores para A");
        double a = sc.nextDouble();
         System.out.println("escreva valores para B");
         float b = sc.nextFloat();
          System.out.println("escreva valores para C");
          float c = sc.nextFloat();
          
          double triangulo = (a*c)/2;
          double circulo = (float) 3.14159*(c*c);
          double trapezio = ((a+b)*c)/2;
          double quadrado = b*b;
          double retangulo = a*b;
        System.out.printf("a area do triangulo de base a e altura C e = %.3f%n ",triangulo);  
        System.out.printf("a area do circulo de raio c e = %.3f%n ",circulo); 
        System.out.printf("a area do trapezio de base maior A, base menor B e altura c e = %.3f%n ",trapezio); 
        System.out.printf("a area do quadrado de lado b e = %.3f%n ",quadrado); 
        System.out.printf("a area do retangulo de lado A, lado B  e = %.3f%n ",retangulo); 
        
          
          
       
    }
    
}
