/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import entidade.conta;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VITOR
 */
public class programa {
       
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta Conta;
    
        System.out.print("entre com o numero da conta: ");
        int number = sc.nextInt();
        System.out.print("entre com o titular da contar: ");
        sc.nextLine();
        String titular = sc.nextLine();
        
        
        System.out.print("tem um deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 's'){
            System.out.print("entre com o valor do deposito inicial: ");
            double depositoincial = sc.nextDouble(); 
            Conta = new conta(number,titular,depositoincial);
        }else{
            Conta = new conta(number,titular);
        }
        System.out.println("");
        System.out.println("dados da conta: ");
        System.out.println(Conta);
        
        System.out.println("");
        System.out.print("entre com um valor para deposito: ");
        double valor_deposito = sc.nextDouble();
        Conta.deposito(valor_deposito);
        
        System.out.println("atualizacao da conta: ");
        System.out.println(Conta);
        
         System.out.println("");
        System.out.print("entre com um valor para saque: ");
        double valor_saque = sc.nextDouble();
        Conta.sacar(valor_saque);
        
        System.out.println("atualizacao da conta: ");
        System.out.println(Conta);
        
        sc.close();
    }
}
