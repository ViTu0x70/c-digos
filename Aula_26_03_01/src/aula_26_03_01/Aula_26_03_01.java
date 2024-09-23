package aula_26_03_01;

import java.util.Scanner;

public class Aula_26_03_01 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        float numero;
        float Maior = Integer.MIN_VALUE;
        float Menor = Integer.MAX_VALUE;
        for(int i=1; i<6; i++){
            do{
                System.out.print("Digite um numero Positivo ("+i+" Elemento): ");
                numero = Ler.nextFloat();
            }while(numero<0);
            if(numero > Maior){
                Maior = numero;
            }
            if(numero < Menor){
                Menor = numero;
            }
        }
        System.out.println("Maior: "+Maior);
        System.out.println("Menor: "+Menor);
    }
    
}







