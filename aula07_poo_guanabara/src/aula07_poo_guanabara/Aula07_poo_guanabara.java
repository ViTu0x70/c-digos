/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07_poo_guanabara;

/**
 *
 * @author VITOR
 */
public class Aula07_poo_guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lutador l[] = new lutador[6];
                
        l[0] = new lutador("pretty boy","franca",31,1.75f,68.9f,11,2,1);
        l[1] = new lutador("ptscript","brasil",29,1.68f,57.8f,14,2,3);
        l[2] = new lutador("snapshadow","eau",35,1.65f,80.9f,12,2,1);
        l[3] = new lutador("dead code","australia",28,1.93f,81.6f,13,0,2);
        l[4] = new lutador("ufocboll","brasil",37,1.70f,119.3f,5,4,3);
        l[5] = new lutador("nerdaart","eua",30,1.81f,105.7f,12,2,4);
       
        //l[0].aprensentar();
        //l[1].aprensentar();
       // l[2].aprensentar();
        //l[3].aprensentar();
        //l[4].aprensentar();
        //l[5].aprensentar();
        
      // l[0].status();
        //l[1].status();
        //l[2].status();
       // l[3].ganharluta();
        //l[3].perderluta();
        //l[3].empatarluta();
       // l[3].setPeso(10f);
      //l[3].status();
        //l[4].status();
      //  l[5].status();
      
     Luta UEC01 = new Luta();
     UEC01.marcarLuta(l[4], l[5]);
     UEC01.lutar();
     //l[0].status();
     //l[1].status();
    }       
}
