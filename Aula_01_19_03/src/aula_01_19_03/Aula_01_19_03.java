package aula_01_19_03;

import java.util.Scanner;

public class Aula_01_19_03 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);        
        int A, B, C=0;
        double R, S, D;
        
        System.out.print("Digite A: ");
        A = Ler.nextInt();
        while(A<0){
            System.out.print("Invalido! Digite um numero positivo: ");
            A = Ler.nextInt();
        }
        
        do{
            System.out.print("Digite B (POSITIVO): ");
            B = Ler.nextInt();
        }while(B<0);
        
        System.out.print("Digite C (POSITIVO)! ");
        System.out.println("Voce tem 3 tentativas.");
        for(int i=0; i<3; i++){
            C = Ler.nextInt();
            if(C<0){
                System.out.print("Digite Novamente: ");
                C = C*(-1);
            } else{
                i=3;
            }
        }
        
        R = (A+B)*(A+B);
        S = Math.pow((B+C), 2);
        D = (R+S)/2;
        System.out.println("Resposta: "+D);
        
    }
    
}
