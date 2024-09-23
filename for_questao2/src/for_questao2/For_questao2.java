/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_questao2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class For_questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um valor inteiro para n ");
        
        int n = sc.nextInt();
        int in = 0;
	int out = 0;
        for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
        System.out.println(in + " in");
		System.out.println(out + " out");
		
        sc.close();
    }
    
}
