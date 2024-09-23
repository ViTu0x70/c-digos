/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_questao4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class For_questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe a quantidade de  n vezes que deseja: ");
        
        int n = sc.nextInt();
        
        for(int i=0; i<n;i++){
            System.out.println("informe os valores ");
           int numerador = sc.nextInt();
            int denominador = sc.nextInt();
             if( denominador == 0){
                 System.out.println("divisao impossivel "); 
             }else{
                 double divisao = (double)numerador/denominador;
                 System.out.printf("o resultado %.1f%n", divisao);
                 System.out.println("");
             }
        }
                sc.close();

    }
           

}
