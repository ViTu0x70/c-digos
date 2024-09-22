/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09_poo_guanabara;

/**
 *
 * @author VITOR
 */
public class Aula09_poo_guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("pedro",22,"m");
        p[1] = new Pessoa("maria",25,"f");
        
        l[0] = new Livro("aprendendo java","jose da silva",300,p[0]);
        l[1] = new Livro("poo para iniciantes","pedro paulo",500,p[1]);
        l[2] = new Livro("java avançado","maria candido",800,p[0]);
    
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
