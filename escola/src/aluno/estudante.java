/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

/**
 *
 * @author VITOR
 */
public class estudante {
     public String nome;
    public double semestre1;
    public double semestre2;
    public double semestre3;
    
    public double semestrefinal(){
        return semestre1+ semestre2+semestre3;
   
    }
     public double faltampontos(){
       if(semestrefinal()<60.0){
           return 60.0-semestrefinal();
       }else{
           return 0.0;
       }
}
}