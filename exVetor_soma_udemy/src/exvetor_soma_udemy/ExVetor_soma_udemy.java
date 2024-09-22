/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetor_soma_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExVetor_soma_udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("quantos numeros deseja? ");
        int n= sc.nextInt();
        double soma, media;
        
        int[] vetor = new int[n];
        
         for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }
         
         soma = 0;
        for (int i=0; i<n; i++) {
	    	soma = soma + vetor[i];
	    }
     media = soma / n;

		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }

	    System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);

		sc.close();
	}
}