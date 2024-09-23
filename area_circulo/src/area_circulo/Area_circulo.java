/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_circulo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class Area_circulo {

    
    public static void main(String[] args) {
        System.out.println("escreva o R do circulo para calcular sua area ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        double pi = 3.14159;
        
        double area = pi*(r*r);
        System.out.printf("area = %.4f%n",area);
                
    }
    
}
