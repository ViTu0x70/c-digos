/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exif_3;

import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExIF_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva a hora que o jogo comeca e quando termina: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == 16 && b == 2){
            System.out.println("o jogo durou 10 horas");
        }
         if(a == 0 && b == 0){
            System.out.println("o jogo durou 24 horas");
        }
         if(a == 2 && b == 16){
            System.out.println("o jogo durou 14 horas");
        }
         sc.close();
    }
    
}
