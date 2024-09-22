/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetor_pares_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExVetor_pares_udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("quantos numeros deseja? ");
        int n= sc.nextInt();
        double pares = 0;
        
         int[] vetor = new int[n];
        
         for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }
        System.out.println("NUMEROS PARES:");
        // Loop para verificar e exibir números pares
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) { // Verifica se o número é par
                System.out.print(vetor[i] + " ");
                pares++; // Incrementa a contagem de pares
            }
         
    }
    
    
    }
}
