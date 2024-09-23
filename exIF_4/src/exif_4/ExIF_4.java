/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exif_4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class ExIF_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("escreva o codigo e a quantidade do item que deseja comprar para comer: ");
          Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
          
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        
        if(codigo == 1){
            float custo = (float) (quantidade*4.00);
            System.out.printf("seu pedido e cachorro quente e custara = R$ %.2f%n ", custo);
        }
         if(codigo == 2){
            float custo = (float) (quantidade*4.50);
            System.out.printf("seu pedido e x-salada e custara = R$ %.2f%n ", custo);
        }
          if(codigo == 3){
            float custo = (float) (quantidade*5.00);
            System.out.printf("seu pedido e x-bacon e custara = R$ %.2f%n ", custo);
        }
           if(codigo == 4){
            float custo = (float) (quantidade*2.00);
            System.out.printf("seu pedido e torrada simples e custara = R$ %.2f%n ", custo);
        }
            if(codigo == 5){
            float custo = (float) (quantidade*1.50);
            System.out.printf("seu pedido e refrigerante e custara = R$ %.2f%n ", custo);
        }
    }
    
}
