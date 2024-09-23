/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_questao3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class For_questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe o numero de n textes que ira fazer: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n;i++){
            System.out.println("digite os valores para a realizar a media ponderada: ");
              double  a = sc.nextDouble();
              double  b = sc.nextDouble();
              double  c = sc.nextDouble();
                
              double  media = (a*2+b*3+c*5)/10;
                System.out.printf("a media e %.1f%n", media);
            }
        sc.close();
        }
    }
    

