/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetor_posicao_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExVetor_posicao_udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("quantos numeros deseja? ");
        int n= sc.nextInt();
        double maior;
        int posicao = 0;
        
         double[] vetor = new double[n];
        
         for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }
         
         System.out.println("maior valor: ");
         maior = vetor[0];
        for (int i = 0; i < n; i++) {
            if( vetor[i]>maior){
                maior = vetor[i];
                posicao = i;
            }
        }
        
        System.out.printf("maior valor =  %.1f\n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        
        sc.close();
    }
    
}
