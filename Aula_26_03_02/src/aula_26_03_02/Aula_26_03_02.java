package aula_26_03_02;

import java.util.Scanner;

public class Aula_26_03_02 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int Numero, op;
        
        System.out.print("Digite o numero que deseja realizar a operacao: ");
        Numero = Ler.nextInt();
        
        System.out.println("Informe a operacao desejada:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("X - Sair");
        op = Ler.nextInt();
        
        switch(op){
            case 1:
                SOMAR(Numero);
                break;
            case 2:
                SUBTRAIR(Numero);
                break;
            case 3:
                MULTIPLICAR(Numero);
                break;
            case 4:
                DIVIDIR(Numero);
                break;
            default:
                System.out.println("SAIR");
                break;
        }
    }
    // FORA DA MAIN
    public static void SOMAR(int x){
        int resultado;
        for(int i=1; i<11; i++){
            resultado = x+i;
            System.out.println(x+" + "+i+" = "+resultado);
        }
    }
    
    public static void SUBTRAIR(int x){
        int resultado;
        for(int i=1; i<11; i++){
            resultado = x-i;
            System.out.println(x+" - "+i+" = "+resultado);
        }
    }
    
    public static void MULTIPLICAR(int x){
        int resultado;
        for(int i=1; i<11; i++){
            resultado = x*i;
            System.out.println(x+" * "+i+" = "+resultado);
        }
    }
    
    public static void DIVIDIR(int x){
        int resultado;
        for(int i=1; i<11; i++){
            resultado = x/i;
            System.out.println(x+" / "+i+" = "+resultado);
        }
    }
}
