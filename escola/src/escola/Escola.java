/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;
import java.util.Locale;
import java.util.Scanner;
import aluno.estudante;
/**
 *
 * @author VITOR
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

    estudante y = new estudante();
    
    y.nome = sc.nextLine();
    y.semestre1 = sc.nextDouble();
    y.semestre2 = sc.nextDouble();
    y.semestre3 = sc.nextDouble();
    
        System.out.printf("FINAL GRADE: %.2f%n",y.semestrefinal());
        
        if(y.semestrefinal()<60.0){
            System.out.println("falhou ");
System.out.printf("MISSING %.2f POINTS%n", y.faltampontos());       
        }else{
            System.out.println("passou ");
        }    
        sc.close();;
    }
}
