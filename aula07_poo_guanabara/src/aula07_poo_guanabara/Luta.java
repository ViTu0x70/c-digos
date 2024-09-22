/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07_poo_guanabara;

import java.util.Random;

public class Luta {
    //atributos
    private lutador desafiado;
    private lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos públicos
    public void marcarLuta(lutador l1,lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }    
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println(" ### DESAFIADO ###");
            this.desafiado.aprensentar();
            System.out.println(" ### DESAFIANTE ###");
            this.desafiante.aprensentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
             System.out.println(" ===== resultado da luta =====");
            switch(vencedor){
                case 0: //empate
                    System.out.println("EMPATOU");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1: // desafiado vence
                    System.out.println(" vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
                case 2: //desafiante vence
                    System.out.println(" vitório do "+ this.desafiante.getNome());
                    this.desafiado.perderluta();
                    this.desafiante.ganharluta();
                    break;
            }
            System.out.println("=================================");
        }else{
            System.out.println(" a luta não pode acontecer ");
        }
    }
    //métodos especiais

    public lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
