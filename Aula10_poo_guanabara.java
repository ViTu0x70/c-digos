/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10_poo_guanabara;

/**
 *
 * @author VITOR
 */
public class Aula10_poo_guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("pedro");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");
       
        p1.setSexo("m");
        p4.setSexo("f");
        p2.setIdade(18);
        
        p2.setCurso("informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
