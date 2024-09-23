/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_questão1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class For_questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um valor x entre 1 e 1000: ");
        int x = sc.nextInt();
        System.out.println("=====================");
        for(int i=1; i<=x;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
            
        }
        
        
        sc.close();
        
    }
    
}
