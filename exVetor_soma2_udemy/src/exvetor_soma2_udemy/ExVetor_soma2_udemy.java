/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetor_soma2_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExVetor_soma2_udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("quantos numeros deseja? ");
        int n= sc.nextInt();
        
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        
        System.out.println("Digite valores para o vetor A ");
         for (int i=0; i<n; i++) {
	    	
	        a[i] = sc.nextInt();
	    }
         System.out.println("Digite valores para o vetor B ");
         for (int i=0; i<n; i++) {
	    	
	        b[i] = sc.nextInt();
         }
       
          
           for (int i=0; i<n; i++) {
	    	
	        c[i] = a[i]+b[i];
           }
             System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }    
		sc.close();
    }
    
}
