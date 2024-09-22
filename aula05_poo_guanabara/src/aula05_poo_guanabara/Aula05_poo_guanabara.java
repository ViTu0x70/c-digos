/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05_poo_guanabara;

/**
 *
 * @author VITOR
 */
public class Aula05_poo_guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.setNumconta(1111);
      p1.setDono("vitor");
      p1.abrirconta("cc");
      
      ContaBanco p2 = new ContaBanco();
      p2.setNumconta(2222);
      p2.setDono("agata");
      p2.abrirconta("cp");
      
      p1.depositar(100);
      p2.depositar(500);
      p2.sacar(1000);
      
      //*p1.sacar(150);
      p1.fecharconta();
      p2.fecharconta();
     
      
      p1.estadoatual();
      p2.estadoatual();
    }
    
}
