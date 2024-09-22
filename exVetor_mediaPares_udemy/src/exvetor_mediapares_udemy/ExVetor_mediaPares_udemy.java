/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetor_mediapares_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExVetor_mediaPares_udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("quantos numeros deseja? ");
        int n= sc.nextInt();
        int soma = 0;// Para armazenar a soma dos números pares
        int total = 0;// Para contar a quantidade de números pares
        
        
         double[] vetor = new double[n];
        
         for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }
       
        // Verifica os números pares e calcula a soma e a quantidade
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) { // Verifica se o número é par
                soma += vetor[i]; // Adiciona à soma dos pares
                total++; // Incrementa a contagem de pares
            }
        }
        
        
            if (total >0){
              double mediaPares = soma/total;
              System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
    }  else {
            System.out.println("NENHUM NUMERO PAR DIGITADO");
        }
        
        sc.close();
        
}
}