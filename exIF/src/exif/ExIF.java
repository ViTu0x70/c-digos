/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exif;

import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um numero inteiro: ");
        int x = sc.nextInt();
    
        
        if(x<0){
            System.out.println("este numero e negativo");
        }else{
            System.out.println("este numero e positivo");
        }
        sc.close();
    }
    
}
